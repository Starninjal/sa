package core.dao;

import core.dao.postgresql.DaoPostgresqlUsuario;

public class FactoryDao {
	private static FactoryDao instance;
	
	private FactoryDao() {
		
	}
	
	public DaoUsuario getDaoUsuario() {
		return new DaoPostgresqlUsuario();
	}
	
	public static FactoryDao getInstance() {
		if (instance == null) {
			instance = new FactoryDao();
		}
		return instance;
	}
 }

