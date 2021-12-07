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
       if(!"add".equals(command) && !"delete".equals(command)&&  //if         
            !"list".equals(command) && !"exit".equals(command)) {
            System.out.println("Invalid command, program will exit.");
             scan.close();
            return;
        }
        while (!"exit".equals(command)) {

            if ("add".equals(command)) {
                handler.handleAdd(command, arguments, scan);
                System.out.println("-- Item(s) added --");
            }

            if ("delete".equals(command)) {
                handler.handleDelete(command, arguments, scan);
                System.out.println("-- Item removed --");
            }
            
            if ("list".equals(command)) {
                handler.handleList(command);
                System.out.println("-- End of list --");
            }

            command = scan.next();
            arguments = scan.nextLine();
        }
       
            scan.close();
            System.out.println("Program has ended.");
    }
}
