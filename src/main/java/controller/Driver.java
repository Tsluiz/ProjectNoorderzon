package controller;

import java.sql.*;

/**
 * Created by TSluizeman on 27/06/2018
 */
public class Driver {

	try(
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "secret");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("SELECT last_name, salary FROM employees"))

	{ while (rs.next()) {System.out.println(rs.getString("last_name"));
			System.out.println(rs.getBigDecimal("salary"));}
	}
			catch(SQLException e)
	{ System.err.println(e.getMessage());}

}
