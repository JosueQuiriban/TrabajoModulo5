<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Accidente</title>
    <link rel="icon" href="img/logo1.png">
    <script src="https://kit.fontawesome.com/14907c5069.js" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Righteous&display=swap"
        rel="stylesheet">
    <link href="<c:url value="/resources/css/estilo_general.css" />" rel="stylesheet">
    

</head>
</head>
<body>

<body class="ReporAcc">

    <header>
        <div id="cabecerafija2">
            <div class="logo">
            </div>
            <div class="titulo-cabecera-fija">
                <div id="tituloHI">
                    <span>NMD</span>
                </div>
                <div id="tituloSubHI">
                     <span>Portal Cliente: &nbsp; ${empresa}, &nbsp; rut ${usuario}.</span>
                    <input type="hidden" name="id_cliente" value="${id}">
                </div>
            </div>
            <a href="ControlLoginCliente?accion=Salir"> <button type="submit" id="out"><i class="fas fa-power-off"></i></button> </a>
        </div>
         <nav class="menu-desktop">
                <ul>
                    <li>
                        <a href="/Evaluacion_10CUsos/view/ResumenCliente.jsp" class="homeCliente">
                            <span>Mi resumen</span>
                        </a>
                    </li>
                    <li>
                        <a href="/Evaluacion_10CUsos/view/ListaAccidentesCliente.jsp" class="AccRepor">
                            <span>Accidentes Reportados</span>
                        </a>
                    </li>
                    <li>
                        <a href="/Evaluacion_10CUsos/view/ReportarAccidenteCliente.jsp" class="ReporAcc">
                            <span>Reportar Accidente</span>
                        </a>
                    </li>
                    <li>
                        <a href="/Evaluacion_10CUsos/view/PreferenciasCliente.jsp" class="Preferencias">
                            <span>Preferencias</span>
                        </a>
                    </li>
                </ul>
            </nav>
    </header>
    <main>
            <div class="col-1 titulo-pag">
                <p>Sistema de ingreso de Acccidentes</p>
            </div>
            <div class="col-1 cont-text-pag">
            <form:form action="agregar.html" method="POST"> 
            
                <p>Datos Cliente</p>
                
                <form:label path="rut_empresa">Rut Empresa</form:label>
                <br>
                <form:input path="rut_empresa"/>
                <br>
                
                <form:label path="nombre_empresa"> Nombre Empresa</form:label>
                <br>
                <form:input path="nombre_empresa"/> 
                <br>
                
                <p>Datos Accidente</p>
                
                <form:label path="tipo_accidente"> Tipo Accidente</form:label>
                <br>
                <form:input path="tipo_accidente"/> 
                <br>
                
                <form:label path="fecha_accidente"> Fecha Accidente</form:label>
                <br>
                <form:input path="fecha_accidente"/> 
                <br>
                
                <form:label path="lugar_accidente"> Lugar Accidente</form:label>
                <br>
                <form:input path="lugar_accidente"/> 
                <br>
                
                <form:label path="detalle_accidente"> Detalle Accidente</form:label>
                <br>
                <form:textarea path="detalle_accidente"/>    
                <br>
                
                <input type="submit" value="Enviar">        
                <br>    
                
            </form:form>
            </div>
                
                      
        </main>
        
    <footer>
        <div class="copy"> Consultora NMD Ltda. <i class="far fa-copyright"></i></div>
        <div class="fono"> Llámenos al 800 700 8000 </div>
        <div class="rrss"> <i class="fab fa-facebook"></i> ConsultoraNMD</div>
        <div class="rrss"> <i class="fab fa-twitter"></i> @NMDChile</div>
        <div class="rrss"> <i class="fab fa-instagram"></i> @ConsultoraNMD</div>
</footer>

 <script>
            let nuevo = function() {
            $("<section/>").
            insertBefore("[name='duplicar']")
                 .append($(".inputs").html())
                 .find("button")
                 .attr("onclick", "eliminar(this)")
                 .text("Eliminar");   
                                    
}
                 
        
            let eliminar = function(obj) {
            $(obj).closest("section").remove();
}
        </script>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
    
</body>

</body>
</html>