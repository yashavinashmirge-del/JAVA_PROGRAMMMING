class Logic
{
    void printEvenNumbers(int n)
    {
        for(int i = 2; i <= n; i += 2)
        {
            System.out.print(i + " ");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}