import javax.swing.*;

/**
 * A class for creating a GUI window to input user data.
 */
public class Datos extends JFrame {

    private JLabel label1, label2; // JLabel attributes for storing label objects

    /**
     * Constructor for creating a Datos object.
     */
    public Datos() {
        JPanel panel1 = new JPanel();

        label1 = new JLabel("Digite los datos del usuario."); // Create label1 object
        panel1.add(label1); // Add label1 to panel1
        add(panel1); // Add panel1 to the window

        label2 = new JLabel("Version 0.0.1"); // Create label2 object
        panel1.add(label2); // Add label2 to panel1
        add(panel1); // Add panel1 to the window
    }

    /**
     * The main method that runs the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Datos formulario1 = new Datos(); // Create a new Datos object
        formulario1.setBounds(50, 50, 250, 150); // Set the position and size of the window
        formulario1.setVisible(true); // Make the window visible
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
    }
}