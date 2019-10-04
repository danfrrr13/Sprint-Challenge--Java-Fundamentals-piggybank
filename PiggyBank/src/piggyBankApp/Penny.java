package piggyBankApp;

public class Penny extends Coin
{
    public Penny(int quantity)
    {
        super(quantity);
        value = 0.01;
    }

    public Penny()
    {
        super();
        value = 0.01;
    }

    @Override
    public String toString()
    {
        return quantity + " Pennies";
    }
}