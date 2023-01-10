package core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ManagerDb {
	private static ManagerDb manager;
	
	private Connection conexao;
	
	private ManagerDb() {
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sa_clavison",
												"root",
												"Btwimgood");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Connection getConexao() {
		return conexao;
	}
	
	public void configurarAutoCommitDa(Connection conexao, boolean isHabilitado) {
		try {
			if (conexao != null) {
				conexao.setAutoCommit(isHabilitado);
			}
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro na ativação do autocommit. Motivo: " + e.getMessage());
		}
	}
	
	public void fechar(PreparedStatement ps) {
		try {
			
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro no fechamento do preparedStatement. Motivo: " + e.getMessage());
		}
	}
	
	public void fechar(ResultSet rs) {
		try {
			
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro no fechamento do ResultSet. Motivo: " + e.getMessage());
		}
	}
	
	public static ManagerDb getInstance() {
		if(manager == null) {
			manager = new ManagerDb();
		}
		
		return manager;
	}
}
		

