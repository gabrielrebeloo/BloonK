package modelo;

import java.time.LocalDate;

public class Doador extends Pessoa{
    private long doadorId;
    private long idEndereco;

    public Doador(String nome, String senha, String email, long idTelefone, String genero, String tipoSangue,
                  LocalDate dataNasc, String cpf, long doadorId, long idEndereco) {
        super(nome, senha, email, idTelefone, genero, tipoSangue, dataNasc, cpf);
        this.doadorId = doadorId;
        this.idEndereco = idEndereco;
    }

    public long getDoadorId() {
        return doadorId;
    }

    public void setDoadorId(long doadorId) {
        this.doadorId = doadorId;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }
}
