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
		onStepChanging : function(event, currentIndex, newIndex) {
			form.validate().settings.ignore = ":disabled,:hidden";
			return form.valid();
		},
		onFinishing : function(event, currentIndex) {
			form.validate().settings.ignore = ":disabled";
			return form.valid();
		}
	});

	/* Chamada do validate e regras de cada campo e mensagens personalizadas. */
	$("#cadastro-medico").validate({
		rules : {
			email : {
				required : true,
				email : true,
			},
			cpf : {
				cpf : true,
				required : true
			}
		},
		messages : {
			cpf : {
				cpf : 'CPF inválido'
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

	$('#localAtendimento').selectize({
		maxItems : 1,
		valueField : 'title',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : 'Hospital das Clinicas' + ' - ' + 'Av Nações Unidas, 7221'
		}, {
			id : 2,
			title : 'Hospital das Clinicas' + ' - ' + 'Av Nações Unidas, 7221'
		}, {
			id : 3,
			title : 'Hospital das Clinicas' + ' - ' + 'Av Nações Unidas, 7221'
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

		onChange : function(value) {
			$('#especialidade').attr('value', value);
		},
		create : false
	});

	/*// Executa a requisição quando o campo cpf perder o foco
	$('#cpf').blur(function() {
		var cpf = $('#cpf').val().replace(/[^0-9]/g, '').toString();

		if (cpf.length == 11) {
			var v = [];

			// Calcula o primeiro dígito de verificação.
			v[0] = 1 * cpf[0] + 2 * cpf[1] + 3 * cpf[2];
			v[0] += 4 * cpf[3] + 5 * cpf[4] + 6 * cpf[5];
			v[0] += 7 * cpf[6] + 8 * cpf[7] + 9 * cpf[8];
			v[0] = v[0] % 11;
			v[0] = v[0] % 10;

			// Calcula o segundo dígito de verificação.
			v[1] = 1 * cpf[1] + 2 * cpf[2] + 3 * cpf[3];
			v[1] += 4 * cpf[4] + 5 * cpf[5] + 6 * cpf[6];
			v[1] += 7 * cpf[7] + 8 * cpf[8] + 9 * v[0];
			v[1] = v[1] % 11;
			v[1] = v[1] % 10;

			// Retorna Verdadeiro se os dígitos de verificação são os esperados.
			if ((v[0] != cpf[9]) || (v[1] != cpf[10])) {
				alert('CPF inválido: ' + cpf);

				$('#cpf').val('');
				$('#cpf').focus();
			}
		} else {
			alert('CPF inválido:' + cpf);

			$('#cpf').val('');
			$('#cpf').focus();
		}
	});*/
});