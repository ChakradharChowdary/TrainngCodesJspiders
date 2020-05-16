<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Employee</title>
</head>
<body>
<form action="remove" method="post">
 <style>
    div{
      border: 1px;
      padding: 10px;
      margin: 230px;
     
    }
  </style>
  <div style="width: 300px;height: 130px;background-color: lightGreen">
 <table>
 
  <tr>
	<td>PhoneNumber<sup>*</sup></td>
	<td>:</td>
	<td><input type="number" name="number" placeholder="Eg:123456" required></td>
  </tr>
 
  <tr>
	<td></td>
	<td></td>
	<td><input type="submit" value="Delete"></td>
  </tr>
  </table>
  </form>
</body>
</html>