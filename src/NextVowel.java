import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextVowel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String word = br.readLine().trim().replaceAll("\\s", "");
        StringBuilder result = new StringBuilder();
        for (int i=0;i<n;i++) {
            switch(word.charAt(i)) {
                case 'a':
                    result.append('e');
                    break;
                case 'e':
                    result.append('i');
                    break;
                case 'i':
                    result.append('o');
                    break;
                case 'o':
                    result.append('u');
                    break;
                case 'u':
                    result.append('a');
                    break;

                default :
                    result.append(word.charAt(i));
            }
        }

        System.out.println(result);

    }
}
/*
Problem Statement
Given a string of length n consisting of lowercase English letters. Find the vowels in the string and replace each vowel with it's next vowel in the alphabetic order.

Next vowel of a vowel is another vowel that comes after it in alphabet. Next vowel of { 'a', 'e', 'i', 'o', 'u'} are { 'e', 'i', 'o', 'u', 'a' } respectively.
Input
First line contains n.
Next line contains a string.

Constraints
1 <= n <= 105
Output
print the string after replacing each vowel with it's next vowel.
Example
Input:
4
deaf

Output:
dief

Explanation:
next vowel of 'e' = 'i'
next vowel of 'a' = 'e'
 */
