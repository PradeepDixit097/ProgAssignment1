import java.util.*;
/**
 * Program to compute statistics of 'students' marks in an assignment.
 * @author (Pradeep Mani Dixit)
 * Student Id: 23875508
 * @version (6/09/2023)
 */
public class StudentStatistics
{
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);

        // let the user to enter the assignment name
        System.out.println("Enter the Name of the Assignment: ");
        

        // Read input from the user and store in a variable
        String assignmentName = scanner.nextLine();
        System.out.println("Please enter the marks between 0 and 30:");
        
        int n=30;       
       
        //assumig there are 30 students in the classroom
        int[] marks = new int[n]; 
        
        

        for (int i = 0; i < n; i++) {
            
            int mark;
        
            do {
                
                System.out.print("Enter the student's " + (i+1) + " mark: ");
                
                mark = sc.nextInt();

                if (mark < 0 || mark > 30) {
                    System.out.println("Invalid! Please assign the valid marks between 0 and 30");
                } 
                
            } while (mark < 0 || mark > 30);
            
             marks[i] = mark;
        }
        
           //Calculation of highest and lowest marks
           // Initializing the  variables for highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];
           
           for (int i = 1; i < n; i++) {
             
             if (marks[i] < lowest) {
                 lowest = marks[i];
                }
                if (marks[i] > highest) {
                highest = marks[i];
                 }
            }

         // Display the entered assignment name and student marks
         System.out.println("Student Marks entered Successfully!");
         System.out.println("Assignment Name: " + assignmentName);
         System.out.println("Students' Entered Marks are given Below:");
        
        for (int i = 0; i < 30; i++) {
            
            System.out.println("Student "+ (i+1) + " Mark: " + marks[i]);
        }
        
        //display the highest and lowest marks
        System.out.println("Student's Highest Mark is: " + highest);
        System.out.println("Student's Lowest Mark is: " + lowest);
        
        // Calculate the mean of the numbers using for each loop as it is easy to loop in the array using for each loop
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
         double mean = (double) sum / n;
         
        //Calculating the standard deviation of the numbers using for each loop
        
        double ss = 0;
        for (int mark : marks) {
            double dev = mark - mean;
            ss += dev * dev;
        }
        double var = ss / n;
        double stanDev = Math.sqrt(var);
        
        System.out.println("The Mean of the marks is:  " + mean);
        System.out.println("The Standard Deviation of the marks is: " + stanDev);
        
    }
}