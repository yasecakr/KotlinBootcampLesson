package com.example.bootcamplessons.object_oriented_programming.composition

 data class Films(var film_id:Int, var film_name:String,
                  var film_year:Int,
                  var category:Categories,
                  var director:Directors) {
}