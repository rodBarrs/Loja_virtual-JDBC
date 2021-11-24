import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3307/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root");
	}
	
	

	public Connection recuperarConexao() throws SQLException {

		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root");

	}
	
	

}
