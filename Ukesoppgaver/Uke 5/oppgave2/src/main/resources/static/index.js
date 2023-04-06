$(function (){
    $("#beregn").click(function (){
        let belop = $("#belop").val();
        let valutasort = $("#valutasort").val();
        let valuta = {
            navn: valutasort,
            kurs: belop
        }
        let url = "/valuta"
        $.post(url,valuta, function (data){
           let valuta = belop+ " norske er " +data+ " " +data;
           $("#output").html(valuta);
        });
    });
});