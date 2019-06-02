var geocoder;
var map;
var marker;

function initialize() {
    var latlng = new google.maps.LatLng(-23.5489, -46.6388);
    var options = {
        zoom: 5,
        center: latlng,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };

    map = new google.maps.Map(document.getElementById("mapa"), options);

    geocoder = new google.maps.Geocoder();

    marker = new google.maps.Marker({
        map: map,
        draggable: true,
    });

    marker.setPosition(latlng);
}

$(document).ready(function () {
    initialize();

    function carregarNoMapa(endereco) {
        geocoder.geocode({ 'address': endereco + ', Brasil', 'region': 'BR' }, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                if (results[0]) {
                    var latitude = results[0].geometry.location.lat();
                    var longitude = results[0].geometry.location.lng();

                    $('#txtLatitude').val(latitude);
                    $('#txtLongitude').val(longitude);

                    var location = new google.maps.LatLng(latitude, longitude);
                    marker.setPosition(location);
                    map.setCenter(location);
                    map.setZoom(16);
                }
            }
        });
    }

    $(document).ready(function() {

    	var logradouro = $("#rua").val();
        var numero = $("#numero").val();
        var cidade = $("#cidade").val();
        var uf = $("#estado").val();
        
        var endereco = logradouro + ", "+numero+", "+cidade+" - "+uf;

        carregarNoMapa(endereco); // Esse parte. De passar como parametro.
    })
});