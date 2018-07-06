function reservering(buttonId) {
    console.log('start reservering');
    // var id = $(this).parent().children('input').val();
    var button = document.getElementById(buttonId);
    var id = button.val();
    // var id = $(this).parent().childNodes[2].val();
    console.log(id);
    id = parseInt(id);
    console.log(id);
    var aantal = $(this).prev('select').val();
    console.log(aantal);

    jQuery.get('/voorstellings/' + id, function (data) {
        console.log(data);
        var capaciteitNew = data.capaciteit - aantal;
        if (capaciteitNew >= 0) {
            jQuery.ajax('/voorstellings/' + id, {
                method: 'PUT',
                contentType: 'application/json',
                data: JSON.stringify(data)
            }).done(function () {
                window.alert('Opgeslagen');
            });
            jQuery.ajax(data.capaciteit, {
                method: 'PUT',
                contentType: 'application/json',
                data: JSON.stringify({"capaciteit": capaciteitNew})
            });
        } else {
            window.alert('kies een aantal reserveringen binnen de beschikbaarheid');
        }
    });
}


$('.reserveer').click(reservering);