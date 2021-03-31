/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosobrescrita;

/**
 *
 * @author Usuário
 */
public class PessoaFisica extends Pessoa{
    private String nome;
    private String cpf;
    
    public PessoaFisica(){  
        
    }
    
    public PessoaFisica(String nome, String cpf, String email, String celular){
     super(email, celular);
     this.nome = nome;
     this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return imprimir();
    }

    @Override
    public String imprimir() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\n" + super.imprimir(); 
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
    
    
}
