package br.com.unialfa.domain;

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
@Table(name = "curriculo")
public class Curriculo {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    
    @Column
	private String sobre;
    
    @Column
	private String instituicao;
    
    @Column
	private Double pretensaoSalarial;
    
    @Column
	private String habilidade;
    
    @Transient
    private Curso curso;
    
    @Transient
	private Area area;
    
    @Column
	private String especialidade;
    
    @Transient
	private Experiencia experiencia;
    
    @Column
	private String linkRedeSocial;
    
    @Temporal(TemporalType.DATE)
    @Column
	private Date dataInicio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Double getPretensaoSalarial() {
		return pretensaoSalarial;
	}

	public void setPretensaoSalarial(Double pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Experiencia getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Experiencia experiencia) {
		this.experiencia = experiencia;
	}

	public String getLinkRedeSocial() {
		return linkRedeSocial;
	}

	public void setLinkRedeSocial(String linkRedeSocial) {
		this.linkRedeSocial = linkRedeSocial;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
    
    
    
}
