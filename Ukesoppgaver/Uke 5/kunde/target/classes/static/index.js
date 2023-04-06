$(function (){
    $("#registrer").click(function (){
        const kunde = {
            navn : $("#navn").val(),
            adresse : $("#adresse").val()
        };
        $.get("/kunde", kunde, function (data){
            $("#utNavn").html(data.navn);
            $("#utAdresse").html(data.adresse);
        });
    });
});