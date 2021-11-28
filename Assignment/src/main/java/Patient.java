
public class Patient {                                                          //Patient class start

    String firstName;                                                           //Declaring string variable first name
    String surname;                                                             //Declaring string variable surname
    long TelNumber;                                                              //Declaring long variable telephone number
    String DOB;                                                                 //Declaring string variable date of birth    
    String COO;                                                                 //Declaring string variable country of origin
    String slotTime = "";                                                       //Declaring string variable slot time as empty string

    public Patient(String firstName, String surname, long TelNumber, String DOB, String COO, String slotTime) { //Patient class constructor
        this.firstName = firstName;                                             //Confirming that we mean this variable
        this.surname = surname;                                                 //Confirming that we mean this variable
        this.TelNumber = TelNumber;                                       //Confirming that we mean this variable
        this.DOB = DOB;                                                         //Confirming that we mean this variable
        this.COO = COO;                                                         //Confirming that we mean this variable
        this.slotTime = slotTime;                                               //Confirming that we mean this variable
    }                                                                           //Constructors closing bracket

    public void setSlotTime(String slotTime) {                                  //Start of set slot time method
        this.slotTime = slotTime;                                               //Sets slot time equal to new value
    }                                                                           //Set method closing bracket

    public void printDetails() {                                                //Print details method used insted of multiple get methods

        System.out.println("First Name: " + firstName);                         //Outprints patients first name in console
        System.out.println("Surname: " + surname);                              //Outprints patients  surname in console
        System.out.println("Telephone Number: " + TelNumber);                   //Outprints patients  telephone number in console
        System.out.println("Date of Birth: " + DOB);                            //Outprints patients  date of birth in console
        System.out.println("Country of Origin: " + COO);                        //Outprints patients  country of origin in console
    }                                                                           //Methods closing bracket

}                                                                               //Patient class closing brackets
