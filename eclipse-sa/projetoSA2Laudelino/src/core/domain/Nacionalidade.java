package core.domain;

import java.util.Objects;

public class Nacionalidade {
	
	private int id;
	
	private String descricao;
	
	public Nacionalidade(String descricao) {
		this.descricao = descricao;
	}
	
	public Nacionalidade(int id, String descricao) {
		this(descricao);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Nacionalidade other = (Nacionalidade) obj;
		return id == other.id;
	}
	
	
	
	
}
