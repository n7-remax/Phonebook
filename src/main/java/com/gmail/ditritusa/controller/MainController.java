package com.gmail.ditritusa.controller;

import com.gmail.ditritusa.model.Phonebook;
import com.gmail.ditritusa.repository.PhonebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    PhonebookRepository phonebookRepository;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data", phonebookRepository.findAll(PageRequest.of(page, 10)));
        model.addAttribute("currentPage", page);
        model.addAttribute("phonebook", new Phonebook());
        return "index";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("phonebook")Phonebook p, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/";
        } else {

            phonebookRepository.save(p);
            return "redirect:/";
        }
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        phonebookRepository.delete(phonebookRepository.getOne(id));

        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Phonebook> findone(Integer id) {
        return phonebookRepository.findById(id);
    }

}
