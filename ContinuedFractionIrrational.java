/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discrete;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuedFractionIrrational
{

    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("n:");
        n = input.nextInt();       

        int floor = (int) Math.sqrt(n);

        ArrayList<Integer> quotients = new ArrayList<>();

        int m = 0;
        int d = 1;
        int a = floor;

        for (int i = 0; i < 10; i++) {
            quotients.add(a);

            m = d * a - m;
            d = (n - m * m) / d;
            a = (floor + m) / d;
        }

        System.out.println("Quotients:");
        System.out.println(quotients);
    }
}
