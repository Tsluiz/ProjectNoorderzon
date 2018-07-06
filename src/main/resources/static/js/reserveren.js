function reservering(elementId) {
    console.log('start reservering');
    // var id = $(this).parent().children('input').val();
    var button = document.getElementById(elementId);
    console.log(button);
    var id = button.id;
    // var id = $(this).parent().childNodes[2].val();
    console.log(id);
    id = parseInt(id);
    console.log(id);
    var select = document.getElementById('x' + elementId);
    console.log(aantal);
    var aantal = parseInt(select.value);
    console.log(aantal);
    jQuery.get('/voorstellings/' + id, function (data) {
        console.log(data);
        var capaciteitNew = parseInt(data.capaciteit) - aantal;
        console.log(capaciteitNew);
        data.capaciteit = capaciteitNew;
        if (capaciteitNew >= 0) {
            jQuery.ajax('/voorstellings/' + id, {
                method: 'PUT',
                contentType: 'application/json',
                data: JSON.stringify(data)
            }).done(function () {
                window.alert('Opgeslagen');
            });
            console.log('b');
            jQuery.ajax(data._links.self.href, {
                method: 'PUT',
                contentType: 'application/json',
                data: JSON.stringify({"capaciteit": capaciteitNew})
            });
            console.log('bijna klaar');
            location.reload();
            /*     function stateChange(newState) {
                     setTimeout('', 3000);
                 };
                 stateChange();
                 loadShows();
                 */
        } else {
            window.alert('kies een aantal reserveringen binnen de beschikbaarheid');
        }
    });

}