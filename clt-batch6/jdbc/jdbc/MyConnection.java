package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection prepareConnection()throws SQLException, ClassNotFoundException
	{
	//database URL
	// 3306 is the default port for mysql
	String connectionURL ="jdbc:mysql://localhost:3306/clt6"; // clt6 is database name
	
	// database credentials
	String uname = "root";
	String pwd = "root";
	
	// Register JDBC driver
	Class.forName("com.mysql.jdbc.Driver");
	
	// Open Connection
	Connection ref = DriverManager.getConnection(connectionURL,uname,pwd);
	return ref;
	}

}
