package Basics.condition;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empId=in.nextInt();
        in.nextLine();
        switch (empId){
            case 1 -> System.out.println("Life is unfair");
            case 2 -> System.out.println("life is really unfair");
            case 3 ->{
                String Choice = in.nextLine();

                switch (Choice){
                case "ForOthers" -> System.out.println("Life is good");
                case "ForMe" -> System.out.println("Are mcp reeee");
                default -> System.out.println("wah re bete");
            }
            }
            default -> System.out.println("Are bete moj kar di");
        }

    }
}
