import java.sql.*;
import javax.swing.*;
public class processes extends JFrame {
   private String url = "jdbc:mysql://localhost/vetpet";
	private String user = "root";
	private String pass = "160204";
	private Statement statement;

    public processes() {
      try {
			Connection connection = DriverManager.getConnection(url, user, pass);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
						ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    
}