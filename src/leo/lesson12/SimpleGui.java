package leo.lesson12;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SimpleGui  {
    private JTextField editText;
    private final ActionListener actionListener;
    private static final String INITIAL_TEXT = "Here I'll print random number";
    private static final String BTN_ACTIVE = "Click me to get random value";

    public SimpleGui(ActionListener actionListener) {
        this.actionListener = actionListener;
        initGui();
    }

    private void initGui() {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);

        editText = new JTextField();
        editText.setText(INITIAL_TEXT);

        JButton button = new JButton();
        button.setText(BTN_ACTIVE);
        button.setVisible(true);
        button.setSize(100, 50);
        button.addActionListener(actionListener);

        frame.getContentPane().add(BorderLayout.NORTH, editText);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setValueText(String text) {
        editText.setText(text);
    }
}
