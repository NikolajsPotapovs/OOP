
public class Doctor {                                                           //Doctors class start

    String name;                                                                //Declaring string variable name
    String[] slotTimes = {"                     09:00", "     10:00", "    11:00", "    12:00", "    13:00", "    14:00", "    15:00"}; //Declaring string array with slot times
    Patient[] slot;                                                             //Declaring patient object array for slot tracking
    String[] availability = {"Available", "Available", "Available", "Available", "Available", "Available", "Available"};                //Declaring string array for doctors availability tracking



    public Doctor(String name) {                                                //Doctors class constructor

        this.slot = new Patient[7];                                             //Assigning new patients to doctors slot array
        this.name = name;                                                       //Confirming that we mean this variables

    }                                                                           //Constructors closing bracket

    public void printDoctorDetails() {                                          //Start of print doctor details, used as get method
        System.out.println("Appointed doctor is: " + name);                     //Prints line in console, makes application more user friendly

    }                                                                           //Methods closing bracket



    public void replaceNull() {                                                 //Start of replace null method

        for (int i = 0; i < slot.length; i++) {                                 //For loop to iterate through doctors slot array
            if (slot[i] != null) {                                              //If statement to declare what happens if slots array element is null
                availability[i] = "Unavailable";                                //Changes availability arrays string value from "Available" to "Unavailable"

            }                                                                   //If statements closing brackets
        }                                                                       //For loop closing brackets

    }                                                                           //Methods closing brackets

}                                                                               //Doctor class closing brackets
