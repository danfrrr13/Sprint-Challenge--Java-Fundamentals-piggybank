package piggyBankApp;

public class Dime extends Coin
{
    public double value = 0.10;

    public Dime(int quantity)
    {
        super(quantity);
    }

    public Dime()
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
        return quantity + " Dimes";
    }
}