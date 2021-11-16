
import java.util.Scanner;





public class Doctor {
    
    static Scanner PatientName = new Scanner(System.in);
    String name;
    String[][] slots = new String[][]{{"09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00"},{"Available", "Available", "Available", "Available", "Break", "Available", "Available", "Available"}};
    
    
    
    public void SetSlot0900(){
    
    slots[0] = PatientName.nextLine();
            
    }
    
    public void SetSlot1000(){
    
    slots[1] = PatientName.nextLine();
            
    }
    
    public void SetSlot1100(){
    
    slots[1] = PatientName.nextLine();
            
    }
    
    public void SetSlot1200(){
    
    slots[1] = PatientName.nextLine();
            
    }
    
    public void SetSlot1400(){
    
    slots[1] = PatientName.nextLine();
            
    }
    
    public void SetSlot1500(){
    
    slots[1] = PatientName.nextLine();
            
    }
    
    public void SetSlot1600(){
    
    slots[1] = PatientName.nextLine();
            
    }
}
