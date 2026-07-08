class Logic
{
    void checkPalindrome(int num)
    {
        int temp = num;
        int rev = 0;

        while(num != 0)
        {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if(temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}