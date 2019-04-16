/**
 * 
 */


$(document).ready(function() {
	var form = $("#cadastro-medico");

	form.children("wizard").steps({
		headerTag : "h2",
		bodyTag : "section",
		transitionEffect : "slideLeft"
			onStepChanging: function (event, currentIndex, newIndex)
			{
				form.validate().settings.ignore = ":disabled,:hidden";
				return form.valid();
			},
			onFinishing: function (event, currentIndex)
			{
				form.validate().settings.ignore = ":disabled";
				return form.valid();
			},
			onFinished: function (event, currentIndex)
			{
				alert("Submitted!");
			}
	});
});



$().ready(function(){
	$("#cadastro-medico").validate({
		rules: {
			email: {
				required: true,
				email: true,
			},
		},
		messages: {
			email: {
				required: "Por favor, digite um e-mail"
			}
		}
	});
});