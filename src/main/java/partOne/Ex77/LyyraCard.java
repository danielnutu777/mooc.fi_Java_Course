package partOne.Ex77;

public class LyyraCard {
    public double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString(){
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if(balance >= 2.50){
            balance -= 2.50;
        }

    }

    public void payGourmet() {
        // write code here

        if(balance >= 4.00){
            balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if(amount > 0){
            balance += amount;
        }

        if(balance > 150.0){
            balance = 150.0;
        }

    }
}
