
import java.util.*;
public class Patient {
    static Scanner keyboard = new Scanner(System.in);
    String firstName;
    String surname;
    long TelNumber;
    String DOB;
    String COO;
    
    


public Patient(String firstName, String surname, long TelNumber, String DOB, String COO)

{
    this.firstName = firstName;
    this.surname = surname;
    this.TelNumber = TelNumber;
    this.DOB = DOB;
    this.COO = COO;
}



//public static void PatientCreator(){
//    
//    System.out.println("Please Enter Patients First Name:");
//    String FirstName = keyboard.nextLine();
//    
//    System.out.println("Please Enter Patients Surname Name:");
//    String Surname = keyboard.nextLine();
//    
//    System.out.println("Please Enter Patients Date of Birth:");
//    String DOB = keyboard.nextLine();
//    
//    System.out.println("Please Enter Patients Country of Origin:");
//    String COO = keyboard.nextLine();
//    
//    System.out.println("Please Enter Patients Telephone Number:");
//    long TelNumber = keyboard.nextInt();
//    
//     
//     
//     }




public void PrintDetails(){
    
                                
    System.out.println("First Name: " + firstName);
    System.out.println("Surname: " + surname);
    System.out.println("Telephone Number: " + TelNumber);
    System.out.println("Date of Birth: " + DOB);
    System.out.println("Country of Origin: " + COO);
}

}

