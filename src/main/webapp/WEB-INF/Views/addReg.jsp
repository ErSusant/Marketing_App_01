  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRTION</title>
</head>
<body>
 
<h1 style="font-family:consolas">Susanta</h1>
      <h2 Style="color:red" align="center">AddRegistration</h2>
      <form action="SaveReg" method="post">
      <table border="1">
            <pre>
                 Full_Name:<input type="text" name="name" autofocus required placeholder="Enter Full Name">
                     Email:<input type="email" name="email" required placeholder="Enter the Email">
                    Mobile:<input type="number" name="mobile" required placeholder="Enter Mobile number">
                 <input type="Submit" value="Save">
                 
            </pre>
            </table>
      </form>
      ${msg}
      
</body>
</html>