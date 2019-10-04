package piggyBankApp;

public class Quarter extends Coin
{

    public Quarter(int quantity)
    {
        super(quantity);
        value = 0.25;
    }

    public Quarter()
    {
        super();
        value = 0.25;
    }

    @Override
    public String toString()
    {
        return quantity + " Quarters";
    }
}