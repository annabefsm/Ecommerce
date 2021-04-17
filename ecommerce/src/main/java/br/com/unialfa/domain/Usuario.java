package br.com.unialfa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "usuario")
public class Usuario {

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
	    
	    @Column
		private String login;
	    
	    @Column
		private String senha;
	    
	    @Transient
	    private Estudante estudante;
	    
	    @Transient
		private Empresa empresa;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public Estudante getEstudante() {
			return estudante;
		}

		public void setEstudante(Estudante estudante) {
			this.estudante = estudante;
		}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}
	    
	    

}
