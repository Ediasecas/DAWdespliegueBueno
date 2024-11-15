<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pide tu cita para lavar a tu peludo</title>
</head>
<body>
 <form method="post" action="MyServlet">
    Introduzca el nombre de tu perro:  <br/>
    <input type="text" name="nombrePerro" id="nombrePerro"/> <br/>
    
    Como tiene el pelo tu perro:  <br/>
    <input type="text" name="estadoPelo" id="estadoPelo"/> <br/>
    
    Hace cuanto no se corta el pelo: <br/>
    <input type="text" name="tiempoUltimaCorte" id="tiempoUltimaCorte"/> <br/>
    
    <input type="submit" value="Vamos allá"/>
</form>
</body>
</html>
