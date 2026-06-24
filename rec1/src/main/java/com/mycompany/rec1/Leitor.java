package com.mycompany.rec1;

public class Leitor {

    private String nome;
    private String email;
    private String codigo;
    private String categoria;
    private boolean termos;

    public Leitor(String nome, String email, String codigo,
                  String categoria, boolean termos) {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.categoria = categoria;
        this.termos = termos;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isTermos() {
        return termos;
    }
}