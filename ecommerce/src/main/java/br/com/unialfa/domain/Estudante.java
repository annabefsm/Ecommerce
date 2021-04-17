package br.com.unialfa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "estudante")
public class Estudante implements Serializable {
	
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    
    @Column
	private String nome;
    
    @Column
	private String CPF;
    
    @Temporal(TemporalType.DATE)
    @Column
	private Date dataNascimento;
    
    @Column
	private String estadoCivil;
    
    @Transient
    private Status status;
    
    @Transient
	private Endereco endereco;
    
    @Column
	private String telefone;
    
    @Transient
	private Curriculo dadosCurriculo;
    
    @Column
	private String email;
    
    @Column
	private String escolaridade;
    
    
    @Transient
	private Usuario usuario;
	
	public Estudante(long id) {
		super();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Curriculo getDadosCurriculo() {
		return dadosCurriculo;
	}
	public void setDadosCurriculo(Curriculo dadosCurriculo) {
		this.dadosCurriculo = dadosCurriculo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}