package modelo;

public class Telefone {
    private long telefoneId;
    private String ddd;
    private String numero;

    public Telefone(long telefoneId, String ddd, String numero) {
        this.telefoneId = telefoneId;
        this.ddd = ddd;
        this.numero = numero;
    }

    public long getTelefoneId() {
        return telefoneId;
    }

    public void setTelefoneId(long telefoneId) {
        this.telefoneId = telefoneId;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
