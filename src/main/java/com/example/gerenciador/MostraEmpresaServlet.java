package com.example.gerenciador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "MostraEmpresaServlet", value = "/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaPelaId(id);
        System.out.println(empresa.getNome());
        request.setAttribute("empresa", empresa);
        RequestDispatcher rd =
                request.getRequestDispatcher("/formAlteraEmpresa.jsp");
        rd.forward(request, response);
    }


}
