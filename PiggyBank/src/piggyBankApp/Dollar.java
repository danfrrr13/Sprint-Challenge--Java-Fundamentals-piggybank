package piggyBankApp;

public class Dollar extends Coin
{
    public double value = 1.00;

    public Dollar(int quantity)
    {
        super(quantity);
    }

    public Dollar()
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
        return "$" + quantity;
    }
}