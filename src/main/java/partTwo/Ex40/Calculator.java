public class Calculator {
    private int output;
    private int input;

    public Calculator() {
        this.output = 0;
        this.input = 0;
    }

    public void add(){
        output += input;
    }

    public void take(){
        output -= input;
    }

    public int getOutput() {
        return output;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
