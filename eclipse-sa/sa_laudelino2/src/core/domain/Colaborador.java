package core.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Colaborador {
	private int id;
	
	private String nomeCompleto;
	
	private String cpf;
	
	private LocalDateTime dataDeAdmissao;
	
	private String rg;
	
	private String nomeDaMae;
	
	private String loginUsuario;
	
	private String senhaUsuario;
	
	private Cargo cargo;
	
	

	public Colaborador(String nomeCompleto, String cpf, LocalDateTime dataDeAdmissao, String rg, String nomeDaMae,
			String loginUsuario, String senhaUsuario, Cargo cargo) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataDeAdmissao = dataDeAdmissao;
		this.rg = rg;
		this.nomeDaMae = nomeDaMae;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.cargo = cargo;
	}

	public Colaborador(int id, String nomeCompleto, String cpf, LocalDateTime dataDeAdmissao, String rg,
			String nomeDaMae, String loginUsuario, String senhaUsuario, Cargo cargo) {
		this(nomeCompleto, cpf, dataDeAdmissao, rg, nomeDaMae, loginUsuario, senhaUsuario, cargo);
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDateTime dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
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
		Colaborador other = (Colaborador) obj;
		return id == other.id;
	}
	
	
	
	
	
}
