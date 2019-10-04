package piggyBankApp;

public class Dollar extends Coin
{
    public Dollar(int quantity)
    {
        super(quantity);
        value = 1.00;
    }

    public Dollar()
    {
        super();
        value = 1.00;
    }

    @Override
    public String toString()
    {
        return "$" + quantity;
    }
}