/**
 * Check Permutation: Given two strings,
 * Write a method to decide if one is a permutation of the other.
 * 
 * Hints: #7, #84, #722, #737 
 */
import java.util.Arrays;

//Solution O (m + n)

public class CheckPermutation {
       private int s1[] = new int[256];
       private int s2[] = new int[256];

    private boolean isPermutation(String str1, String str2){
        Arrays.fill(s1,0);
        Arrays.fill(s2,0);

        for (char letter : str1.toCharArray()){
            s1[letter]++;
        }

        for (char letter : str2.toCharArray()){
            s2[letter]++;
        }

        for (char letter : str1.toCharArray()){
            if(s1[letter] != s2[letter]){
                return false;
            }
        }

        return true;
    }

    public boolean function(String str1, String str2){
        if(str2.length() != str1.length()){
            return false;
        }else{
            return isPermutation(str1, str2);
        }
    }

    public static void main(String[] args) {
        CheckPermutation cci = new CheckPermutation();
        System.out.println(cci.function("bat", "abt"));
        System.out.println(cci.function("bat", "at"));
        System.out.println(cci.function("bot", "booter"));
        System.out.println(cci.function("no", "yes"));
    }
}
