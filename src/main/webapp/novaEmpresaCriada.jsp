<%--
  Created by IntelliJ IDEA.
  User: Cellash
  Date: 24/08/2021
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        //scriptlet
        String nomeEmpresa = (String)request.getAttribute("empresa");
        System.out.println(nomeEmpresa);
    %>
    <title>Title</title>
</head>
<body>
    Empresa <%= nomeEmpresa %> cadastrada com sucesso!
</body>
</html>
