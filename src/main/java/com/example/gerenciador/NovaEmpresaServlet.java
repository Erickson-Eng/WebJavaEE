package com.example.gerenciador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        String paramDataEmpresa = request.getParameter("data");
        Empresa empresa = new Empresa();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataAbertura = sdf.parse(paramDataEmpresa);
            empresa.setDataAbertura(dataAbertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.add(empresa);

        RequestDispatcher rd =request.getRequestDispatcher("/listaEmpresas");
        request.setAttribute("empresa", empresa.getNome());
        rd.forward(request, response);
    }

}