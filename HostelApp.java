import java.util.Scanner;

public class HostelApp
{
    public static void main(String[]args){
        
        Hostel[] hostel = new Hostel[3];
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        System.out.println("******** HOSTEL REGISTRATION ********");
        
        for(int i=0; i<hostel.length; i++){
            System.out.println("\nRegistration " + (i+1) + ":");
            System.out.print("\nName : ");
            String name = in.nextLine();
            System.out.print("IC : ");
            String ic = in.nextLine();
            System.out.print("Date : ");
            String date = in.nextLine();
            System.out.print("Category : ");
            char category = in2.next().charAt(0);
            System.out.print("Room Type : ");
            String roomType = in.nextLine();
            hostel[i] = new Hostel(name, ic, date, category, roomType);
        }
        
        calculateFee(hostel);
    }
    
    public static void calculateFee(Hostel[] hostel){
        double totFee = 0, deposit = 0, fee = 0;
        
        System.out.println("\n******** RECORDS ********");
        
        for(int i=0; i<hostel.length; i++){
            if(hostel[i].getCategory()=='L') deposit = 100;
            else if(hostel[i].getCategory()=='I') deposit = 500;
            if(hostel[i].getRoomType().equalsIgnoreCase("Single")) fee = 450;
            else if(hostel[i].getRoomType().equalsIgnoreCase("Double")) fee = 250;
            totFee = deposit + fee;
            System.out.println("\nStudent " + (i+1) + "\n" + hostel[i].toString());
            System.out.println("Total Fee : RM" + String.format("%.2f",totFee));
        }
    }
}
