
import java.util.*;




public class Main{
    
    static Scanner keyboard = new Scanner(System.in);
    static ArrayList<Patient> patients = new ArrayList<Patient>();
    static ArrayList<Doctor> doctor = new ArrayList<Doctor>();
    static int options = 0;
    
    
    
public static void main(String[] args) {

    
    InitialiseDoctors();
    PrintHeader();
    PrintMenu();
//    for (int i = 0; i < patients.size(); i++) {
//            {
//      Patient p = patients.get(i);
//      p.PrintDetails();
//    }
//}
}


public static void InitialiseDoctors(){

     Doctor d1 = new Doctor("Dr Emily Likova");
    doctor.add(d1);
     Doctor d2 = new Doctor("Dr Stephen Marganic");
    doctor.add(d2);
     Doctor d3 = new Doctor("Dr Seagal Handsome");
    doctor.add(d3);
     Doctor d4 = new Doctor("Dr Lily Win");
    doctor.add(d4);

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
            break;
                
            default:
                System.out.println("Please select valid option.");
            break;
        }
        
        }


}
    





public static void BookAnAppointmentMenu(){
    
    
    System.out.println("Please Enter Patients First Name:");
    String FirstName = keyboard.nextLine();
    keyboard.nextLine();                                             // flush the input buffer and throw it away to avoid skipping next string input
    
    System.out.println("Please Enter Patients Surname Name:");
    String Surname = keyboard.nextLine();
    
    System.out.println("Please Enter Patients Date of Birth:");
    String DOB = keyboard.nextLine();
    
    System.out.println("Please Enter Patients Country of Origin:");
    String COO = keyboard.nextLine();
    
    System.out.println("Please Enter Patients Telephone Number:");
    long TelNumber = keyboard.nextInt();
    
    Patient patient = new Patient(FirstName, Surname, TelNumber, DOB, COO);
     patients.add(patient);
     
     PrintSlotChoise();
                
                    while (options != -1){
                        options = keyboard.nextInt();
                        
                        
                         
                            switch(options){
                                case 1:
                                    
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name:");        // double cases? new scanner sc introduced)
                                    Scanner sc1 = new Scanner(System.in);
                                    String DoctorName = sc1.nextLine();
                                    ChoseSlot(patient, DoctorName, options);                //have to change logic, conflict with case choice
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                    break;
                                case 2:
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name: ");       
                                    Scanner sc2 = new Scanner(System.in);
                                    DoctorName = sc2.nextLine();
                                    ChoseSlot(patient, DoctorName, options);
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                break;
                                case 3:
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name: ");  
                                    Scanner sc3 = new Scanner(System.in);
                                    DoctorName = sc3.nextLine();
                                    ChoseSlot(patient, DoctorName, options);
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                break;
                                case 4:
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name: ");
                                    Scanner sc4 = new Scanner(System.in);
                                    DoctorName = sc4.nextLine();
                                    ChoseSlot(patient, DoctorName, options);
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                break;
                                case 5:
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name: ");
                                    Scanner sc5 = new Scanner(System.in);
                                    DoctorName = sc5.nextLine();
                                    ChoseSlot(patient, DoctorName, options);
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                break;
                                case 6:
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name: ");
                                    Scanner sc6 = new Scanner(System.in);
                                    DoctorName = sc6.nextLine();
                                    ChoseSlot(patient, DoctorName, options);
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                break;
                                case 7:
                                    DoctorAvailability(options-1);
                                    System.out.println("\nPlease Type Doctor Name: ");
                                    Scanner sc7 = new Scanner(System.in);
                                    DoctorName = sc7.nextLine();
                                    ChoseSlot(patient, DoctorName, options);
                                    System.out.println("\nThank you! Returning to main Menu\n:");
                                    PrintMenu();
                                break;
                                case 8:
                                    PrintMenu();
                                break;
                                case 9:
                                    System.out.println("\nThank you for using Woodland Medic Centre Appointment Application.");
                                    System.out.println("Good Bye.");
                                    Runtime.getRuntime().halt(0);
                                break;
                                default:
                                    System.out.println("Please select valid option.");
                                break;            
                            }
                    }

    }                
                    
                    
                 static public boolean ChoseSlot(Patient p,String DoctorName, int options)	{
		
		for (int i = 0; i < doctor.size(); i++)
		{
		  Doctor d = doctor.get(i);
		  if (d.name.equalsIgnoreCase(DoctorName))
		  {
			  d.slot[options - 1 ] = p;
			  return true;
		  }
		  	
		}
		
		return false;   
                
             
}
    
