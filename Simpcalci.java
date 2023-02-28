import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    // Declare GUI components
    private JTextField operand1, operand2, result;
    private JButton add, subtract, multiply, divide;

    public SimpleCalculator() {
        // Set up the GUI components
        operand1 = new JTextField(10);
        operand2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");

        // Add action listeners to buttons
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        // Set up the layout
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(new JLabel("Operand 1: "));
        panel1.add(operand1);
        panel1.add(new JLabel("Operand 2: "));
        panel1.add(operand2);
        panel1.add(new JLabel("Result: "));
        panel1.add(result);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 4));
        panel2.add(add);
        panel2.add(subtract);
        panel2.add(multiply);
        panel2.add(divide);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panel1, BorderLayout.CENTER);
        container.add(panel2, BorderLayout.SOUTH);

        // Set the title, size, and visibility
        setTitle("Simple Calculator");
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the values of the operands
        double op1 = Double.parseDouble(operand1.getText());
        double op2 = Double.parseDouble(operand2.getText());

        // Perform the appropriate operation based on the button pressed
        if (e.getSource() == add) {
            result.setText(Double.toString(op1 + op2));
        } else if (e.getSource() == subtract) {
            result.setText(Double.toString(op1 - op2));
        } else if (e.getSource() == multiply) {
            result.setText(Double.toString(op1 * op2));
        } else if (e.getSource() == divide) {
            result.setText(Double.toString(op1 / op2));
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
