package com.example.gerenciador;

import lombok.Data;

import java.util.Date;

@Data
public class Empresa {
    private Integer id;
    private String nome;
    private Date dataAbertura;
}
