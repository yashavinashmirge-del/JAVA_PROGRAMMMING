class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}