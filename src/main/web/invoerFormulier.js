$(window).on("load", loadArtists());


function loadArtists() {
    /*   jQuery.get('/artiest', function(data) {
           var artiesten = data._embedded.artiesten;
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
    var $select = $('.artiest');
    console.log("test empty select");
    $select.empty();
    for (var i = 0; i < artiesten.length; i++) {
        var $option = $('<option>');
        $option.val(artiesten[i]._links.self.href);
        $option.text(artiesten[i].title);
        $select.append($option);
    }
}

/*);
}*/