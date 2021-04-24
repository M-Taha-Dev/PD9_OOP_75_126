/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9_oop_75_126;

/**
 *
 * @author DELL
 */
import java.util.*;
import javax.swing.JOptionPane;

public class Task1 {

    public static int wordCounter(String s) {
        int count = 1;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int vowelcounter(String s) {
        int count = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'a' || arr[i] == 'E' || arr[i] == 'e' || arr[i] == 'I' || arr[i] == 'i'
                    || arr[i] == 'O' || arr[i] == 'o' || arr[i] == 'U' || arr[i] == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int puncCount(String s) {
        int count = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ';' || arr[i] == ':' || arr[i] == '.' || arr[i] == 34 || arr[i] == 39 || arr[i] == '!' || arr[i] == ','
                    || arr[i] == '-') {
                count++;
            }

        }

        return count;
    }

    public static boolean findSubString(String s, String sub) {
        boolean check = false;
        char[] stringArray = s.toCharArray();
        char[] subArray = sub.toCharArray();
        List<Integer> intList = new ArrayList<>();
        try {
            for (int i = 0; i < stringArray.length; i++) {
                if (subArray[0] == stringArray[i]) {
                    intList.add(i);
                    //System.out.println(i);
                }
            }
            int count = 0;
            while (count != intList.size()) {
                for (int i = 0; i < subArray.length; i++) {
                    for (int j = intList.get(count); j < (intList.get(count) + subArray.length); j++) {

                        if (subArray[i] == stringArray[j]) {
                            check = true;
                            i++;
                        } else {
                            check = false;
                            break;
                        }

                    }

                    if (check) {
                        return true;
                    } else {
                        break;
                    }
                }
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {

        }

        return check;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter a String: ");
        //Scanner objScanner = new Scanner(System.in);
        //String inputString = objScanner.nextLine();
        //objScanner.close();
        String inputString = JOptionPane.showInputDialog("Enter a String: ");
        String sub = JOptionPane.showInputDialog("Enter a sub string: ");
        //int count = wordCounter(inputString);
        boolean flag = findSubString(inputString, sub);
        int wordCount = wordCounter(inputString);
        int vowelCount = vowelcounter(inputString);
        int pCount = puncCount(inputString);
        if (flag) {
            System.out.println("No. of words: " + wordCount + "\n" + "No. of vowels: " + vowelCount + "\n" + "No. of punctuations: " + pCount + "\n" + '\"' + sub + '\"' + " is a part of String");
        } else {
            System.out.println("No. of words: " + wordCount + "\n" + "No. of vowels: " + vowelCount + "\n" + "No. of punctuations: " + pCount + "\n" + '\"' + sub + '\"' + " is not a part of String");
        }
    }

}
