package core.domain;

import java.util.Objects;

public class Usuario {
	private int id;
	
	private String nomeCompleto;
	
	private String loginUsuario;
	
	private String senhaUsuario;
	
	private PerfilUsuario perfilUsuario;
	
	

	public Usuario(String nomeCompleto, String loginUsuario, String senhaUsuario, PerfilUsuario perfilUsuario) {
		this.nomeCompleto = nomeCompleto;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.perfilUsuario = perfilUsuario;
	}
	
	

	public Usuario(int id, String nomeCompleto, String loginUsuario, String senhaUsuario, PerfilUsuario perfilUsuario) {
		this(nomeCompleto, loginUsuario, senhaUsuario, perfilUsuario);
		this.id = id;
	}
	
	public Usuario(int id, String loginUsuario, String senhaUsuario) {
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.id = id;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
	
	
}	
