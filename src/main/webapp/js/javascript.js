function initRemoteSelectize(input, src_url, selectize_options) {
	$.ajax({
		url : src_url,
		type : 'GET',
		dataType : 'json',
		error : function() {
			$(input).selectize({
				options : [ 'Erro ao buscar especialidades' ],
			});
		},
		success : function(result) {
			selectize_options.options = result;
			$(input).selectize(selectize_options);
		}
	});
}

function initEspecialidadesSelectize() {
	var input = '#especialidades';
	var src_url = "/api/especialidade";
	var selectize_options = {
		maxItems : 3,
		valueField : 'id',
		labelField : 'nome',
		searchField : 'nome',
	}
	initRemoteSelectize(input, src_url, selectize_options);
}

function initClinicaSelectize() {
	var input = '#clinicas';
	var src_url = "/api/clinica";
	var selectize_options = {
		maxItems : 1,
		valueField : 'id',
		labelField : 'nomeFantasia',
		searchField : 'nomeFantasia',
	}
	initRemoteSelectize(input, src_url, selectize_options);
}

function initConvenioSelectize() {
	var input = '#convenios';
	var src_url = "/api/convenio";
	var selectize_options = {

		valueField : 'id',
		labelField : 'nome',
		searchField : 'nome',
	}
	initRemoteSelectize(input, src_url, selectize_options);
}

function initSteps() {
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
		},
	});
}

$(document).ready(function() {

	initSteps();
	initEspecialidadesSelectize();
	initClinicaSelectize();
	initConvenioSelectize();

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
	
	
	$('#tagsAvaliacao').selectize({
		maxItems : 3,
		valueField : 'title',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : 'Pontualidade'
		}, {
			id : 2,
			title : 'Educação'
		}, {
			id : 3,
			title : 'Clareza nas informações'
		}, {
			id : 4,
			title : 'Paciência'
		}, {
			id : 5,
			title : 'Higiene'
		}
		],
		create : true
	});
	

	$('#classificacao').selectize({
		maxItems : 1,
		valueField : 'title',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : '1'
		}, {
			id : 2,
			title : '2'
		}, {
			id : 3,
			title : '3'
		} ],

		onChange : function(value) {
			$('#especialidades').attr('value', value);
		},
		create : false
	});

	$('#custo').selectize({
		maxItems : 1,
		valueField : 'title',
		labelField : 'title',
		searchField : 'title',
		options : [ {
			id : 1,
			title : '1'
		}, {
			id : 2,
			title : '2'
		}, {
			id : 3,
			title : '3'
		} ],
		onChange: function(value) {
			$('#custo').attr('value', value);
	    },
		create : false
	});

	/* Card JS */
	$('.card__share > a').on('click', function(e) {
		e.preventDefault() // prevent default action - hash doesn't appear in
		// url
		$(this).parent().find('div').toggleClass('card__social--active');
		$(this).toggleClass('share-expanded');
	});
});