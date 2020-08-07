package criandoEmpresa;
public class criandoEmpresa {

    private String nome;
    private String cnpj;
    private String endereco;

    public criandoEmpresa(String cnpj, String nome, String endereco) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString () {
    	return "Produto cnpj= " + cnpj + ", nome = " + nome + ", endereco: " + "endereco ";
    }
    @Override 
    public int hashCode () {
    	return this.cnpj.charAt(0);
    }
    @Override
    public boolean equals(Object obj) {
    	criandoEmpresa outro = (criandoEmpresa) obj;
    	return this.cnpj.equals(outro.getCnpj());
    	
    }
}