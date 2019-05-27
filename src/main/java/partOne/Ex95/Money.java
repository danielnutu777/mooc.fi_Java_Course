
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        int sumEuro = this.euros + added.euros;
        int sumCents = this.cents + added.cents;

        return new Money(sumEuro, sumCents);
    }

    public boolean less(Money compared){


            if(this.euros < compared.euros){
                return true;
            }else if(this.euros == compared.euros && this.cents < compared.cents){
                return true;
            }

        return false;
    }

    public Money minus(Money decremented){
        int diffEuros = this.euros - decremented.euros;
        int diffCents = this.cents - decremented.cents;

       /* if(this.euros < decremented.euros){
            return new Money(0,0);
        }else{
            if(Math.abs(this.cents - decremented.cents) < 50){
                return new Money(diffEuros - 1, 0);
            }
            return new Money(diffEuros + 1, 0);
        }*/
       if(diffEuros < 0){
           diffEuros = 0;
       }
       if((this.cents != 0 || decremented.cents != 0) && diffEuros > 0){
           return new Money(diffEuros - 1, 100 - Math.abs(this.cents - decremented.cents));
       }
       return new Money(diffEuros, 0);
    }

}
