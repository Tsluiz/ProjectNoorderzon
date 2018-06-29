$(window).on("load", loadArtists(), loadGenres(), loadShowTitle(), loadLocations());


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
    /* for (var i = 0; i < artiesten.length; i++) {
         var $option = $('<option>');
         $option.val(artiesten[i]._links.self.href);
         $option.text(artiesten[i].title);
         $select.append($option);
     }
 }

 /*);
 }*/
}

function loadGenres() {
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
    var $select = $('.genres');
    console.log("test empty genre");
    $select.empty();
    /*   for (var i = 0; i < genres.length; i++) {
            var $option = $('<option>');
            $option.val(genres[i]._links.self.href);
            $option.text(genres[i].title);
            $select.append($option);
        }*/
}

function loadShowTitle() {
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
    var $select = $('.showtitle');
    console.log("test empty showtitle");
    $select.empty();
    /*   for (var i = 0; i < genres.length; i++) {
            var $option = $('<option>');
            $option.val(genres[i]._links.self.href);
            $option.text(genres[i].title);
            $select.append($option);
        }*/
}

function loadLocations() {
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
    var $select = $('.locations');
    console.log("test empty location");
    $select.empty();
    /*   for (var i = 0; i < genres.length; i++) {
            var $option = $('<option>');
            $option.val(genres[i]._links.self.href);
            $option.text(genres[i].title);
            $select.append($option);
        }*/
}