package com.example.gerenciador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NovaEmpresaServlet", value = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        System.out.println(" Cadastrando nova empresa ");
        String nomeEmpresa = request.getParameter("nome");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.add(empresa);

        out.println("<html><body> Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
    }

//    protected void service(HttpServletRequest request, HttpServletResponse
//            response) throws ServletException, IOException {
//        System.out.println("Cadastrando nova empresa");
//        String nomeEmpresa = request.getParameter("nome");
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
//}

}