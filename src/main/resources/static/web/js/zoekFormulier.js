function loadShows() {
    jQuery.get('/allevoorstellingen', function (data) {
        var shows = data;
        /*
        var $div = $('#message');
        var $ul = $('<ul>');
        $div.empty().append($ul);
        for (var i = 0; i < jobs.length; i++) {
            var $li = $('<li>');
            $li.text(jobs[i].minimumSalary + "-" + jobs[i].maximumSalary);
            $li.prepend($('<h1>').text(jobs[i].title));
            $ul.append($li);
        }
        */
        $table = $('.section-table tbody');
        $table.empty();
        for (var i = 0; i < shows.length; i++) {
            console.log(shows[i]);
            var tijdstip = shows[i].tijdstip.dag + " " + shows[i].tijdstip.tijd;
            var artiest = shows[i].artiest.naam;
            var titel = shows[i].artiest.naamVoorstelling;
            var locatie = shows[i].artiest.locatie.naam;
            var beschikbaar = shows[i].capaciteit;

            var row = "<tr><td>" + tijdstip + "</td><td>" + artiest + "</td><td>" + titel + "</td><td>" + locatie + "</td><td>" + beschikbaar + "</td></tr>";

            $table.append(row);
        }
    });
}

$('#artiestbutton').click(loadShows());