package jdbc;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database01 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		// step 1 : call your prepareConnection() from MyConnection class
		Connection con = MyConnection.prepareConnection();
		
		// Execute a query
		System.out.println("Creating table in given database...");
		Statement st = con.createStatement();
		
		// create table
		String sql = "CREATE TABLE person " +
				"(id INTEGER not NULL," +
				"name VARCHAR(25)," +
				"password VARCHAR(30)," +
				"dob INTEGER," +
				"PRIMARY KEY (id))";
			st.executeUpdate(sql); // for saying purpose
		System.out.println("Created table in given database....");
		
		/*// insert record
		String sql = "INSERT INTO students " +
				"VALUES (676098612,'yugal','yugal@gmail.com')";
		st.executeUpdate(sql);
		
		System.out.println("Data Inserted Successfully...");*/
		
		// edit a record
		String sql = "UPDATE students " +
				"SET name = 'vikas' WHERE mobile in (676098612)";
		st.executeUpdate(sql);
		System.out.println("Record modified successfully");
		
		/*// delete a record
				String sql = "DELETE FROM students" +
						"WHERE mobile = 96016891";
				st.executeUpdate(sql);
				System.out.println("Record deleted from table successfully");
				
		// Retrieve Data fromTable
				String sql = "SELECT mobile, name, email FROM students";
					ResultSet rs = st.executeQuery(sql);
					
					// STEP 5: Extract data from result set
					
					System.out.println("\n\n");
					System.out.println("Mobile\t\t"+"Name"+"\t\t"+"Email");
					System.out.println("==========================================");
					
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t\t"+rs.getString(3));
					}*/
		}

}
