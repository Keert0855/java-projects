/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discrete;

import java.util.ArrayList;

public class DiscreteE 
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        double x = Math.E;
        ArrayList<Integer> quotients = new ArrayList<>();

        System.out.println("Quotients for e:");

        for (int i = 0; i < 20; i++) 
        {
            int a = (int) Math.floor(x);
            quotients.add(a);

            double frac = x - a;
            
            if (frac < 1e-10)
            {
                i = 16;
            }

            x = 1.0 / frac;
        }

        for (Integer q : quotients)
        {
            System.out.println(q);
        }
    }
}
