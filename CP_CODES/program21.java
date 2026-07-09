
class Logic
{
    void productOfDigits(int num)
    {
        int digit;
        int product = 1;

        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product = " + product);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}