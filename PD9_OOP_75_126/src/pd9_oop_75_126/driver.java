/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9_oop_75_126;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class driver {
/**
 * prints Main Menu
 * @return the input of the use
 */
    public static String menu() {
        String var = JOptionPane.showInputDialog("Choose from the following options: \n"
                + " 1. Task 1 \n"
                + " 2. Task 2 \n"
                + " 3. Task 3 \n"
                + " 4. Task 4 \n"
                + " 0. Exit");
        if (var == null) {
            var = "-1";
        }
        return var;
    }
    
    /**
     * prints menu for task 3
     * @return user entered input
     */
    
    public static String t3Menu(){
        String var = JOptionPane.showInputDialog("Choose from the following options: \n"
                + " 1. Remove multiple blank spaces \n"
                + " 2. Remove integers \n"
                + " 3. String Encryption \n"
                + " 0. Back");
        if (var == null) {
            var = "-1";
        }
        return var;
    }
    
    /**
     * menu for the task 4. It will be used to take input in the task 4
     * @return the input of the user
     */
    public static String t4Menu(){
        String var = JOptionPane.showInputDialog("Choose from the following options: \n"
                + " 1. Extract Alpahabets and space\n"
                + " 2. Extract Digits \n"
                + " 3. Palindrome Checker \n"
                + " 4. Remove Punctuation characters\n"
                + " 5. remove vowels\n"
                + " 6. Revers the string\n"
                + " 7. Convert to Camel Case\n"
                + " 8. Convert to Title Case\n"
                + " 0. Back");
        if (var == null) {
            var = "-1";
        }
        return var;
    }

    public static void main(String[] args) {
        System.out.println("Hello UET");
        String input = "0";
        String t3Input = "0", t4Input = "0";
        MyString myStr;
        String inputString;
        String outString;
        do {
            input = menu();
            switch (input) {
                case "1":

                    inputString = JOptionPane.showInputDialog("Enter a String: ");
                    String sub = JOptionPane.showInputDialog("Enter a sub string: ");
                    boolean flag = Task1.findSubString(inputString, sub);
                    int wordCount = Task1.wordCounter(inputString);
                    int vowelCount = Task1.vowelcounter(inputString);
                    int pCount = Task1.puncCount(inputString);
                    if (flag) {
                        System.out.println("No. of words: " + wordCount + "\n" + "No. of vowels: " + vowelCount + "\n" + "No. of punctuations: " + pCount + "\n" + '\"' + sub + '\"' + " is a part of String");
                    } else {
                        System.out.println("No. of words: " + wordCount + "\n" + "No. of vowels: " + vowelCount + "\n" + "No. of punctuations: " + pCount + "\n" + '\"' + sub + '\"' + " is not a part of String");
                    }
                    break;
                    
                case "2":
                    String t2Input = JOptionPane.showInputDialog("Please enter a String: ");
                    if (t2Input != null ) {
                        JOptionPane.showMessageDialog(null, 
                            "Your sentence printed vertically is: \n" + 
                            task2.displayVertical(t2Input)
                        );
                    }
                    break;
                
                case "3":
                    do {   
                        t3Input = t3Menu();
                        switch (t3Input){
                            
                            case "1":
                                inputString = JOptionPane.showInputDialog("Enter a String: ");
                                outString = Task3.ridMultipleBlank(inputString);
                                System.err.println("Output: " + outString);
                                       
                                
                                break;
                                
                            case "2":
                                inputString = JOptionPane.showInputDialog("Enter a String: ");
                                outString = Task3.removeInteger(inputString);
                                System.err.println("Output: " + outString);
                                
                                
                                
                                break;
                            
                            case "3":
                                
                                inputString = JOptionPane.showInputDialog("Enter a String: ");
                                outString = Task3.stringEncryption(inputString);
                                System.err.println("Output: " + outString);
                                break;
                                
                            case "0":
                                
                                break;
                             default:
                            JOptionPane.showMessageDialog(null,"Invalid Input");
                            
                        }    
                    } while (!t3Input.equals("0"));
                    break;

                case "4":
                    do {
                        input = t4Menu();
                        switch (input) {
                            //extract alphabets and space
                            case "1":
                                t4Input = JOptionPane.showInputDialog("Please enter a String: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "Extract alphabets\n" + myStr.extractAlphabetsAndSpace());
                                break;
                                
                            //Extract Digits
                            case "2":
                                t4Input = JOptionPane.showInputDialog("Please enter a String: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "Extracted digits\n" + myStr.extractDigits());
                                break;
                            
                            //Palindrome Checker
                            case "3":
                                t4Input = JOptionPane.showInputDialog("Please enter a String for palindrome checking: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "Given string is " + (myStr.isPalindrome() ?"": "not ") + "a palindrome" );
                                break;
                            
                            //Remove Punctuation characters
                            case "4":
                                t4Input = JOptionPane.showInputDialog("Please enter a String to remove puntuation characters: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "After removing punctuation characters\n" + myStr.removePunctuation());
                                break;
                                
                            //remove vowels
                            case "5":
                                t4Input = JOptionPane.showInputDialog("Please enter a String to remove vowels: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "After removing vowels\n" + myStr.removeVowels());
                                break;
                                
                            //Revers the string
                            case "6":
                                t4Input = JOptionPane.showInputDialog("Please enter a String: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "Reversed string is\n" + myStr.reverse());
                                break;
                                
                            //Convert to Camel Case
                            case "7":
                                t4Input = JOptionPane.showInputDialog("Please enter a String: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "After converting to camel case" + myStr.toCamelCase());
                                break;
                                
                            //Convert to Title Case
                            case "8":
                                t4Input = JOptionPane.showInputDialog("Please enter a String: ");
                                myStr = new MyString(t4Input);
                                JOptionPane.showMessageDialog(null, "After converting to Title case" + myStr.toTitleCase());
                                break;
                                
                            //back
                            case "0":
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null,"Invalid Input");
                        }
                        
                    } while (!input.equals("0"));
                    input = "4";
                    break;
                    
                 case "0":
                    break;
                    
                        
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input");
            }

        } while (!input.equals("0"));
    }
}
