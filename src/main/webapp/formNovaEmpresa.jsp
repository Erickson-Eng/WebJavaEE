<%--
  Created by IntelliJ IDEA.
  User: Cellash
  Date: 18/08/2021
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="novaEmpresa" var="linkServletNovaEmpresa"/>
<html>
<head>
    <title>Nova Empresa</title>
</head>
<body>

<form action="${linkServletNovaEmpresa}" method="post">
    Nome: <input type="text" name="nome" />
    Data Abertura: <input type="text" name="data" />
    <input type="submit" />
</form>
</body>
</html>
