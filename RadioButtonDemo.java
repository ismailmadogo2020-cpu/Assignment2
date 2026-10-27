import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("RadioButtonDemo");

        frame.setSize(400, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(6, 1));

        JRadioButton bird = new JRadioButton("Bird");
        JRadioButton cat = new JRadioButton("Cat");
        JRadioButton dog = new JRadioButton("Dog");
        JRadioButton rabbit = new JRadioButton("Rabbit");
        JRadioButton pig = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();

        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        pig.setSelected(true);

        JButton showButton = new JButton("Show Selection");

        showButton.addActionListener(e -> {

            String selectedPet = "";

            if (bird.isSelected()) {
                selectedPet = "Bird";
            } else if (cat.isSelected()) {
                selectedPet = "Cat";
            } else if (dog.isSelected()) {
                selectedPet = "Dog";
            } else if (rabbit.isSelected()) {
                selectedPet = "Rabbit";
            } else if (pig.isSelected()) {
                selectedPet = "Pig";
            }

            JOptionPane.showMessageDialog(
                    frame,
                    "You selected: " + selectedPet);
        });

        panel.add(bird);
        panel.add(cat);
        panel.add(dog);
        panel.add(rabbit);
        panel.add(pig);
        panel.add(showButton);

        // Add the panel to the window
        frame.add(panel);

        // Display the window
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}