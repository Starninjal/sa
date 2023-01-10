package br.com.senai.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ManagerDb {
	private static ManagerDb manager;
	
	private Connection conexao;
	
	private ManagerDb() {
		try {
			Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance(null);
			this.conexao = DriverManager.getConnection("jdbc:postgresql://containers-us-west-102.railway.app:5809/railway?currentSchema=senai",
					"senai", "senai@db");
		} catch(Exception e) {
			throw new RuntimeException("Ocorreu um erro de conexao com o banco de dados. Motivo: " + e.getMessage());
		}
		 
	}
}
