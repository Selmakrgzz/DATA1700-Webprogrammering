$(function (){
    $("#registrer").click(function (){
        //let input = true;
        const bil = {
            merke : $("#merkeInn").val(),
            modell : $("#modellInn").val(),
            aarmodell : $("#aarInn").val(),
            hjuldrift : $("#driftInn").val()
        };

        /*if (merke.value === ""){
            console.log("Skriv inn merke");
        } else {
            console.log("Motatt merke");
        }
        if (modell.value === ""){
            console.log("Skriv inn modell");
        } else {
            console.log("Motatt modell");
        }
        if (aarmodell.value === ""){
            console.log("Skriv inn årmodell");
        } else {
            console.log("Motatt årmodell");
        }
        if (hjuldrift.value === ""){
            console.log("Skriv inn hjuldrift");
        } else {
            console.log("Motatt hjuldrift");
        }

        if (merke.value === "" || modell.value === "" || aarmodell.value === "" || hjuldrift.value === ""){
            input = false;
        }*/

        //if (input){
            $.post("/setBil", bil, function (){
                console.log("Motatt bil");
            });
        //}

        $("#merkeInn").val("");
        $("#modellInn").val("");
        $("#aarInn").val("");
        $("#driftInn").val("");
    });

    $("#visRegister").click(function (){
       mottaData();
    });

    $("#slettRegister").click(function (){
        $.get("/deleteBil", function (data){
            behandleData(data);
        })
    });

    function mottaData(){
        $.get("/getBil", function (data){
            behandleData(data);
        });
    }

    function behandleData(bil){
        let output = "";
        for (let i = 0; i < bil.length; i++){
            output+=bil[i].merke+" "+bil[i].modell+" "+bil[i].aarmodell+" "+bil[i].hjuldrift+ "<br>";
        }
        $("#output").html(output);
    }
});