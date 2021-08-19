package com.example.gerenciador;

import java.util.ArrayList;
import java.util.List;
public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("IFPB");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Latin");
        lista.add(empresa);
        lista.add(empresa2);
    }
    public void add(Empresa empresa) {
        lista.add(empresa);
    }

    public List<Empresa> getLista() {
        return lista;
    }
}
