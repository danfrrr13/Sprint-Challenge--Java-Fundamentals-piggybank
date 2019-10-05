package piggyBankApp;

public class Nickel extends Coin
{

    public Nickel(int quantity)
    {
        super(quantity);
        value = 0.05;
    }

    public Nickel()
    {
        super();
        value = 0.05;
    }

    @Override
    public String toString()
    {
        return quantity + " Nickels";
    }
}