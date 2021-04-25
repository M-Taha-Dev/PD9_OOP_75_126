/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

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
//        String input = obj.nextLine();
        MyString input = new MyString(obj.nextLine());
        
        if(input.isPalindrome()) {
            System.out.println("Given String is palindrome.");
        }
        else {
            System.out.println("Given String is not a palindrome.");
        }
        
//        System.out.println("Camel case: " + input.toCamelCase());
//        System.out.println("Title case: " + input.toTitleCase());
//        System.out.println("remove punctuation: " + input.removePunctuation() );
//        System.out.println("remove vowels: " + input.removeVowels());
//        System.out.println("extract digits: " + input.extractDigits());
//        
        
    }
    
}
