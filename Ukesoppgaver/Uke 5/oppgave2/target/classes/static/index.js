$(function (){
    $("#beregn").click(function (){
        let belop = $("#belop").val();
        let valutasort = $("#valutasort").val();
        let url = "/valuta?valutasort&belop="+valutasort+"?=" +belop;
        $.get(url, function (data){
           let valuta = belop+ " norske er " +data+ " " +data;
           $("#output").html(valuta);
        });
    });
});