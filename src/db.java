import java.sql.*;


public class db {
    private String url = "jdbc:mysql://localhost/vetpet";
	private String user = "root";
	private String pass = "160204";
	private Statement statement;

    public db() {
		connectToDatabase();

    }
	public void connectToDatabase() {
		try {
			Connection connection = DriverManager.getConnection(url, user, pass);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
						ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			System.out.println("Connection failed: " + e.getMessage());
		}
	}

	private String test1() throws SQLException{
		String query = "SELECT petID FROM pet";
		try (ResultSet resultSet = statement.executeQuery(query)) {
			if (resultSet.next()) {
				return resultSet.getString("petID");
			}else{
				return "test1 petID not found";
			}
		}
	}	
public static void main(String[] args) {
	db dbInstance = new db();
	try {
		String petID = dbInstance.test1();
		System.out.println("Retrieved petID: " + petID);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}