public static void ChoseDoctor(){
                                
}


public static void CancelAnAppointmentMenu(){
    
    
    System.out.println("Please Provide patients First Name:");
		String f = keyboard.nextLine();
                keyboard.nextLine();
    System.out.println("Please Provide patients Surname:");
		String s = keyboard.nextLine();
                
		for (int i = 0; i < doctor.size(); i++)
		{
		  Doctor d = doctor.get(i);
		  for (int j = 0; j < d.slot.length; j++)
    	{
    		Patient patient = d.slot[j];
    		if (patient != null && patient.FirstName.equalsIgnoreCase(f) && patient.Surname.equalsIgnoreCase(s))
    		{	
    			d.slot[j] = null;
    			
    		}
    	
    	}                                     //Erroneous sym type error 
		}
    
    
    
    
    
    
    
    
    
    
//System.out.println("\nPlease select a Doctor:");
//System.out.println("1. Dr. Emily Likova.");
//System.out.println("2. Dr. Stephen Marganic.");
//System.out.println("3. Dr. Seagal Handsome.");
//System.out.println("4. Dr. Lily Win.");
//System.out.println("5. Back.");
//System.out.println("6. Exit.");
//    
//
//    while (options != -1){
//        options = keyboard.nextInt();
//        
//        switch(options){
//           
//            case 1:
//                EmilyLikova();
//            break;
//            
//            case 2: 
//                StephenMarganic();
//            break;
//            
//            case 3:
//                SeagalHandsome();
//            break;
//            
//            case 4:
//                LilyWin();
//            break;
//            
//            case 5:
//                PrintMenu();
//            break;
//            
//            case 6:
//                System.out.println("\nThank you for using Woodland Medic Centre Appointment Application.");
//                System.out.println("Good Bye.");
//                Runtime.getRuntime().halt(0);
//                
//            default:
//                System.out.println("Please select valid option.");
//            break;
//
//}
//    }
}

public static void ViewDoctorsScheduleMenu(){
System.out.println("\nPlease select a Doctor:");
System.out.println("1. Dr. Emily Likova.");
System.out.println("2. Dr. Stephen Marganic.");
System.out.println("3. Dr. Seagal Handsome.");
System.out.println("4. Dr. Lily Win.");
System.out.println("5. Back.");
System.out.println("6. Exit.");
    

    while (options != -1){
        options = keyboard.nextInt();
        
        switch(options){
           
//            case 1:
//                System.out.println(Arrays.toString(DrEmilyLikova.slots));              //needs to be changed to print
//            break;
//            
//            case 2: 
//                System.out.println(Arrays.toString(DrStephenMarganic.slots));
//            break;
//            
//            case 3:
//                System.out.println(Arrays.toString(DrSeagalHandsome.slots));
//            break;
//            
//            case 4:
//                System.out.println(Arrays.toString(DrLilyWin.slots));
//            break;
//            
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
    

//    if(keyboard.nextLine() = Patient. && keyboard.nextLine() = Patient.){
//    
//    }

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
System.out.println("5. 13:00");
System.out.println("6. 14:00");
System.out.println("7. 15:00");
System.out.println("8. Back.");
System.out.println("9. Exit");
//System.out.println("Please note, Doctors are on breake 13:00 - 14:00.");
}



static public void DoctorAvailability(int options)
	{
		
		for (int i = 0; i < doctor.size(); i++)
		{
			Doctor d = doctor.get(i);
			
			Patient p = d.slot[options];
                        
			if (p == null){
				
                        d.PrintDoctorDetails();
                        

		}}
	}











//public static void CheckDoctorsAvailability(){
//    
//    System.out.println("Doctors available for this slot are:");    
//
//if ("Available".equals(DrEmilyLikova.availability[options-1])){
//                                    
//         System.out.println("Dr Emily Likova");
//         
//         
//  }
//
//if ("Available".equals(DrStephenMarganic.availability[options-1])){
//                                    
//         System.out.println("Dr Stephen Marganic");
//  }
//
//if ("Available".equals(DrSeagalHandsome.availability[options-1])){
//                                    
//         System.out.println("Dr Seagal Handsome");
//  }
//
//if ("Available".equals(DrLilyWin.availability[options-1])){
//                                    
//         System.out.println("Dr Lily Win");
//  }
//    
//
//
//}






}