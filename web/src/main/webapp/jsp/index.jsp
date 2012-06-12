<%@ page language="java" contextType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/js/jquery-1.7.2.min.js" var="jquery"/>
<c:url value="/js/index.js" var="index-js"/>
<c:url value="/css/style.css" var="css"/>

<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
      <link href="${css}" rel="stylesheet" type="text/css"/>
      <script src="${jquery}" type="text/javascript"></script>
      <script src="${index-js}" type="text/javascript"></script>
   </head>
   <body>
      <h2>Very soon there will be a web project based on Java Web courese</h2>
   </body>
</html>
