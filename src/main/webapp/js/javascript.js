/* ClickMed personal JavaScript
 * 
 */

$(document).ready(function() {
	
	
	/* Chamada e configurações do Steps e Validate */
	var form = $("#cadastro-medico");

	form.children("div").steps({
		headerTag : "h2",
		bodyTag : "section",
		transitionEffect : "slideLeft",
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
//		onFinished: function (event, currentIndex)
//		{
//			alert("Submitted!");
//		}
	});
	
	/* Chamada do validate e regras de cada campo e mensagens personalizadas. */
	$("#cadastro-medico").validate({
		rules: {
			email: {
				required: true,
				email: true,
			},
			cpf: {
				cpf: true, 
				required: true
			}
		},
		messages: {		
			cpf: { 
				cpf: 'CPF inválido'
			}
	      }

	});
	
	/* Selectize: criação dos arrays dos campos */
	$('#diasAtendimento').selectize({
		maxItems : null,
		valueField : 'title',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : 'Domingo'
		}, {
			id : 2,
			title : 'Segunda-feira'
		}, {
			id : 3,
			title : 'Terça-feira'
		}, {
			id : 4,
			title : 'Quarta-feira'
		}, {
			id : 5,
			title : 'Quinta-feira'
		}, {
			id : 6,
			title : 'Sexta-feira'
		}, {
			id : 7,
			title : 'Sábado'
		} ],
		create : false
	});

	$('#localAtendimento').selectize(
			{
				maxItems : 1,
				valueField : 'title',
				labelField : 'title',
				searchField : 'title',
				options : [
						{
							id : 1,
							title : 'Hospital das Clinicas' + ' - '
									+ 'Av Nações Unidas, 7221'
						},
						{
							id : 2,
							title : 'Hospital das Clinicas' + ' - '
									+ 'Av Nações Unidas, 7221'
						},
						{
							id : 3,
							title : 'Hospital das Clinicas' + ' - '
									+ 'Av Nações Unidas, 7221'
						} ],
				create : false
			});

	$('#convenios').selectize({
		maxItems : null,
		valueField : 'id',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : 'Bradesco'
		}, {
			id : 2,
			title : 'Mediservice'
		}, {
			id : 3,
			title : 'Blabla'
		} ],
		create : false
	});

	$('#especialidade').selectize({
		maxItems : 3,
		valueField : 'title',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : 'Cardiologista'
		}, {
			id : 2,
			title : 'Otorrino'
		}, {
			id : 3,
			title : 'Psicólogo'
		} ],

		onChange: function(value) {
			$('#especialidade').attr('value', value);
	    },
		create : false
	});
});