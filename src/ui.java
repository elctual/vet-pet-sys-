import javax.swing.*;

public class ui extends JFrame {
    public ui(){
        createFrame();
        panels();
    }
    public void createFrame(){
        JFrame frame = new JFrame("VetPet System");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(rootPaneCheckingEnabled);
        frame.setMinimumSize(new java.awt.Dimension(800, 600));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public void panels(){
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(0,0,400,1080);   
    panel.setBackground(new java.awt.Color(255, 255, 0));
    setSize(1920, 1080);
    add(panel);

    
    setVisible(true);
    }
    public static void main(String[] args) {
        new ui();
    }
    
}
