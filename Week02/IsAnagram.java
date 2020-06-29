package week02;

/**
 * 有效的字母异位词
 */
public class IsAnagram {

    public static void main(String[] args) {
        boolean anagram = isAnagram("ab", "baa");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }

}
