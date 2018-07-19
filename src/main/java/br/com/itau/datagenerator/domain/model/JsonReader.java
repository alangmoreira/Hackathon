package br.com.itau.datagenerator.domain.model;

public class JsonReader extends BaseModel<Integer> {
    
    private int id;
    private String data;
    
    private Cliente cliente;
    private Ativo ativo;
    
	private int quantidade;
	private double valorOperacao;
	private String tipoMovimento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Ativo getAtivo() {
		return ativo;
	}
	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorOperacao() {
		return valorOperacao;
	}
	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}
	public String getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	
	
	
}
