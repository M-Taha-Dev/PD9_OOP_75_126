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
public class Task3 {
	
	public static String removeInteger(String s) {
		char arr[] = s.toCharArray();
		String temp = "";
		for(int i=0;i<arr.length;i++) {
			if(!(arr[i] >= '0' && arr[i] <= '9'))
			{
				temp = temp + arr[i];
			}
		}
		return temp;
	}
	
	public static String ridMultipleBlank(String s) {
		char arr[] = s.toCharArray();
		String temp = "";
		try
		{
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i] == ' ' && arr[i+1] == ' '))
			{
				temp += arr[i];
			}
		}
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			
		}
		return temp;
	}
	
	public static String stringEncryption(String s) {
		String encryptedString = "";
		char arr[] = s.toCharArray();
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = (char) (arr[i] - 26);
			encryptedString += arr[i];
		}
		return encryptedString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Enter the String: ");
		String output = stringEncryption(input);
		System.out.println(output);	
	}
}

