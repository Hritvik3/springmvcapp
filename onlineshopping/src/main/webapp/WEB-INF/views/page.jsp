<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextRoot" value="${PageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
 <html>
 <head>
 <meta charset="ISO-8859-1">
 <title>Online Shopping</title>
 </head>
 <body>
  ${contextRoot} says - ${greeting}
 </body>
 </html>