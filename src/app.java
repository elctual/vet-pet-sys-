public class app {
    public static void main(String[] args) {

        // Initialize the main application window
        utils mainWindow = new utils();
        
        // Initialize the database connection and processes
        db dbchild = new db();
        
        // Set the visibility of the main window
        mainWindow.setVisible(true);
    }
}
