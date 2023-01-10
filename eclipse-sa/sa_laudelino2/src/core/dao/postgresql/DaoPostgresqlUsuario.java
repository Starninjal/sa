package core.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import core.dao.DaoUsuario;
import core.dao.ManagerDb;
import core.domain.Usuario;
import core.service.UsuarioService;

public class DaoPostgresqlUsuario implements DaoUsuario{
	
	private final String SELECT_USUARIO = "SELECT"
		 	                                + "u.id, u.login_usuario, u.senha_usuario "
				                        + "FROM"
				                            + "usuario as u";
		
	private Connection conexao;
	
	private UsuarioService service;
	
	private Usuario usuario;
		
	public DaoPostgresqlUsuario() {
			this.conexao = ManagerDb.getInstance().getConexao();
		}
	
	public void extrairDo(ResultSet rs) {
		try {
			 int id = rs.getInt("id");
			 String login = rs.getString("login_usuario");
			 String senha = rs.getString("senha_usuario");
			 usuario = new Usuario(id, login, senha);
			 service.getUsuario(usuario);
			 
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro ao extrair o usuario. Motivo: " + e.getMessage());
		}
		
	}
	
	public void serviceUsuario() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conexao.prepareStatement(SELECT_USUARIO);
			rs = ps.executeQuery();
			while(rs.next()) {
				extrairDo(rs);
			}
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro ao receber o usuário. Motivo: " + e.getMessage());
		}
	}
	
	
		
		
		
				
}	
