package com.mycompany.lojacliente.lojaCliente;


public class CadastroCliente {

    public static void main(String[] args) {
        UICadastro formulario = new UICadastro();
        Pessoa Cliente1;
        Cliente1 = new Pessoa(formulario.nome, formulario.cpf, formulario.endereco,
                formulario.cidade, formulario.estado);


            Cliente1.setNome(formulario.nome);
            Cliente1.setCpf(formulario.cpf);
            Cliente1.setEndereco(formulario.endereco);
            Cliente1.setCidade(formulario.cidade);
            Cliente1.setEstado(formulario.estado);


        Cliente1.printCliente();
        
    }
    
}
