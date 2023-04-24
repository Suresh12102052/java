import java.util.Scanner;

public class MaxOccurringCharacter 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char maxChar = ' ';
        int maxCount = 0;
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) 
{
            char ch = str.charAt(i);
            if (!isValidChar(ch))
 {
                System.out.println("Error: Invalid character in the string.");
                return;
            }
            count[ch]++;
            if (count[ch] > maxCount || (count[ch] == maxCount && ch < maxChar)) 
{
                maxChar = ch;
                maxCount = count[ch];
            }
        }
        System.out.println("Maximum occurring character is: " + maxChar);
    }

    private static boolean isValidChar(char ch) 
{
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }
}
