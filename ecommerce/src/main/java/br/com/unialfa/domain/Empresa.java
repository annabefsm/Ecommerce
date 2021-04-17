package br.com.unialfa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "empresa")
public class Empresa {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    
    @Column
	private String nome;
    
    @Column
	private String CNPJ;
    
    @Column
	private String telefone;
    
    @Transient
	private Endereco endereco;
    
    @Column
    private String email;
    
    @Transient
	private InfoVagas infoVagas;
    
    @Column
    private int numVagas;
    
    @Transient
    private Usuario usuario;

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

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InfoVagas getInfoVagas() {
		return infoVagas;
	}

	public void setInfoVagas(InfoVagas infoVagas) {
		this.infoVagas = infoVagas;
	}

	public int getNumVagas() {
		return numVagas;
	}

	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
}
