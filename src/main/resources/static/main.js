
$(document).ready(function () {

    $('.nBtn, .table .eBtn').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if(text=='Edit') {

            $.get(href, function (phonebook, status) {

                $('.myForm #id').val(phonebook.id);
                $('.myForm #surname').val(phonebook.surname);
                $('.myForm #firstname').val(phonebook.firstname);
                $('.myForm #phonenumber').val(phonebook.phonenumber);

            });

            $('.myForm #exampleModal').modal();
        }else{

            $('.myForm #id').val('');
            $('.myForm #surname').val('');
            $('.myForm #firstname').val('');
            $('.myForm #phonenumber').val('');
            $('.myForm #exampleModal').modal();

        }
        
    });

    $('.table .delBtn').on('click',function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();

    });
    
});