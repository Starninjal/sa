package core.service;

import core.dao.DaoNacionalidade;
import core.dao.FactoryDao;

public class NacionalidadeService {
	
	private DaoNacionalidade dao;
	
	public NacionalidadeService() {
		this.dao = FactoryDao.getInstance().getDaoNacionalidade();
	}
}
