package Mutithredinginc_concept;
import java.util.Scanner;
public class design
{
    //instance variable price of the item
    int samosa=10;
    int gulabjamun=20;
    int colddrink=30;
    int softdrink=40;
    int idali=20;
    int dhosa=40;
    int wadda=30;
    int eggroll=50;
    int vegroll=45;
    int aaluchart=35;
    int choice;//for switch Expression
    int quan;//for quantity of the item
    int  Amount;
    String again;
    //Scanner class for input

       Scanner sc=new Scanner(System.in);

    //method to display all the item

     public void display()
      {
      //display all the item and menu card of the
        System.out.println();
        System.out.println(" !! Welcome To Kukdu Ku !! ");
        System.out.println();
        System.out.println("===========================");

        System.out.println("ITEM_LIST        PRICE");
        System.out.println("1.Samosa             10/-");
        System.out.println("2.Gulabjamun         20/-");
        System.out.println("3.Cold drink         30/-");
        System.out.println("4.Soft drink         40/-");
        System.out.println("5.Idali              20/-");
        System.out.println("6.Dhosa              40/-");
        System.out.println("7.Wada               30/-");
        System.out.println("8.Egg Roll           50/-");
        System.out.println("9.Veg Roll           45/-");
        System.out.println("10.Aalu Chatt        35/-");
        System.out.println("==========================");
         }// Display method will be closed
       public void Bill()
       {
          System.out.println("Total ="+Amount);
       }//bill method will be closed


       public void order()
         {

             System.out.println("please choose your item !");
             choice = sc.nextInt();
             //

             switch (choice) {
                 case 1://samosa
                     System.out.println("You have seleceted samosa");
                     System.out.println("Tell Me Quantity how much you want to order");
                     quan = sc.nextInt();
                     Amount = Amount + (samosa * quan);
                     break;
                 case 2://Gulabjamun
                     System.out.println("You have seleceted Gulabjamun");
                     System.out.println("Tell Me Quantity how much you want to order");
                     quan = sc.nextInt();
                     Amount = Amount + (gulabjamun * quan);
                     break;
                 case 3://cold drinks
                     System.out.println("You have seleceted cold drinks");
                     System.out.println("Tell Me Quantity how much you want to order");
                     quan = sc.nextInt();
                     Amount = Amount + (colddrink * quan);
                     System.out.println(Amount);
                     break;
                  default:
                     System.out.println("Sorry! for inconvenince food is not avilable");
                     break;
              }
                 //switch closed
              }

         //To ge the total amount of the item
        public void bill()
         {
           System.out.println("Total ="+Amount);
         }
    public static void main(String[] args)
    {
        design n=new design();
        n.display();
        n.order();
        n.bill();
    }
}
