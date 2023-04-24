public class PalindromeChecker {
public static boolean isPalindromeWithOneDeletion(String str) {
int i = 0, j = str.length() - 1;
while (i < j) {
if (str.charAt(i) != str.charAt(j)) {
return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
}
i++;
j--;
}
return true;
}

private static boolean isPalindrome(String str, int i, int j) {
while (i < j) {
if (str.charAt(i) != str.charAt(j)) {
return false;
}
i++;
j--;
}
return true;
}

public static void main(String[] args) {
String str = "abcbea";
System.out.println(isPalindromeWithOneDeletion(str)); // true
}
}
