package core.dao;

import java.util.List;

import core.domain.Cargo;

public interface DaoCargo {

	public void inserir(Cargo cargo);
	
	public void alterar(Cargo cargo);
	
	public void excluir(Cargo cargo);
	
	public List<Cargo> listarPor(String descricaoCurta);
	
	public List<Cargo> listarTodas();
}
