import java.util.Scanner;

public class ReverseString {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String inputString = sc.nextLine();
if (inputString == null || inputString.matches(".*\\d.*")) {
System.out.println("Invalid input");
return;
}

String[] words = inputString.split(" ");
StringBuilder reversedString = new StringBuilder();

for (String word : words) {
StringBuilder reversedWord = new StringBuilder(word.toLowerCase()).reverse();
reversedString.append(reversedWord).append(" ");
}
reversedString.deleteCharAt(reversedString.length() - 1);

System.out.println(reversedString.toString());
}
}
