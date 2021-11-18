
import java.util.*;
public class Patient {
    static Scanner keyboard = new Scanner(System.in);
    String FirstName;
    String Surname;
    long TelNumber;
    String DOB;
    String COO;
    
    


public Patient(String FirstName, String Surname, long TelNumber, String DOB, String COO)

{
    this.FirstName = FirstName;
    this.Surname = Surname;
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

    System.out.println("First Name: "+ FirstName);
    System.out.println("Surname: " + Surname);
    System.out.println("Telephone Number: "+ TelNumber);
    System.out.println("Date of Birts: "+ DOB);
    System.out.println("Country of Origin: "+ COO);
}

}