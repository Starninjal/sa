package core.service;

import core.dao.DaoUsuario;
import core.dao.FactoryDao;
import core.dao.postgresql.DaoPostgresqlUsuario;
import core.domain.Usuario;

public class UsuarioService {
	private DaoUsuario dao;
	
	public UsuarioService() {
		this.dao = FactoryDao.getInstance().getDaoUsuario();
	}
	
	public Usuario getUsuario(Usuario usuario) {
		DaoPostgresqlUsuario dao = new DaoPostgresqlUsuario();
		dao.serviceUsuario();
		return usuario;
	}
}
