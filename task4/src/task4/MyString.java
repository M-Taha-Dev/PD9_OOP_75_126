/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author M_Khuzaima
 */
public class MyString {

    String str = null;

    public boolean isPalindrome () {
        
        int size = this.str.length();
        
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != str.charAt(size-1-i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public MyString(String str) {
        this.str = str;
    }
    
    
    
    
}
