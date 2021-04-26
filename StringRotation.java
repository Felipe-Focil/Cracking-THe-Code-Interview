import java.util.Arrays;
public class StringRotation {
    
    private boolean isSubstring(String s1, String s2){
        return s2.contains(s1);
    }

    public String concataneItself(String str){
        return str + str;
    }

    public boolean function(String s1, String s2){
            return isSubstring(s1,concataneItself(s2));
    }

    public static void main(String[] args) {
        StringRotation cci = new StringRotation();
        System.out.println(cci.function("waterbottle", "erbottlewat"));
        System.out.println(cci.function("cdab", "abcd"));
        System.out.println(cci.function("aaabb", "abb"));
        System.out.println(cci.function("abb", "aaabb"));
    }
}
