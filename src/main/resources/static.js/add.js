$( document ).ready(function () {
            $("#customerForm").submit(function (event) {
            event.preventDefault();
            ajaxPost();
    });
});

function ajaxPost() {

      var trainData = {
      numberTrain : $("#numberTrain").val(),
      station : $("#station").val()
      }

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "http://localhost:8080/train/gettrain",
        data: JSON.stringify(trainData),
        dataType: 'json',
        success: function () {}
        error: function () {}
    });
}

  $( document ).ready(function () {
            $("#searchForm").submit(function (event) {
            event.preventDefault();
            ajaxGet();
     });
});



