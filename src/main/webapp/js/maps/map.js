function myMap() {
  var mapCanvas = document.getElementById("map");
  var mapOptions = {
    center: new google.maps.LatLng(-23.54615, -46.795616), zoom: 15
  };
  var map = new google.maps.Map(mapCanvas, mapOptions);


}