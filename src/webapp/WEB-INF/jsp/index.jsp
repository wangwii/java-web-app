<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <title>Welcome to jWeb Application</title>
</head>
<body>
  <p>Welcome to jWeb Application</p>

  <%@ page import="java.util.Date" %>
  <strong>Current Time is</strong>:<%=new Date() %>
</body>
</html>
