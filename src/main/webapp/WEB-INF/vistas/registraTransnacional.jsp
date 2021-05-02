<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>
<title>Ejemplos de CIBERTEC - Jorge Jacinto </title>
</head>
<body>

<div class="container">
<h1>Registra Transnacional</h1>

	<c:if test="${sessionScope.MENSAJE != null}">
		<div class="alert alert-success fade in" id="success-alert">
		 <a href="#" class="close" data-dismiss="alert">&times;</a>
		 <strong>${sessionScope.MENSAJE}</strong>
		</div>
	</c:if>
	<c:remove var="MENSAJE" />
	
	<form action="registraTransnacional" id="id_form"> 

			<div class="form-group">
				<label class="control-label" for="id_razon_social">Razon Social</label>
				<input class="form-control" type="text" id="id_raz_social_transnacional" name="raz_social_transnacional" placeholder="Ingrese la razon social" maxlength="40">    
			</div>
			
			<div class="form-group">
				<label class="control-label" for="id_dir_transnacional">Direccion</label>
				<input class="form-control" type="text" id="id_dir_transnacional" name="dir_transnacional" placeholder="Ingrese la direccion" maxlength="8">    
			</div>
			
			<div class="form-group">
				<label class="control-label" for="id_ruc_transnacional">RUC</label>
				<input class="form-control" type="text" id="id_ruc_transnacional" name="ruc_transnacional" placeholder="Ingrese el RUC" maxlength="100">    
			</div>
			
			<div class="form-group">
				  <label class="control-label" for="id_categoria">Categoria</label>
                <select id="id_categoria" name="categoria.cod_categoria" class='form-control'>
                    <option value=" ">[Seleccione]</option>
                </select>
			</div>
			
		 	
			<div class="form-group">
				<button type="submit" class="btn btn-primary" >Crea Transnacional</button>
			</div>
	</form>
</div>

<script type="text/javascript">
$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>

<!-- 
	https://mkyong.com/tutorials/java-regular-expression-tutorials/

 -->
<script type="text/javascript">

$.getJSON("listaCategoria", {}, function(data){
	$.each(data, function(index, item){
		$("#id_categoria").append("<option value="+item.cod_categoria +">"+ item.nom_categoria +"</option>");
	});
});

</script>

</body>
</html>




