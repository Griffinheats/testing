import java.util.*;
public class Factory
{
    private static int packageCounter = 0;
    private static String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange"}; 
    private static String[] models = {"bananas", "greenbeans", "pumpkin pie"};
    public static void main(String[] args)
    {
        String colors[] = {"Red", "Green", "Yellow", "Blue"};
        String models[] = {"green beans", "bananas"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int pid = 1;

        System.out.println("Factory open\n");
        System.out.println("Enter the number of widgets for the next package or enter 0 to end: ");
        int numWidgets = sc.nextInt();
        while(numWidgets != 0)
        {
            int wid = 1;
            Package p = new Package("P" + pid, numWidgets);
            pid++;
            String color = "test";
            Widget w = new Widget(color, "test", "P" + pid + "W" + wid);
            wid++;
        }
        System.out.println("Factory closed.");
    }   
}
