<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pide tu cita para revisar a tu peludito</title>
</head>
<body>
 <form method="post" action="MyServlet">
    Introduzca el nombre de tu perro:  <br/>
    <input type="text" name="nombrePerro" id="nombrePerro"/> <br/>
    
    Cuanto pesa tu animalito: <br/>
    <input type="text" name="pesoAnimal" id="pesoAnimal"/> <br/>
    
    Que le pasa a tu animalito:  <br/>
    <input type="text" name="problemaAnimal" id="problemaAnimal"/> <br/>
    
    <input type="submit" value="Vamos allá"/>
</form>
</body>
</html>