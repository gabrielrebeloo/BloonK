package modelo;

import java.time.LocalDate;

public class Receptor extends Pessoa{
    private long receptorId;
    private long idEndereco;

    public Receptor(String nome, String senha, String email, long idTelefone, String genero, String tipoSangue,
                    LocalDate dataNasc, String cpf, long receptorId, long idEndereco) {
        super(nome, senha, email, idTelefone, genero, tipoSangue, dataNasc, cpf);
        this.receptorId = receptorId;
        this.idEndereco = idEndereco;
    }

    public long getReceptorId() {
        return receptorId;
    }

    public void setReceptorId(long receptorId) {
        this.receptorId = receptorId;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }
}
