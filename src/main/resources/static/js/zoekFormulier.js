function loadShows() {
    jQuery.get('/voorstellingen', function (data) {
        var shows = data;

        var $table = $('.section-table tbody');
        $table.empty();

        for (var i = 0; i < shows.length; i++) {
            console.log(shows[i]);
            var tijdstip = shows[i].tijdstip.dag + " " + shows[i].tijdstip.tijd;
            var artiest = shows[i].artiest.naam;
            var titel = shows[i].artiest.naamVoorstelling;
            var locatie = shows[i].artiest.locatie.naam;
            var beschikbaar = shows[i].capaciteit;

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + " tickets</td></tr>";

            $table.append(row);
        }
    });
}

$(document).ready(loadShows);

function loadShowsArtist() {
    var artiestInvoer = $('#artiest-invoer').val();

    jQuery.get('/voorstellingen?artiestnaam=' + artiestInvoer, function (data) {
        var shows = data;

        var $table = $('.section-table tbody');
        $table.empty();
        for (var i = 0; i < shows.length; i++) {
            console.log(shows[i]);
            var tijdstip = shows[i].tijdstip.dag + " " + shows[i].tijdstip.tijd;
            var artiest = shows[i].artiest.naam;
            var titel = shows[i].artiest.naamVoorstelling;
            var locatie = shows[i].artiest.locatie.naam;
            var beschikbaar = shows[i].capaciteit;

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + " tickets</td></tr>";

            $table.append(row);
        }
    });
}

$('#artiestbutton').click(loadShowsArtist);

function loadShowsName() {
    var voorstellingInvoer = $('#voorstelling-invoer').val();

    jQuery.get('/voorstellingen?naam=' + voorstellingInvoer, function (data) {
        var shows = data;
        var $table = $('.section-table tbody');
        $table.empty();
        for (var i = 0; i < shows.length; i++) {
            console.log(shows[i]);
            var tijdstip = shows[i].tijdstip.dag + " " + shows[i].tijdstip.tijd;
            var artiest = shows[i].artiest.naam;
            var titel = shows[i].artiest.naamVoorstelling;
            var locatie = shows[i].artiest.locatie.naam;
            var beschikbaar = shows[i].capaciteit;

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + " tickets</td></tr>";

            $table.append(row);
        }
    });
}

$('#voorstellingbutton').click(loadShowsName);

function loadShowsGenre() {
    var genreInvoer = $('#genre-invoer').val();
    jQuery.get('/voorstellingen?artiestgenre=' + genreInvoer, function (data) {
        var shows = data;
        var $table = $('.section-table tbody');
        $table.empty();
        for (var i = 0; i < shows.length; i++) {
            console.log(shows[i]);
            var tijdstip = shows[i].tijdstip.dag + " " + shows[i].tijdstip.tijd;
            var artiest = shows[i].artiest.naam;
            var titel = shows[i].artiest.naamVoorstelling;
            var locatie = shows[i].artiest.locatie.naam;
            var beschikbaar = shows[i].capaciteit;

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + " tickets</td></tr>";

            $table.append(row);
        }
    });
}

$('#genrebutton').click(loadShowsGenre);


