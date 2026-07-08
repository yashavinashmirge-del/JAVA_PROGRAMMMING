class Logic
{
    void printDigits(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
