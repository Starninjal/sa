package core.domain;

import java.util.Objects;

public class Cargo {
	private int id;
	
	private String descricaoCurta;

	public Cargo(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}
	
	public Cargo(int id, String descricaoCurta) {
		this(descricaoCurta);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
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
		Cargo other = (Cargo) obj;
		return id == other.id;
	}
	
	
	
	
	
	
}
