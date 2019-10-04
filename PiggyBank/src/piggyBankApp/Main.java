package piggyBankApp;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Coin> myList = new ArrayList<Coin>();

        myList.add(new Quarter());
        myList.add(new Dime());
        myList.add(new Dollar(5));
        myList.add(new Nickel(3));
        myList.add(new Dime(7));
        myList.add(new Dollar());
        myList.add(new Penny(10));

        myList.forEach(c -> System.out.println(c));

        double total = 0.00;
        for (Coin c : myList)
        {
            if (c instanceof Dollar)
            {
                total = total + (c.getQuantity() * 1.00);
            }
            if (c instanceof Quarter)
            {
                total = total + (c.getQuantity() * 0.25);
            }
            if (c instanceof Dime)
            {
                total = total + (c.getQuantity() * 0.10);
            }
            if (c instanceof Nickel)
            {
                total = total + (c.getQuantity() * 0.05);
            }
            if (c instanceof Penny)
            {
                total = total + (c.getQuantity() * 0.01);
            }
        }

        System.out.println("\n\nThe piggy bank holds $" + total);
    }
}