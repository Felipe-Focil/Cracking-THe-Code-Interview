package ArraysStrings;

/*
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). 
*/

public class StringCompression {

    String compressed = "";
    int count = 0;

    public String function(String str) {
        int i = 0, j = 0;
        while (j < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
                j++;
            } else {
                add(i, str);
                count = 0;
                i = j;
            }
            if (j == str.length()) {
                add(i, str);
            }
        }
        return (str.length() < compressed.length()) ? str : compressed;
    }

    public void add(int a, String str) {
        compressed += str.charAt(a);
        compressed += count;
    }

    public static void main(String[] args) {
        StringCompression cci = new StringCompression();
        System.out.println(cci.function("aabcccccaa"));
    }
}
