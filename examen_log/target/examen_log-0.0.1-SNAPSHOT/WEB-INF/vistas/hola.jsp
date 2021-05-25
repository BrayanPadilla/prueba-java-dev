<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
$(document).ready(function(){
console.log('LISTO');
}

</script>
<title>LOGIN</title>
</head>
<body>
${mensaje}
<div>
	<label id="lblUsuario"><span></span>Usuario:</label>
	<input id="txtManzana" name="" type="text"/>
	<button id="btnOk" type="button" class="boton" onclick="alert('click event occured')">OK</button>
</div>
</body>
</html>