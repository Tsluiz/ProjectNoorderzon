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
        $table = ('.section-table').empty();
        for (var i = 0; i < shows.length; i++) {
            var $row = $('<tr>');
            var $cell1 = $('<td>');
            $cell1.val(shows[i].id);
            $cell1.text(shows[i].tijd.dag);
            var $cell2 = $('<td>');
            $cell2.val(shows[i].id);
            $cell2.text(shows[i].artiest.name);
            var $cell3 = $('<td>');
            $cell3.val(shows[i].id);
            $cell3.text(shows[i].title);
            var $cell4 = $('<td>');
            $cell4.val(shows[i].id);
            $cell4.text(shows[i].title);
            $table.append($row, $cell1, $cell2, $cell3, $cell4);
        }
    });
}

$('#artiestbutton').click(loadShows());