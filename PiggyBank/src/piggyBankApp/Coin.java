package piggyBankApp;

public abstract class Coin
{
    protected int quantity;
    protected double value;
    
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

    public double getTotalValue()
    {
        return quantity * value;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}