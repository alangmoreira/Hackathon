package br.com.itau.datagenerator.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_consolidado")
public class Consolidado {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="cliente_id")
	private int cliente_id;
	

	
	public int getCliente_id() {
		return cliente_id;
	}
	
	@Column(name="cliente_nome")
	private String cliente_nome;
	
	@Column(name="cliente_DOC")
	private double cliente_DOC;
	
	@Column(name="ativo_cod")
	private String ativo_cod;
	
	@Column(name="ativo_nome")
	private String ativo_nome;
	
	@Column(name="quantidade_posicao")
	private int quantidade_posicao;
	
	@Column(name="valor_posicao")
	private double valor_posicao;
	
	@Column(name="plataforma")
	private String plataforma;
	
	@Column(name="segmento")
	private String segmento;
	
	@Column(name="dt_atualizacao")
	private Date dt_atualizacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	public String getCliente_nome() {
		return cliente_nome;
	}
	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}
	public double getCliente_DOC() {
		return cliente_DOC;
	}
	public void setCliente_DOC(double cliente_DOC) {
		this.cliente_DOC = cliente_DOC;
	}
	public String getAtivo_cod() {
		return ativo_cod;
	}
	public void setAtivo_cod(String ativo_cod) {
		this.ativo_cod = ativo_cod;
	}
	public String getAtivo_nome() {
		return ativo_nome;
	}
	public void setAtivo_nome(String ativo_nome) {
		this.ativo_nome = ativo_nome;
	}
	public int getQuantidade_posicao() {
		return quantidade_posicao;
	}
	public void setQuantidade_posicao(int quantidade_posicao) {
		this.quantidade_posicao = quantidade_posicao;
	}
	public double getValor_posicao() {
		return valor_posicao;
	}
	public void setValor_posicao(double valor_posicao) {
		this.valor_posicao = valor_posicao;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public Date getDt_atualizacao() {
		return dt_atualizacao;
	}
	public void setDt_atualizacao(Date dt_atualizacao) {
		this.dt_atualizacao = dt_atualizacao;
	}

	
}
