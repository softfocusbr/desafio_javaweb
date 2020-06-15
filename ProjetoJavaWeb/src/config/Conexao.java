package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.flywaydb.core.Flyway;

public class Conexao {

    private static final String url = "jdbc:h2:~/test";
    private static final String usuario = "sa";
	private static final String senha = "sa";
	private static Connection con = null;

	private static Connection getConnection() throws Exception {
		if (con == null) {
            con = DriverManager.getConnection(url, usuario, senha);
		}
		return con;
	}

	public static Statement getStatement() throws Exception {
		return Conexao.getConnection().createStatement();
	}

	public static void migrarBanco() {
        Flyway flyway = Flyway.configure()
            .dataSource(url, usuario, senha)
            .outOfOrder(true)
            .baselineOnMigrate(true)
            .ignoreFutureMigrations(false)
            .load();
        flyway.migrate();
    }
}
