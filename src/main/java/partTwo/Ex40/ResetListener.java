import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener {
    private JTextField output;
    private JTextField input;
    private Calculator calculator;
    private JButton reset;

    public ResetListener(JTextField output, JTextField input, JButton reset) {
        this.output = output;
        this.input = input;
        this.calculator = new Calculator();
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.setOutput(0);
        output.setText(String.valueOf(calculator.getOutput()));
        input.setText("");
        reset.setEnabled(false);
    }
}
