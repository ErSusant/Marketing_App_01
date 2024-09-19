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
      <h2 style="color:green" align="center">UpadteRegistration</h2>
      
      <bh>
      <form action="update" method="post">
      <table border="1" >
      <div background-color="blue" align="center">
            <pre>
                  <input type="hidden" name="id" value="${registration.id}">
                 Full_Name:<input type="text" name="name" value="${registration.name}">
                     Email:<input type="email" name="email" value="${registration.email }">
                    Mobile:<input type="number" name="mobile" value="${registration.mobile}">
                 <input type="Submit" value="Update">
            </pre>
            </div>
            </table>
      </form>
</body>
</html>