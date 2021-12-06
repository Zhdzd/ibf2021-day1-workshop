package ibf2021.day1;
////day 1 workshop////
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shopping {
        public static void main(String[] args) {
            
        HandleCommands handler = new HandleCommands();

        
       
        System.out.println(" add <item>");
        System.out.println(" delete <position of item>");
        System.out.println(" list");
        System.out.println(" exit");
        System.out.println("Welcome to your cart");
        ////test
        Scanner scan = new Scanner(System.in);
        String command = scan.next();
        String arguments = scan.nextLine();
        //
       if(!"add".equals(command) && !"delete".equals(command)&& // continue here          
        while(!com.equals("list") && 
            !com.equals("add")&&
            !com.equals("delete")){
            System.out.println("Please use only list or add");
            com = scan.next();
        }
        if(com.equals("list")){
            System.out.println("List is "+ cart);
        }
        if(com.startsWith("add")){
            String[] strArray = com.trim().split(" ");
            if(strArray.length < 2){
                System.out.println("You need to add some item.");}
        }
*/
        }
}

