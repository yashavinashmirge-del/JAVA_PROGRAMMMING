class Logic
{
    void findLargestDigit(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        int digit;
        int max = 0;

        while(num != 0)
        {
            digit = num % 10;

            if(digit > max)
            {
                max = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest Digit = " + max);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
