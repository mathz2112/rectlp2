/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rec1;

/**
 *
 * @author Matheus Muniz - 1212B
 */
public class Leitor {
    private String nome;
    private String email;
    private String codigo;
    private String categoria;
    private boolean termos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isTermos() {
        return termos;
    }

    public void setTermos(boolean termos) {
        this.termos = termos;
    }

    public Leitor(String nome, String email, String codigo, String categoria, boolean termos) {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.categoria = categoria;
        this.termos = termos;
    }

    public Leitor(String email, String codigo) {
        this.email = email;
        this.codigo = codigo;
    }  
}
