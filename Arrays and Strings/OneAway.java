/*
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
Hints:#23, #97, #130 

*/


//Solution O(n+m);
public class OneAway {
    
    public boolean function(String str1,String str2){
        int length = Math.abs(str1.length() - str2.length());
        if(length > 1){
            return false;
        }else{
        return (str1.length() <= str2.length ()) ? verify(str1, str2):verify(str2, str1);
        }
    }


    public boolean verify(String str1, String str2){
        int s1[] = new int [256];
        int s2[] = new int [256];
        int count = 0;
        for(char letter : str1.toCharArray()) {
            s1[letter]++;
        }

        for(char letter : str2.toCharArray()) {
            s2[letter]++;
        }

        for(char letter : str1.toCharArray()) {
            if(count >1){
                return false;
            }

            if(s1[letter] != s2[letter]){
                count++;
            }else{
                s1[letter]--;
                s2[letter]--;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        OneAway cci = new OneAway();
        System.out.println(cci.function("pale", "ple"));
        System.out.println(cci.function("pales", "pale"));
        System.out.println(cci.function("pale", "bale"));
        System.out.println(cci.function("pale", "bake"));

    }


}
