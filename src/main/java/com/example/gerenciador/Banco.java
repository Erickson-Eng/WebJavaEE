package com.example.gerenciador;

import java.util.ArrayList;
import java.util.List;
public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("IFPB");
        empresa.setId(chaveSequencial++);

        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Latin");


        lista.add(empresa);
        lista.add(empresa2);
    }
    public void add(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        lista.add(empresa);
    }

    public List<Empresa> getLista() {
        return lista;
    }

    public void removeEmpresa(Integer id){
        lista.removeIf(empresa -> empresa.getId().equals(id));
    }

    public Empresa buscaEmpresaPelaId(Integer id) {
        for (Empresa e :
                lista) {
            if (e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }
}
