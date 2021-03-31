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
public class PessoaJuridica extends Pessoa {
    private String razao;
    private String cnpj;
    
    public PessoaJuridica(){
        
    }
    
    public PessoaJuridica(String razao, String cnpj, String email, String celular){
        super(email, celular);
        this.razao = razao;
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return imprimir();
    }

    @Override
    public String imprimir() {
        return "Razão: " + razao + "\nCNPJ: " + cnpj + "\n" + super.imprimir(); 
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
    
}
