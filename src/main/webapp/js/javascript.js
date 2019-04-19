/* ClickMed personal JavaScript
 * 
 */

$(document).ready(function() {
	
	
	/*Chamada e configurações do Steps e Validate*/
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
		onFinished: function (event, currentIndex)
		{
			alert("Submitted!");
		}
	});
	
	/*Chamada do validate e regras de cada campo e mensagens personalizadas.*/
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
	      },submitHandler:function(form) {
	         alert('ok');
	      }
	});
	
	$("#cadastro-paciente").validate({
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
	      },submitHandler:function(form) {
	         alert('ok');
	      }
	});
	
	$validator.addMethod("cpf", function(value, element) {
		   value = jQuery.trim(value);

		    value = value.replace('.','');
		    value = value.replace('.','');
		    cpf = value.replace('-','');
		    while(cpf.length < 11) cpf = "0"+ cpf;
		    var expReg = /^0+$|^1+$|^2+$|^3+$|^4+$|^5+$|^6+$|^7+$|^8+$|^9+$/;
		    var a = [];
		    var b = new Number;
		    var c = 11;
		    for (i=0; i<11; i++){
		        a[i] = cpf.charAt(i);
		        if (i < 9) b += (a[i] * --c);
		    }
		    if ((x = b % 11) < 2) { a[9] = 0 } else { a[9] = 11-x }
		    b = 0;
		    c = 11;
		    for (y=0; y<10; y++) b += (a[y] * c--);
		    if ((x = b % 11) < 2) { a[10] = 0; } else { a[10] = 11-x; }

		    var retorno = true;
		    if ((cpf.charAt(9) != a[9]) || (cpf.charAt(10) != a[10]) || cpf.match(expReg)) retorno = false;

		    return this.optional(element) || retorno;

		}, "Informe um CPF válido");
	
	/*Selectize: criação dos arrays dos campos*/
	$('#dia-atendimento').selectize({
		maxItems : null,
		valueField : 'id',
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

	$('#local-atendimento').selectize(
			{
				maxItems : 1,
				valueField : 'id',
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

	$('#especialidades').selectize({
		maxItems : null,
		valueField : 'id',
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
		create : false
	});
	
});