package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@np.wdkim.com:1521/xe", "power", "1234");
		return conn;
	}
	public static void main(String[] args) throws Exception{
	}
}