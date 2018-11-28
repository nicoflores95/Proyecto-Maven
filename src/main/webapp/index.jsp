<%-- 
    Document   : index
    Created on : nov 13, 2018, 8:58:15 p.m.
    Author     : nicof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Testing</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">         
                          
         <link rel="stylesheet" href="css/jquery-ui.min.css">
         <link rel="stylesheet" href="css/estilos.css">
         <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
          <script type="text/javascript" src="js/jquery-ui.js"></script>
         <script type="text/javascript" src="js/datepicker-es.js"></script>

         <script>
            $(function () {$.datepicker.setDefaults($.datepicker.regional["es"]);
                    $("#datepicker").datepicker({
                        beforeShowDay: $.datepicker.noWeekends,
                         beforeShow: $.datepicker.Week,
                        firstDay: 1,
                        minDate: "+1M"

                        
                    });
                    
                    });

                    
         </script>
         
        
    </head>
    <body>
       
         <div class="wrap">
         <form action="Controlador" method="get" method="post" class="formulario" >
           
           <h1 class="formulario__titulo"> Simulador de Credito</h1>
           
            
           <input type="txt" class="formulario__input" id="indentificador" onclick="" required name="indentificador" >
           <label id="indentificador" for="identificador" class="formulario__label">Rut:</label>
           
           
           <input type="txt" class="formulario__input" id="monto" required name="monto">
           <label id="monto" for="monto" class="formulario__label">Monto Solicitado:</label>

            
           <input type="txt" class="formulario__input" required name="cuotas" >
           <label id="cuotas" for="" class="formulario__label">Plazo en Cuotas:</label>
       
            
           <input type="txt" id="datepicker" class="formulario__fecha" required name="fecha" placeholder="dd-mm-aaaa" placeholder-color="rgba(255,133,27.3)">
           <label id="aqui" for="" class="formulario__label">Primer Vencimiento:</label>
            
            
           <div class="radio">
            
           <h2 class="seguro" >Seguro a Incluir:</h2>
            
           
           <input type="radio" name="seguro" id="protegido" class="formulario__input" checked>
           <label for="protegido">Protegido</label>
            
           <input type="radio" name="seguro" id="desgravamen" class="formulario__input " >
            <label for="desgravamen">Desgravamen</label>
           
            </div>
            
            <input type="submit" name="submit" class="formulario__submit" action="controlador" id="ap">
            
        </form>
        </div>   
        
        <script src="js/form.js"></script>
    </body>
</html>