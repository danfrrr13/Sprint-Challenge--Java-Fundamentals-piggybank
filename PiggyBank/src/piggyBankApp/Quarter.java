package piggyBankApp;

public class Quarter extends Coin
{
    public double value = 0.25;

    public Quarter(int quantity)
    {
        super(quantity);
    }

    public Quarter()
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
        return quantity + " Quarters";
    }
}