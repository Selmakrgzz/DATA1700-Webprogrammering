$(function (){
    $("#sendInn").click(function (){
        const maaned = $("#maaned").val();
        const url = "temp?maaned="+maaned;
        $.get(url, function (data) {
            let temp = "Temperaturen i " +maaned+ " er " +data+ " C."
            $("#output").html(temp);
        })
    });
});