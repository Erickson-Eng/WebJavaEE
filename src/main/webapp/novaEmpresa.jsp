<%--
  Created by IntelliJ IDEA.
  User: Cellash
  Date: 18/08/2021
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
    String novaEmpresa = (String)request.getAttribute("empresa");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test= "${not empty empresa}">
    Empresa ${ empresa } cadastrada com sucesso!
</c:if>
<c:if test= "${empty empresa}">
    Nenhuma empresa cadastrada!
</c:if>
</body>
</html>
