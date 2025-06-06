
package br.ulbra.entity;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    public Usuario(){
}

    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + '}';
    }
    
}
