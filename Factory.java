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

        System.out.println("Factory open\n");
        System.out.println("Enter the number of widgets for the next package or enter 0 to end: ");
        int numWidgets = sc.nextInt();
        while(numWidgets != 0)
        {
            packageCounter++;
            Package p = new Package("P" + packageCounter, numWidgets);
            for(int i = 1; i < numWidgets; i++)
            {
                int numC = (int)(Math.random()*6);
                String color = colors[numC];
                int numM = (int)(Math.random()*4);
                String model = models[numM];

                Widget w = new Widget(color, model, "P" + packageCounter + "W" + i);
            }
            System.out.println(p.toString());
            System.out.println("Enter the number of widgets for the next package or enter 0 to end: ");
            numWidgets = sc.nextInt();
        }
        System.out.println("Factory closed.");
        sc.close();
    }   
}
