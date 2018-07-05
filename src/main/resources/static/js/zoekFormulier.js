function loadShows() {
    jQuery.get('/allevoorstellingen', function (data) {
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
    var artiestInvoer = $('input #artiest-invoer').val();
    jQuery.get('/zoekopartiestnaam?naam=' + artiestInvoer, function (data) {
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
//    var invoer = x;
    jQuery.get('/allevoorstellingen', function (data) {
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

$('#artiestbutton').click(loadShowsName);

function loadShowsGenre() {
//    var invoer = x;
    jQuery.get('/allevoorstellingen', function (data) {
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

$('#artiestbutton').click(loadShowsGenre);


