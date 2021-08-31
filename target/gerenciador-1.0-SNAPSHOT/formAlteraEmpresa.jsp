<%--
  Created by IntelliJ IDEA.
  User: Erickson
  Date: 30/08/2021
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:url value="alteraEmpresa" var="linkServletNovaEmpresa"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${linkServletNovaEmpresa}" method="post">
    Nome: <input type="text" name="nome" value="${empresa.nome }" />
    Data Abertura: <input type="text" name="data" value="<fmt:formatDate
value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
    <input type="hidden" name="id" value="${empresa.id }">
    <input type="submit" />
</form>
</body>
</html>
