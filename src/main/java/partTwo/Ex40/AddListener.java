import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddListener implements ActionListener {
    private JTextField output;
    private JTextField input;
    private Calculator calculator;
    private JButton reset;

    public AddListener(JTextField output, JTextField input, JButton reset) {
        this.output = output;
        this.input = input;
        this.calculator = new Calculator();
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isNumeric()){
            calculator.setInput(Integer.parseInt(input.getText()));
            calculator.setOutput(Integer.parseInt(output.getText()));
            calculator.add();
            output.setText(String.valueOf(calculator.getOutput()));
            input.setText("");
            if(!output.getText().equals("0")){
                reset.setEnabled(true);
            }
        } else{
            input.setText("");
        }

    }

    public boolean isNumeric(){
        try {
            Integer.parseInt(input.getText());
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
