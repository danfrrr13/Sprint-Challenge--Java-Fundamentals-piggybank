package piggyBankApp;

public class Nickel extends Coin
{
    public double value = 0.05;

    public Nickel(int quantity)
    {
        super(quantity);
    }

    public Nickel()
    {
        super();
    }

    public double getTotalValue()
    {
        return quantity * value;
    }

    @Override
    public String toString()
    {
        return quantity + " Nickels";
    }
}