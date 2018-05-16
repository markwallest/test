<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String nom = (String) request.getAttribute("nom");
String prenom = (String) request.getAttribute("prenom");




%>

${cookie }
<body>
	<form action="/Projet1/home" method="post">
		<tr>
			<td>Nom</td>
			<td><input name="nom" type="text" /></td>
		</tr>
		<tr>
			<td>Prenom</td>
			<td><input name="prenom" type="text"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</form>
</body>
</html>