import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	
        Random rd = new Random();
       
        Link link = new Link();
        List list = new List();

        link = list.CreateNode();

        for (int i = 0; i < 5; i++) {
            list.AddNode(link, rd.nextInt(100)+1);
        } list.PrintNode(link);

        System.out.println("\nCount : " + list.CountNode(link));

        int count = 0;

        System.out.println("**Search**");
        System.out.print("DATA : ");
        count = list.SearchNode(link, sc.nextInt());
        System.out.println("Search Number : " + count);

        int data = 0;
        int val = 0;

        System.out.println("**NextInsert**");
        System.out.print("Search : "); data = sc.nextInt();
        System.out.print("Updata val : "); val = sc.nextInt();
        list.NextInsertNode(link, data, val);
        list.PrintNode(link);

        System.out.println("\n**PrevioustInsert**");
        System.out.print("Search : "); data = sc.nextInt();
        System.out.print("Updata val : "); val = sc.nextInt();
        list.PreviousInsertNode(link, data, val);
        list.PrintNode(link);

        System.out.println("\n**Delete**");
        System.out.print("Delete val : "); data = sc.nextInt();
        list.DeleteNode(link, data);
        list.PrintNode(link);

        System.out.println("\n**Reverse**");
        list.ReverseNode(link);
        list.PrintNode(link);

       
        System.out.println("\n**Sort**");
        list.SortNode(link);
        list.PrintNode(link);
       
    }
}