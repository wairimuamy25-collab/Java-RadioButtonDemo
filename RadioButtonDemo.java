import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
private JRadioButton birdButton;
private JRadioButton catButton;
private JRadioButton dogButton;
private JRadioButton rabbitButton;
private JRadioButton pigButton;

public RadioButtonDemo() {

    // Set the window title
    setTitle("RadioButtonDemo");

    // Set the window size
    setSize(450, 350);

    // Close the application when the window closes
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Center the window
    setLocationRelativeTo(null);

    // Create the main panel
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(7, 1, 5, 5));

    // Add a heading
    JLabel heading = new JLabel("Choose Your Favourite Pet");
    heading.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(heading);

    // Create five radio buttons
    birdButton = new JRadioButton("Bird");
    catButton = new JRadioButton("Cat");
    dogButton = new JRadioButton("Dog");
    rabbitButton = new JRadioButton("Rabbit");
    pigButton = new JRadioButton("Pig");

    // Group the radio buttons so only one can be selected
    ButtonGroup group = new ButtonGroup();

    group.add(birdButton);
    group.add(catButton);
    group.add(dogButton);
    group.add(rabbitButton);
    group.add(pigButton);

    // Add the radio buttons to the panel
    panel.add(birdButton);
    panel.add(catButton);
    panel.add(dogButton);
    panel.add(rabbitButton);
    panel.add(pigButton);

    // Create the selection button
    JButton showButton = new JButton("Show Selection");
    panel.add(showButton);

    // Display the selected pet in a message box
    showButton.addActionListener(e -> {

        String pet = "";

        if (birdButton.isSelected()) {
            pet = "Bird";
        } else if (catButton.isSelected()) {
            pet = "Cat";
        } else if (dogButton.isSelected()) {
            pet = "Dog";
        } else if (rabbitButton.isSelected()) {
            pet = "Rabbit";
        } else if (pigButton.isSelected()) {
            pet = "Pig";
        }

        if (pet.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Please select a pet."
            );
        } else {
            JOptionPane.showMessageDialog(
                this,
                "You selected: " + pet
            );
        }
    });

    // Add the panel to the window
    add(panel);

}

public static void main(String[] args) {

    // Create and display the application
    SwingUtilities.invokeLater(() -> {
        new RadioButtonDemo().setVisible(true);
    });

}

}
