function reservationOptions() {
    var options = '<select>';
    for (var i = 0; i < 11; i++) {
        var option = '<option value="' + i + '">' + i + '</option>';
        options = options + option;
    }
    options = options + '</select>';
    return options;
}


function loadShows() {
    jQuery.get('/voorstellingen', function (data) {
        var shows = data;

        var $table = $('.section-table tbody');
        $table.empty();

        for (var i = 0; i < shows.length; i++) {
            console.log(shows[i]);
            var id = shows[i].id;
            var tijdstip = shows[i].tijdstip.dag.substr(0,3) + " " + shows[i].tijdstip.tijd.replace('.',':');
            var artiest = shows[i].artiest.naam;
            var titel = shows[i].artiest.naamVoorstelling;
            var locatie = shows[i].artiest.locatie.naam;
            var beschikbaar = shows[i].capaciteit;
            var resOptions = reservationOptions();
            var resButton = '<button id="' + id+ '" class="reserveer" onclick="reservering('+id+')">Reserveer</button>';
            var idField = '<input type="text" class="id hidden" value="' + id + '">'+id+'</input>';

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + " tickets</td><td>" + resOptions + resButton + idField +"</td></tr>";

            $table.append(row);
        }
    });
}

$(document).ready(loadShows);

function loadShowsArtist() {
    var artiestInvoer = $('#artiest-invoer').val();

    jQuery.get('/voorstellingen-artiest?naam=' + artiestInvoer, function (data) {
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

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + " tickets</td><td></td></tr>";
            $table.append(row);
        }
    });
}

$('#artiestbutton').click(loadShowsArtist);

function loadShowsName() {
    var voorstellingInvoer = $('#voorstelling-invoer').val();

    jQuery.get('/voorstellingen-naam?naam=' + voorstellingInvoer, function (data) {
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
    console.log('start van fucntion loadShowsGenre');
    var genreInvoer = $('#genre-invoer').val();
    console.log(genreInvoer);
    jQuery.get('/voorstellingen-genre?genre=' + genreInvoer, function (data) {
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


