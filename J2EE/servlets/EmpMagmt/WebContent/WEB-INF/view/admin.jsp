<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adminstration</title>
<style>
    div {
      border: 1px solid black;
      padding: 10px;
      margin: 230px;
      width: 180px;
      height: 80px; 
      background-color: black;
     }
</style>
</head>
<body>

<div>
<table>
<tr>
<td>
<form action="add">
 <input type="submit" value="ADD EMPLOYEE" style="background-color: orange">
 </form>
 </td>
</tr>

<tr>
<td>
<form action="searchPage">
<input type="submit" value="SEARCH EMPLOYEE" style="background-color: orange">
</form>
</td>
</tr>

<tr>
<td>
<form action="removePage">
   <input type="submit" value="REMOVE EMPLOYEE" style="background-color: orange">
 </form>
</td>
</tr>
</table>
</div>
</body>
</html>