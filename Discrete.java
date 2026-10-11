/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discrete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author keert
 */
public class Discrete {

    /**
     * @param args 
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        int den;
        
        System.out.println("Numerator:");
        num = input.nextInt();
        
        System.out.println("Denominator:");
        den = input.nextInt();
        
        ArrayList<Integer> euclid = new ArrayList<>();
        
        System.out.println("Quotients:");


        int floor;
        int r;
        
        while (den > 0)
        {
            floor = num / den;
            euclid.add(floor);
            r = num % den;
            num = den;
            den = r;
        }
       
        
        for (Integer i : euclid)
        {
            System.out.println(i);
        }        
    }
    
}
