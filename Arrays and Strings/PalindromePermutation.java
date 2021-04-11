import java.util.Arrays;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is 
 * a permutation of a palindrome. A palindrome is a word or phrase that is the same 
 * forwards and backwards. A permutationis a rearrangement of letters. 
 * The palindrome does not need to be limited to just dictionary words.
 * 
 * 
 * EXAMPLE
 * 
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
 * 
 * Hints: #106, #121, #134, #136 
 */


//Solution O(n)
public class PalindromePermutation{


    public boolean function(String str){
        int count = 0;
        int letters [] = new int[128];
        Arrays.fill(letters,0);

       
        for (char letter : str.toCharArray()) {
            letters[letter]++;
        }

        for(char letter : str.toCharArray()){
            if(count ==2){
                return false;
            }else{
                if(letters[letter] >= 2 && letter != ' '){
                   letters[letter] -=2;
                }else if (letters[letter] == 1 && letter != ' '){
                    count++;
                }
            }
        }
        return true;        
    }

    public static void main(String[] args) {
        PalindromePermutation cci = new PalindromePermutation();
        System.out.println(cci.function("tact coa"));
        System.out.println(cci.function("abc"));
        System.out.println(cci.function("abcb"));
        System.out.println(cci.function("bbo"));
    }
}