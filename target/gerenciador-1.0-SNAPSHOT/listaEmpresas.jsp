<%@ page import="com.example.gerenciador.Empresa" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Cellash
  Date: 24/08/2021
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Lista de empresas: <br />
<ul>
    <c:forEach items="${empresas}" var="empresa">
        <li>${empresa.nome} - <fmt:formatDate
                value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> </li>
    </c:forEach>
</ul>
</body>
</html>
