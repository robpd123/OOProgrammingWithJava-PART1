
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

    public Money plus(Money added) {

        Money plus = new Money(this.euros + added.euros, this.cents + added.cents());
        return plus;

    }

    public Money minus(Money decremented) {
        Money minus;

        if (this.less(decremented)) {
            minus = new Money(0, 0);
            return minus;
        }

        if (this.cents() < decremented.cents()) {
            minus = new Money(this.euros() - decremented.euros() - 1, this.cents() - decremented.cents() + 100);
            return minus;
        }

        minus = new Money(this.euros() - decremented.euros(), this.cents() - decremented.cents());
        return minus;

    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }

        if ((this.euros() == compared.euros()) && (this.cents() < compared.cents())) {
            return true;
        }

        return false;
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

}
