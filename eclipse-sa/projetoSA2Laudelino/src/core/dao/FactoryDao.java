package core.dao;

import core.dao.postgresql.DaoPostgresqlNacionalidade;

public class FactoryDao {
	private static FactoryDao instance;
	
	private FactoryDao() {
		
	}
	
	public DaoNacionalidade getDaoNacionalidade() {
		return new DaoPostgresqlNacionalidade();
	}
	
	public static FactoryDao getInstance() {
		if (instance == null) {
			instance = new FactoryDao();
		}
		return instance;
	}
 }

