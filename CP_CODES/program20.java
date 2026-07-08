class Logic
{
    void findSmallestDigit(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        int digit;
        int min = 9;

        while(num != 0)
        {
            digit = num % 10;

            if(digit < min)
            {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest Digit = " + min);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}