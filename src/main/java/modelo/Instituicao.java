package modelo;

public class Instituicao extends Usuario {
    private long instituicaoId;
    private String cnpj;
    private long idEndereco;

    public Instituicao(long instituicaoId, String nome, String email, String senha, String cnpj, long idEndereco) {
        super(nome, senha, email);
        this.instituicaoId = instituicaoId;
        this.cnpj = cnpj;
        this.idEndereco = idEndereco;
    }

    public long getInstituicaoId() {
        return instituicaoId;
    }

    public void setInstituicaoId(long instituicaoId) {
        this.instituicaoId = instituicaoId;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }
}
