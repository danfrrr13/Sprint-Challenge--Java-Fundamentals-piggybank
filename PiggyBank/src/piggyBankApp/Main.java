package piggyBankApp;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        ArrayList<Coin> myList = new ArrayList<Coin>();

        System.out.println();

        myList.add(new Quarter());
        myList.add(new Dime());
        myList.add(new Dollar(5));
        myList.add(new Nickel(3));
        myList.add(new Dime(7));
        myList.add(new Dollar());
        myList.add(new Penny(10));

        myList.forEach(c -> System.out.println(c));

        double total = 0.00;
        // for (Coin c : myList)
        // {
        //     if (c instanceof Dollar)
        //     {
        //         total = total + (c.getQuantity() * 1.00);
        //     }
        //     if (c instanceof Quarter)
        //     {
        //         total = total + (c.getQuantity() * 0.25);
        //     }
        //     if (c instanceof Dime)
        //     {
        //         total = total + (c.getQuantity() * 0.10);
        //     }
        //     if (c instanceof Nickel)
        //     {
        //         total = total + (c.getQuantity() * 0.05);
        //     }
        //     if (c instanceof Penny)
        //     {
        //         total = total + (c.getQuantity() * 0.01);
        //     }
        // }

        for (Coin c : myList)
        {
            total = total + c.getTotalValue();
        }

        System.out.println("\n\nThe piggy bank holds " + fp.format(total));
    }
}