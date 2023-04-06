$(function (){
    $("#getStudent").click(function (){
        $.get("/getStudent", function (data){
            $("#utStudent").html(data.navn+ " " +data.studentnr);
        });
    });

    $("#setStudent").click(function (){
        const student = {
            navn : $("#navnInn").val(),
            studentnr : $("#studentnrInn").val()
        };
        $.post("/setStudent", student, function(){
            $("#utMelding").html("Ny student er registrert!");
        });
       $("#navnInn").val("");
       $("#studentnrInn").val("");
    });

    $("#getStudenter").click(function (){
       $.get("/getStudenter", function (data){
           let ut = "";
           for (let i = 0; i < data.length; i++){
               ut+=data[i].navn+ " " +data[i].studentnr+ "<br>";
           }
           $("#utStudenter").html(ut);
       });
    });
});