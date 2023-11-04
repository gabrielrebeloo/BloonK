package modelo;

import java.time.LocalDate;

public class Pessoa extends Usuario{
    private String genero;
    private String tipoSangue;
    private LocalDate dataNasc;
    private String cpf;

    public Pessoa(String nome, String senha, String email, long idTelefone, String genero, String tipoSangue,
                  LocalDate dataNasc, String cpf) {
        super(nome, senha, email, idTelefone);
        this.genero = genero;
        this.tipoSangue = tipoSangue;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
