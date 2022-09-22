import java.util.Scanner;

public class App{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        
        orderPizza();

    }
    static void orderPizza(){

        System.out.println("Welcome to PItzya");
        System.out.println("Select A if you want Sweet and sour garlic pizza! ");
        System.out.println("Select B if you want Pepperoni Cheese pizza! ");

        System.out.print("Enter your Selected Pizza: ");
        char choice = scan.next().charAt(0);

    
        String Pizza = "";
        double price = 0;

        switch(choice){
            case 'A':
                  Pizza = "Sweet and sour garlic pizza!";
                  price = 395.05;
                  break;
            case 'B':
                  Pizza = "Pepperoni Cheese pizza!";
                  price = 425.22;
                  break;
            default:
            System.out.println("That's a nice pizza choice ");
        }
        
        System.out.println("Input the crust you want ");
        System.out.println("Enter 1 if you want Thin Crust ");
        System.out.println("Enter 2 if you want Hand Tossed ");
        System.out.println("Enter 3 if you want Pluffy Crust ");

        System.out.print("Enter your Selected Pizza Crust: ");
        int crust = scan.nextInt();

        String play ="";
        switch(crust){
            case '1':
                 play = "Thin Crust";
                  break;
            case '2':
                 play = "Hand Tossed";
                  break;
            case '3':
                 play = "Pluffy Crust";
                 break;
            default:
            System.out.print("Good picking of Pizza crust");
            break;
        }
            System.out.print("Your Pizza size is " + play);


        System.out.println("Input the size you want ");
        System.out.println("Enter A if you want Small Size ");
        System.out.println("Enter B if you want Medium Size ");
        System.out.println("Enter C if you want Large Size ");
        System.out.print("Enter your Selected Pizza: ");
        char size = scan.next().charAt(0);
        
        switch(size){
            case 'A':
                 System.out.println("Thankyou for choosing small size ");
                 break;
            case 'B':
                 System.out.println("Thankyou for choosing medium size ");
            case 'C':
                 System.out.println("Thankyou for choosing large size ");
                 break;
            default:
            System.out.println("Nice Crust ");
        }
        



       }
     }
   
 
