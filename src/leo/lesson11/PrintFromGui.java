package leo.lesson11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PrintFromGui implements ActionListener {
    private JTextField editText;

    public static void main(String[] args) {
        PrintFromGui app = new PrintFromGui();
        app.runApp();
    }

    private void runApp() {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);

        editText = new JTextField();
        editText.setText("Print smth here");

        JButton button = new JButton();
        button.setText("Click me and I'll print everything in console");
        button.setVisible(true);
        button.setSize(100, 50);
        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.NORTH, editText);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(editText.getText());
    }
}
