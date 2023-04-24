
package projeto5;

public class Reverse
{
    private String sentenca;
    public Reverse(String sentenca)
    {
        this.sentenca = sentenca;
    }
    
    public void Reverter()
    {
        String palindrome = this.sentenca;
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
 
    
        for (int i = 0; i < len; i++)
        {
          tempCharArray[i] = palindrome.charAt(i);
        }
 
        for (int j = 0; j < len; j++)
        {
          charArray[j] = tempCharArray[len - 1 - j];
        }
 
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
