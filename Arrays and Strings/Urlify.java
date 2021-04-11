/**
 * Write a method to replace all spaces in a string with '%20'. 
 * You may assume that the string has sufficient space at the end to hold the
 * additional characters, and that you are given the "true"
 * length of the string. 
 * 
 * (Note: If implementing in Java, please use a character array so that you can
 *  perform this operation in place.)
 * 
 * EXAMPLE
 * 
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 * 
 * Hints: #53, # 118
 */

import java.util.Arrays;


//Solution O(n)
public class Urlify{
    
    public char[] function(char [] str, int len){
        int count = 0;
        for(int i = 0;i<len;i++){
            count += (str[i] == 32) ? 1:0;  
        }
        int end = len + (count * 2) -1;

        for(int i = len -1; i>=0;i--){
            if(str[i] == 32){
                str[end] = '0';
                str[end-1] = '2';
                str[end-2] = '%';
                end-=3;
            }else{
                str[end] = str[i];
                end--;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Urlify cci = new Urlify ();
        System.out.println(cci.function("Mr John Smith              ".toCharArray(),13 ));
    }
}