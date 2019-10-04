package piggyBankApp;

public abstract class Coin
{
    protected int quantity;
    
    public Coin(int quantity)
    {
        this.quantity = quantity;
    }

    public Coin()
    {
        this.quantity = 1;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}