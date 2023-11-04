package modelo;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private long idTelefone;

    public Usuario(String nome, String senha, String email, long idTelefone) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.idTelefone = idTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(long idTelefone) {
        this.idTelefone = idTelefone;
    }
}
