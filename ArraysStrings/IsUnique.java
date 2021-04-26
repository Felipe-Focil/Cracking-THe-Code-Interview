package ArraysStrings;

import java.util.Arrays;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
Hints: #44, #7 7 7, #732
 */

 
 //Solution O(k)
public class IsUnique{
    int ascii[] = new int[256];
    public boolean function(String str){
        
        Arrays.fill(ascii,0);
        if(str.length() > 256){
            return false;
        }else{
        for (char letter : str.toCharArray()){
            if(ascii[letter] == 0){
                ascii[letter] = 1;
            }else{
                return false;
            }
        }
        return true;
      }
    }

    public static void main(String[] args) {
        IsUnique CCI = new IsUnique();
        System.out.println(CCI.function("AaBbCc DdEe1236($")); 
        System.out.println(CCI.function("Cracking The Code Interview")); 
    }

}