

import java.util.*;





public class Doctor {
    
    static Scanner PatientName = new Scanner(System.in);
    String name;
    String[] slotTimes = {"                     09:00","     10:00","    11:00","    12:00","    13:00","    14:00","    15:00"};
     //String[] slotTimes ={"Available", "Available", "Available"1, "Available", "Available", "Available", "Available"};
    Patient[] slot;
    //Arrays.fill(slot, "Available")
    String[] availability =  {"Available","Available","Available","Available","Available","Available","Available"};
    public Doctor(String name){
        
        this.slot = new Patient[7];
        this.name = name;
    
    
    }
//String[] slotTimes = {" 09:00","     10:00","    11:00","    12:00","    13:00","    14:00","    15:00"};
   
    public void PrintDoctorDetails()
    {
    	System.out.println("Appointed doctor is: " + name);
        
    }
    
    
    public String [] getSlotTimes(){
    
    System.out.println(Arrays.toString(slotTimes));
        return slotTimes;
    }
    
//    public Patient[] getSlots(){
//    
//       
//    return slot;
//                
//    
//    }
    
    public void replaceNull(){
    
    for(int i = 0; i < slot.length; i++)
    
    if ( slot[i] != null){
        availability[i] = "Unavailable";
        

}
    
    }

//    void slotTimes(int k) {
//        System.out.println(Arrays.toString(slotTimes));
//       //return slotTimes;
//    }
//    
    
}
//    public void cancelAppointment(f, s) {
//
//
//       
//}
    
   // if (slot == null){
//                 System.out.println("Available");
//                  }
    
    
    
    
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

 
    
