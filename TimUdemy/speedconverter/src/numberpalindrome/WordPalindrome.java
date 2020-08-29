package numberpalindrome;

public class WordPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("aabaa"));
        System.out.println(checkPalindrome("abac"));
        System.out.println(checkPalindrome("abc"));
    }

    static boolean checkPalindrome(String inputString) {
        int size = inputString.length();
        int back = size;
        for (int i = 0; i < size / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(back - 1)) {
                return false;
            }
            back--;
        }
        return true;
    }
}
