import core.dao.postgresql.DaoPostgresqlNacionalidade;
import core.domain.Nacionalidade;

public class Principal {
	public static void main(String[] args) {
		DaoPostgresqlNacionalidade dao = new DaoPostgresqlNacionalidade();
		Nacionalidade nacionalidade = new Nacionalidade(4, "Ruan");
		dao.inserir(nacionalidade);
	}
}
