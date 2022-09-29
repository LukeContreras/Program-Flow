
/**
 * Write a description of class whileloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloops
{
    
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
     public void run()   {
        int i = 0;
        do    {
            System.out.println("i is " + i + " and less than 15"); 
            i = i + 2;
        }while (i<15);
        int k = 10;
        do     {
            System.out.println("k is " + k + " and greater than 5");
            k = k - 2;
        }while (k>5);
        do   {
            System.out.println("a is " + a + " and less than ten");
            System.out.println("b is " + b + " and less than or equal to 20");
            a = a + 1;
            b = b + 4;
        }while (a<10 && b<=20)
    }

    public static void main(String[] args)
    {
        whileloops hw = new whileloops();
        hw.run();
    }
}