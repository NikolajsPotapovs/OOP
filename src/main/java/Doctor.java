

import java.util.*;





public class Doctor {
    
    static Scanner PatientName = new Scanner(System.in);
    String name;
    //String[] slots = new String[]{"09:00","10:00","11:00","12:00","13:00","14:00","15:00"};
    // String[] availability; //{"Available", "Available", "Available", "Available", "Available", "Available", "Available"};
    Patient[] slot;
    
    public Doctor(String name){
        
        this.slot = new Patient[7];
        this.name = name;
    
    
    }

   
    public void PrintDoctorDetails()
    {
    	System.out.println(name);
    }
    
    
    
    
    
//    public void cancelAppointment(f, s) {
//
//
//       
//}
    
    
    
    
    
    
//    public void SetSlot0900(){
//        
//                
//    System.out.println("Please enter Patients Name:");    
//    availability[0] = PatientName.nextLine();
//    
//            
//    }
//    
//    public void SetSlot1000(){
//    
//    availability[1] = PatientName.nextLine();
//            
//    }
//    
//    public void SetSlot1100(){
//    
//    availability[2] = PatientName.nextLine();
//            
//    }
//    
//    public void SetSlot1200(){
//    
//    availability[3] = PatientName.nextLine();
//            
//    }
//    
//    public void SetSlot1400(){
//    
//    availability[4] = PatientName.nextLine();
//            
//    }
//    
//    public void SetSlot1500(){
//    
//    availability[5] = PatientName.nextLine();
//            
//    }
//    
//    public void SetSlot1600(){
//    
//    availability[6] = PatientName.nextLine();
//            
// }  
//
////
//public void PrintSchedule();{
//
//}

//    void cancelAppointment(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 }
    
