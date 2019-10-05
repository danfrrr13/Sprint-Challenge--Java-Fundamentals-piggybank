package piggyBankApp;

public class Dime extends Coin
{
    public Dime(int quantity)
    {
        super(quantity);
        value = 0.10;
    }

    public Dime()
    {
        super();
        value = 0.10;
    }

    @Override
    public String toString()
    {
        return quantity + " Dimes";
    }
}