package piggyBankApp;

public class Penny extends Coin
{
    public double value = 0.01;

    public Penny(int quantity)
    {
        super(quantity);
    }

    public Penny()
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
        return quantity + " Pennies";
    }
}