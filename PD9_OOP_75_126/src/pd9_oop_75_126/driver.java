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
 * @return void
 */
    public static String menu() {
        String var = JOptionPane.showInputDialog("Choose from the following options: \n 1. Task 1 \n 2. Task 2 \n 3. Task 3 \n 4. Task 4 \n 0. Exit");
        return var;
    }
    
    /**
     * prints menu for task 3
     * @return 
     */
    
    public static String t3Menu(){
        String var = JOptionPane.showInputDialog("Choose from the following options: \n 1. Remove multiple blank spaces \n 2. Remove integers \n 3. String Encryption \n 0. Back");
return var;    }
    
    

    public static void main(String[] args) {
        String input = "0";
        String t3Input = "0";
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
                    break;
                    
                 case "0":
                                
                                break;
                    
                        
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input");
            }

        } while (!input.equals(
                "0"));
    }
}
