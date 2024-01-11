/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

        Return the merged string.



        Example 1:

        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r
        Example 2:

        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b
        word2:    p   q   r   s
        merged: a p b q   r   s
        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        word1:  a   b   c   d
        word2:    p   q
        merged: a p b q c   d


        Constraints:*/

public class MergeAlternately {

    public static void main(String[] args) {
        System.out.println("concated String is  " + merge("abcd", "mnp"));
    }

    public static String merge(String word1, String word2) {
        int i = 0, j = 0;
        String word3 = "";

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                word3 = word3 + word1.charAt(i);
                i++;
            }

            if (j < word2.length()) {
                word3 = word3 + word2.charAt(j);
                j++;
            }
        }
        return word3;
    }
}
