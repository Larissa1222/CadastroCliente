package com.mycompany.lojacliente.lojaCliente;


public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String cidade;
    private String estado;

    //Construtor
    public Pessoa(String nome, String cpf, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void printCliente(){
        System.out.println("=================================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Estado: " + this.getEstado());
        System.out.println("=================================");
    }
    
}
