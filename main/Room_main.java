package main;

import model.Classroom;
import model.Lab;

import java.util.Scanner;

public class Room_main {
    public static void main(String[] args) {
        // do something here...
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the Room name:");
        String roomName = scanner.nextLine();
        System.out.println("Enter if it is a lab or classroom:");
        String loc = scanner.nextLine();

        System.out.println("Enter chairs:");
        int chairsnum = scanner.nextInt();

        System.out.println("Enter 25 for lab and 50 for classroom"+"\n" + "Enter total Chairs:");
        int totalchr = scanner.nextInt();





        if (loc.equalsIgnoreCase("lab")) {
            Lab lab = new Lab();
            System.out.println("Enter Lab number:");
            int labNum = scanner.nextInt();
            lab.setLabNumber(labNum);
            lab.setName(roomName);
            lab.setChairs(chairsnum);
            lab.setTotalChairs(totalchr);
            System.out.println("----tostring method---- \n " + lab.toString());

        }
        else if (loc.equalsIgnoreCase("classroom")) {
            Classroom classroom = new Classroom();
            System.out.println("Enter classroom name:");
            String cname = scanner.next();
            System.out.println("Enter classroom description:");
            String cdesc = scanner.next();

            classroom.setClassroomName(cname);
            classroom.setClassroomDescription(cdesc);
            classroom.setName(roomName);
            classroom.setChairs(chairsnum);
            classroom.setTotalChairs(totalchr);
            System.out.println("----tostring method---- \n " + classroom.toString());

        }
        else {
            System.out.println("Please enter a valid option");
        }




    }
}







