<%-- 
    Document   : solicitud
    Created on : nov 13, 2018, 8:59:28 p.m.
    Author     : nicof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" href="css/estilos_solicitud.css">
        <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
        
        
        
    </head>
    <body>
        
               <form class="formulario" action="CSolicitud" method="post" method="get">
        	<div class="inputs">
        		<h1 class="formulario__titulo">Solicitud del Credito</h1>
        		
                        <input type="text" class="formulario__input" id="rut" name="rut" required>
        		<label id="rut" for="rut" class="formulario__label">Rut:</label>
        		
                        <input type="text" class="formulario__input" id="nombre" name="nombre" required>
        		<label id="nombre" for="nombre" class="formulario__label">Nombre:</label>
        		
                        <input type="text" class="formulario__input" id="apellido" name="apellido" required>
        		<label id="apellido" for="apellido" class="formulario__label">Apellido:</label>
        		
                        <input type="text" class="formulario__input" id="renta" name="renta" required>
        		<label id="renta" for="renta" class="formulario__label">Renta Liquida:</label>
        		
                        <input type="text" class="formulario__input" id="celular" name="celular" required>
        		<label id="celular" for="celular" class="formulario__label">Celular:</label>
        		
                        <input type="text" class="formulario__input" id="telefono" name="telefono" required>
        		<label id="telefono" for="telefono" class="formulario__label">Telefono:</label>
        		
                        <input type="email"  class="formulario__input" id="correo" name="correo" required>
        		<label id="correo" for="correo" class="formulario__label">Correo:</label>
        		
        	</div>
        	<div class="opcion">
        		<select id="regiones" class="formulario__input" required="required"></select>
				<select id="comunas" class="formulario__input" required="required"></select>
        	</div>
        	
        	<input type="submit" name="submit" class="formulario__submit" >
        </form>  
        <script src="js/form.js"></script>
        <script src="js/chile.js"></script>
    </body>
</html>
