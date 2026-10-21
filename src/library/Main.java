package library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<LibraryItem> items= new ArrayList<>();
        System.out.println("How many returned items? ");
        int number=input.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.println("Item "+ i + "-type (Book/DVD): ");
            String type= input.next();
            System.out.println("Item " + i + "- title: " );
            String title= input.next();
            System.out.println("Item " + i + "- daysLate");
            int daysLate=input.nextInt();
            if(type.equals("Book")){
                items.add(new BookItem(title,daysLate));
            }
            else if (type.equals("DVD")){
                items.add(new DVDItem(title,daysLate));
            }
            else {
                System.out.println("please Enter Book or DVD");
                i--;
            }
        }
        long total=0;
        System.out.println("\n Library Fine Summary");
        for (LibraryItem item : items){
            long Fine=item.calculateFine();
            System.out.println(item.getTitle()+ ": " + Fine + " Units");
            total= total + Fine;
        }
        System.out.println("Total Fines: " + total);


    }
}
