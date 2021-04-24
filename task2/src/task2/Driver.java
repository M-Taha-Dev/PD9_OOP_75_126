/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author M_Khuzaima
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Please enter a sentence: ");
        String input = obj.nextLine();
        
        System.out.println("Your sentence printed vertically is: ");
        System.out.print(displayVertical(input));
    }
    
    /**
     * this method returns the new string same as input string 
     * but only one character at a line.
     * @param input input string
     * @return new String contains only 1 character at a line
     */
    public static String displayVertical(String input) {
        String str = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch == ' ' || ch == '\t')) {
                str += ch + "\n";
            }
        }

        return str;
    }
}
