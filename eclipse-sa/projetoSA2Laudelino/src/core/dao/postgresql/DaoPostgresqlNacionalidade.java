package core.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;

import core.dao.DaoNacionalidade;
import core.dao.ManagerDb;
import core.domain.Nacionalidade;

public class DaoPostgresqlNacionalidade implements DaoNacionalidade  {

	private final String INSERT = "INSERT INTO nacionalidade (id, descricao) values (?,?)";
		
	private Connection conexao;
	
	public DaoPostgresqlNacionalidade() {
		this.conexao = ManagerDb.getInstance().getConexao();
	}
	
	@Override
	public void inserir(Nacionalidade nacionalidade) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		try {
			ps = conexao.prepareStatement(INSERT);
			ps.setInt(1, nacionalidade.getId());
			ps.setString(2, nacionalidade.getDescricao());
			ps.executeUpdate();
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro ao inserir a nacionalidade. Motivo: "+ e.getMessage());
		}
	}

}
