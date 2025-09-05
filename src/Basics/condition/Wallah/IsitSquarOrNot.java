package Basics.condition.Wallah;
import java.util.Scanner;
public class IsitSquarOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your length");
        int length=sc.nextInt();
        System.out.println("enter your breadth");
        int breath=sc.nextInt();
        int area=length*breath;
        int perimeter =2*(length+breath);
        if(area<perimeter){
            System.out.println("Your perimeter is larger than the given area ");
        }
        else if(perimeter<area){
            System.out.println("your area is greater than the perimeter");
        }
        else {
            System.out.println("area and perimeter are equal ");
        }
    }
}
