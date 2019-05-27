
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(3,1);
        container.setLayout(gridLayout);

        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField();

        JButton addBtn = new JButton("+");
        JButton minusBtn = new JButton("-");
        JButton resetBtn = new JButton("Z");
        resetBtn.setEnabled(false);


        AddListener addListener = new AddListener(output, input, resetBtn);
        addBtn.addActionListener(addListener);

        MinusListener minusListener = new MinusListener(output, input, resetBtn);
        minusBtn.addActionListener(minusListener);

        ResetListener resetListener = new ResetListener(output,input, resetBtn);
        resetBtn.addActionListener(resetListener);

        container.add(output);
        container.add(input);
        container.add(createPanel(addBtn, minusBtn, resetBtn), BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel createPanel(JButton jButton, JButton jButton2, JButton jButton3){
        JPanel jPanel = new JPanel(new GridLayout(1,3));
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        return jPanel;
    }
}
