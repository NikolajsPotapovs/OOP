
import java.util.*;



 //   static Scanner keyboard = new Scanner(System.in);
 // static ArrayList[](Patient) lst = new ArrayList<Student>();
//}
public class Main{
    
    static Scanner keyboard = new Scanner(System.in);
    static ArrayList<Patient> lst = new ArrayList<Patient>();
    static Doctor DrEmilyLikova = new Doctor();
    static Doctor DrStephenMarganic = new Doctor();
    static Doctor DrSeagalHandsome = new Doctor();
    static Doctor DrLilyWin = new Doctor();
    
public static void main(String[] args) {

    
    //DoctorObj.SetSlot0900();
    
    //System.out.println(Arrays.toString(DoctorObj.slots));
    PrintHeader();
    PrintMenu();
}

public static void PrintHeader(){

    System.out.println("+---------------------------------------+");
    System.out.println("|               Welcome to              |");
    System.out.println("|         Woodland Medic Centre         |");
    System.out.println("|        Appointment Application        |");
    System.out.println("+---------------------------------------+");
    System.out.println("\nPlease select one of the options:");

}


public static void PrintMenu(){
    

    System.out.println("\n1. Book an appointment.");
    System.out.println("2. Cancel an appointment.");
    System.out.println("3. View a doctor's schedule.");
    System.out.println("4. View a patients appointment.");
    System.out.println("5. Exit.");
    
    int options = 0;

    while (options != -1){
        options = keyboard.nextInt();
        
        switch(options){
           
            case 1:
                BookAnAppointmentMenu();
            break;
            
            case 2: 
                CancelAnAppointmentMenu();
            break;
            
            case 3:
                ViewDoctorsScheduleMenu();
            break;
            
            case 4:
                ViewPatientsAppointmentMenu();
            break;
            
            case 5:
                System.out.println("\nThank you for using Woodland Medic Centre Appointment Application.");
                System.out.println("Good Bye.");
                Runtime.getRuntime().halt(0);
                
            default:
                System.out.println("Please select valid option.");
            break;
        }
        
        }


}
    





public static void BookAnAppointmentMenu(){
System.out.println("\nPlease select a Doctor:");
System.out.println("1. Dr. Emily Likova.");
System.out.println("2. Dr. Stephen Marganic.");
System.out.println("3. Dr. Seagal Handsome.");
System.out.println("4. Dr. Lily Win.");
System.out.println("5. Back.");
System.out.println("6. Exit.");
    int options = 0;

    while (options != -1){
        options = keyboard.nextInt();
        
        switch(options){
           
            case 1:
                PrintSlotChoise();
                
            break;
            
            case 2: 
                PrintSlotChoise();
            break;
            
            case 3:
                PrintSlotChoise();
            break;
            
            case 4:
                PrintSlotChoise();
            break;
            
            case 5:
                PrintMenu();
            break;
            
            case 6:
                System.out.println("\nThank you for using Woodland Medic Centre Appointment Application.");
                System.out.println("Good Bye.");
                Runtime.getRuntime().halt(0);
                
            default:
                System.out.println("Please select valid option.");
            break;

}
    }
}


public static void CancelAnAppointmentMenu(){
System.out.println("\nPlease select a Doctor:");
System.out.println("1. Dr. Emily Likova.");
System.out.println("2. Dr. Stephen Marganic.");
System.out.println("3. Dr. Seagal Handsome.");
System.out.println("4. Dr. Lily Win.");
System.out.println("5. Back.");
System.out.println("6. Exit.");
    int options = 0;

    while (options != -1){
        options = keyboard.nextInt();
        
        switch(options){
           
            case 1:
                EmilyLikova();
            break;
            
            case 2: 
                StephenMarganic();
            break;
            
            case 3:
                SeagalHandsome();
            break;
            
            case 4:
                LilyWin();
            break;
            
            case 5:
                PrintMenu();
            break;
            
            case 6:
                System.out.println("\nThank you for using Woodland Medic Centre Appointment Application.");
                System.out.println("Good Bye.");
                Runtime.getRuntime().halt(0);
                
            default:
                System.out.println("Please select valid option.");
            break;

}
    }
}

public static void ViewDoctorsScheduleMenu(){
System.out.println("\nPlease select a Doctor:");
System.out.println("1. Dr. Emily Likova.");
System.out.println("2. Dr. Stephen Marganic.");
System.out.println("3. Dr. Seagal Handsome.");
System.out.println("4. Dr. Lily Win.");
System.out.println("5. Back.");
System.out.println("6. Exit.");
    int options = 0;

    while (options != -1){
        options = keyboard.nextInt();
        
        switch(options){
           
            case 1:
                System.out.println(Arrays.toString(DrEmilyLikova.slots));              //needs to be changed to print
            break;
            
            case 2: 
                System.out.println(Arrays.toString(DrStephenMarganic.slots));
            break;
            
            case 3:
                System.out.println(Arrays.toString(DrSeagalHandsome.slots));
            break;
            
            case 4:
                System.out.println(Arrays.toString(DrLilyWin.slots));
            break;
            
            case 5:
                PrintMenu();
            break;
            
            case 6:
                System.out.println("\nThank you for using Woodland Medic Centre Appointment Application.");
                System.out.println("Good Bye.");
                Runtime.getRuntime().halt(0);
                
            default:
                System.out.println("Please select valid option.");
            break;

}
    }

}

public static void ViewPatientsAppointmentMenu(){
System.out.println("\nPlease type Patients Name:");
    

    if(keyboard.nextLine() = Patient. && keyboard.nextLine() = Patient.){
    
    }

}




public static void BookAnAppointment(){


}



public static void CancelAnAppointment(){


}


public static void ViewDoctorsSchedule(){


}

public static void ViewPatientsAppointment(){


}


public static void InitialisePatients(){




}

public static void PrintSlotChoise(){
System.out.println("\nPlease select a Time Slot:");
System.out.println("1. 09:00");
System.out.println("2. 10:00");
System.out.println("3. 11:00");
System.out.println("4. 12:00");
System.out.println("5. 14:00");
System.out.println("6. 15:00");
System.out.println("6. 16:00");
System.out.println("7. Back.");
System.out.println("8. Exit");
System.out.println("Please note, Doctors are having breake 13:00 - 14:00.");
}

}