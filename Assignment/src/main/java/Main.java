
import java.io.BufferedReader;                                                  //Importing BufferedReader library 
import java.io.IOException;                                                     //Importing IOException library
import java.io.InputStreamReader;                                               //Importing InputStreamReader library
import java.time.LocalDate;                                                     //Importing LocalDate library
import java.time.format.DateTimeFormatter;                                      //Importing DateTimeFormatter library
import java.time.temporal.ChronoUnit;                                           //Importing ChronoUnit library
import java.util.*;                                                             //Importing all Java util libraries

public class Main {                                                             //Start of the main class

    static Scanner keyboard = new Scanner(System.in);                           //Creating scanner object
    static ArrayList<Patient> patients = new ArrayList<Patient>();              //Creating array list for patients
    static ArrayList<Doctor> doctor = new ArrayList<Doctor>();                  //Creating array list for doctors
    static int options = 0;                                                     //Declaring global variable

    public static void main(String[] args) throws IOException {                 //Start of main method with declared exeption

        initialiseDoctors();                                                    //Calls for method Initialise Doctors 
        printHeader();                                                          //Calls for method to print header
        printMenu();                                                            //Calls for method to print main menu

    }                                                                           //Main method closing brackets

    public static void initialiseDoctors() {                                    //Start of inicialise doctors method

        Doctor d1 = new Doctor("Dr Emily Likova");                              //Creating new doctor object
        doctor.add(d1);                                                         //Adding object to doctor array list
        Doctor d2 = new Doctor("Dr Stephen Marganic");                          //Creating new doctor object
        doctor.add(d2);                                                         //Adding object to doctor array list
        Doctor d3 = new Doctor("Dr Seagal Handsome");                           //Creating new doctor object
        doctor.add(d3);                                                         //Adding object to doctor array list
        Doctor d4 = new Doctor("Dr Lily Win");                                  //Creating new doctor object
        doctor.add(d4);                                                         //Adding object to doctor array list

    }                                                                           //Method closing brackets

    public static void printHeader() {                                          //Start of print header method

        System.out.println("+---------------------------------------+");        //Prints line in console, makes application more user friendly
        System.out.println("|               Welcome to              |");        //Prints line in console, makes application more user friendly
        System.out.println("|         Woodland Medic Centre         |");        //Prints line in console, makes application more user friendly
        System.out.println("|        Appointment Application        |");        //Prints line in console, makes application more user friendly
        System.out.println("+---------------------------------------+");        //Prints line in console, makes application more user friendly
        System.out.println("\nPlease select one of the options:");              //Prints line in console, makes application more user friendly

    }                                                                           //Method closing brackets

    public static void printMenu() throws IOException {                         //Start of print menu method with declared exeption

        System.out.println("\n1. Book an appointment.");                        //Prints line in console
        System.out.println("2. Cancel an appointment.");                        //Prints line in console
        System.out.println("3. View a doctor's schedule.");                     //Prints line in console
        System.out.println("4. View a patients appointment.");                  //Prints line in console
        System.out.println("5. Exit.");                                         //Prints line in console

        int options1 = 0;                                                       //Declaring variable options1 for this menu
        while (options1 != -1) {                                                //While loop for options choice

            options1 = keyboard.nextInt();                                      //Declaring that variable equals user input

            switch (options1) {                                                 //Switch statement depending on user input

                case 1:                                                         //1st case

                    bookAnAppointmentMenu();                                    //Calls book an apointment method

                    break;                                                      //Break statement to stop switch execution

                case 2:                                                         //2nd case
                    cancelAnAppointmentMenu();                                  //Calls cancel appointment method
                    break;                                                      //Break statement to stop switch execution

                case 3:                                                         //3rd case
                    viewDoctorsScheduleMenu();                                  //Calls view doctors schedule method
                    break;                                                      //Break statement to stop switch execution

                case 4:                                                         //4th case
                    viewPatientsAppointmentMenu();                              //Calls view patients appointment method
                    break;                                                      //Break statement to stop switch execution

                case 5:                                                         //5th case
                    System.out.println("\nThank you for using Woodland Medic Centre Appointment Application."); //Prints line in console, makes application more user friendly
                    System.out.println("Good Bye.");                            //Prints line in console, makes application more user friendly
                    Runtime.getRuntime().halt(0);                               //Stops applications execution
                    break;                                                      //Break statement to stop switch execution

                default:                                                        //Default case, specifies what happens if invalid case option was chosen
                    System.out.println("Please select valid option.");          //Prints line in console, makes application more user friendly
                    break;                                                      //Break statement to stop switch execution
            }                                                                   //Switch closing brackets

        }                                                                       //While loop closing brackets
    }                                                                           //Methods closing brackets

    public static void bookAnAppointmentMenu() throws IOException {             //Start of book an appointment method with declared exeption

        keyboard.nextLine();                                                    //Cleans the buffer memory, prevents input skipping
        System.out.println("Please Enter Patients First Name:");                //Prints line in console, makes application more user friendly
        String firstName = keyboard.nextLine();                                 //Takes user input for patients first name

        System.out.println("Please Enter Patients Surname Name:");              //Prints line in console, makes application more user friendly
        String surname = keyboard.nextLine();                                   //Takes user input for patients surname

        System.out.println("Please Enter Patients Telephone Number:");          //Prints line in console, makes application more user friendly
        long TelNumber = keyboard.nextLong();                                      //Takes user input for patients phone number
        keyboard.nextLine();                                                    //Cleans the buffer memory, prevents input skipping

        System.out.println("Please Enter Patients Date of Birth:");             //Prints line in console, makes application more user friendly
        String DOB = keyboard.nextLine();                                       //Takes user input for patients date of birth

        System.out.println("Please Enter Patients Country of Origin:");         //Prints line in console, makes application more user friendly
        String COO = keyboard.nextLine();                                       //Takes user input for patients country of origin

        String slotTime = "";                                                   //Sets patient slot time as an empty string

        Patient patient = new Patient(firstName, surname, TelNumber, DOB, COO, slotTime);   //Creates new patient object

        patients.add(patient);                                                  //Adds patient object to the array list

        printSlotChoise();                                                      //Calls for print slot choise method

        while (options != -1) {                                                 //While loop for options choice

            options = keyboard.nextInt();                                       //Declaring that variable equals user input
            switch (options) {                                                  //Switch statement depending on user input
                case 1:                                                         //1st case

                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable   
                    System.out.println("\nPlease Enter Doctor Name:");          //Prints line in console, makes application more user friendly
                    Scanner sc1 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    String doctorName = sc1.nextLine();                         //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly

                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 2:                                                         //2nd case
                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable
                    System.out.println("\nPlease Enter Doctor Name: ");         //Prints line in console, makes application more user friendly
                    Scanner sc2 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    doctorName = sc2.nextLine();                                //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 3:                                                         //3rd case
                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable
                    System.out.println("\nPlease Enter Doctor Name: ");         //Prints line in console, makes application more user friendly
                    Scanner sc3 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    doctorName = sc3.nextLine();                                //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 4:                                                         //4th case
                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable
                    System.out.println("\nPlease Enter Doctor Name: ");         //Prints line in console, makes application more user friendly
                    Scanner sc4 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    doctorName = sc4.nextLine();                                //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 5:                                                         //5th case
                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable
                    System.out.println("\nPlease Enter Doctor Name: ");         //Prints line in console, makes application more user friendly
                    Scanner sc5 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    doctorName = sc5.nextLine();                                //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 6:                                                         //6th case
                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable
                    System.out.println("\nPlease Enter Doctor Name: ");         //Prints line in console, makes application more user friendly
                    Scanner sc6 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    doctorName = sc6.nextLine();                                //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 7:                                                         ////7th case
                    doctorAvailability(options - 1);                            //Calls for doctor availability method and passes the variable
                    System.out.println("\nPlease Enter Doctor Name: ");         //Prints line in console, makes application more user friendly
                    Scanner sc7 = new Scanner(System.in);                       //Create new scanner object to prevent mixing with case choice
                    doctorName = sc7.nextLine();                                //Declares that variable is equal user input
                    choseSlot(patient, doctorName, options);                    //Calls for chose slot method and passes the variables
                    System.out.println("\nThank you, appointment has been booked. Returning to main Menu:\n");  //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 8:                                                         ////8th case
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                case 9:                                                         //9th case
                    System.out.println("\nThank you for using Woodland Medic Centre Appointment Application."); //Prints line in console, makes application more user friendly
                    System.out.println("Good Bye.");                            //Prints line in console, makes application more user friendly
                    Runtime.getRuntime().halt(0);                               //Stops applications execution
                    break;                                                      //Break statement to stop switch execution
                default:                                                        //Default case, specifies what happens if invalid case option was chosen
                    System.out.println("Please select valid option.");          //Prints line in console, makes application more user friendly
                    break;                                                      //Break statement to stop switch execution
            }                                                                   //Switch closing brackets

        }                                                                       //While loop closing brackets

    }                                                                           //Methods closing brackets

    static public boolean choseSlot(Patient p, String doctorName, int options) {    //Start of boolean method chose slot with passed variables

        for (int i = 0; i < doctor.size(); i++) {                               //For loop to iterate through doctors array list
            Doctor d = doctor.get(i);                                           //Gets doctors object from array list
            if (d.name.equalsIgnoreCase(doctorName)) {                          //If statement, checks if variable is equal doctors name
                d.slot[options - 1] = p;                                        //Adds patient object to doctors slot array
                p.setSlotTime(d.slotTimes[options - 1]);                        //Set method, sets patients appointment time
                return true;                                                    //Returns true if condition is met
            }                                                                   //If statements closing brackets

        }                                                                       //For loops closing brackets

        return false;                                                           //Returns false if condition is not met

    }                                                                           //Methods closing brackets

    public static void cancelAnAppointmentMenu() throws IOException {           //Start of cancel an appointment method with declared exeption

        System.out.println("Please Provide patients First Name:");              //Prints line in console, makes application more user friendly
        keyboard.nextLine();                                                    //Cleans the buffer memory, prevents input skipping
        String f = keyboard.nextLine();                                         //Declares variable as user input

        System.out.println("Please Provide patients Surname:");                 //Prints line in console, makes application more user friendly

        String s = keyboard.nextLine();                                         //Declares variable as user input

        for (int i = 0; i < doctor.size(); i++) {                               //For loop to iterate through doctors array list
            Doctor d = doctor.get(i);                                           //Gets doctors object from array list
            for (int j = 0; j < d.slot.length; j++) {                           //For loop to iterate through doctors slot array
                Patient p = d.slot[j];                                          //Checks for patient object in doctors slot array
                if (p != null && p.firstName.equalsIgnoreCase(f) && p.surname.equalsIgnoreCase(s)) {    //If statement, compares patient name and surname with user input
                    d.slot[j] = null;                                           //Makes slot array element equal to null
                    d.availability[j] = "Available";                            //Sets doctors availability array element back to available

                }                                                               //If statement closing brackets

            }                                                                   //For loop closing brackets
        }                                                                       //For loop closing brackets
        System.out.println("Appointment was canceled, returning to main menu. Thank you."); //Prints line in console, makes application more user friendly
        printMenu();                                                            //Calls for print menu method, takes user to main menu

    }                                                                           //Methods closing brackets

    public static void viewDoctorsScheduleMenu() throws IOException {           //Start of view doctors schedule method with declared exeption

        System.out.println("\nPlease select a Doctor:");                        //Prints line in console, makes application more user friendly
        System.out.println("1. Dr. Emily Likova.");                             //Prints line in console, makes application more user friendly
        System.out.println("2. Dr. Stephen Marganic.");                         //Prints line in console, makes application more user friendly
        System.out.println("3. Dr. Seagal Handsome.");                          //Prints line in console, makes application more user friendly
        System.out.println("4. Dr. Lily Win.");                                 //Prints line in console, makes application more user friendly
        System.out.println("5. Entire Doctor Schedule for Today.");             //Prints line in console, makes application more user friendly
        System.out.println("6. Entire Doctor Schedule Between Two Dates.");     //Prints line in console, makes application more user friendly
        System.out.println("7. Back.");                                         //Prints line in console, makes application more user friendly
        System.out.println("8. Exit.");                                         //Prints line in console, makes application more user friendly

        while (options != -1) {                                                 //While loop for options choice
            options = keyboard.nextInt();                                       //Declaring that variable equals user input

            switch (options) {                                                  //Switch statement depending on user input

                case 1:                                                         //1st case

                    Doctor d = doctor.get(0);                                   //Gets an object from doctors array lists 1st slot

                    d.replaceNull();                                            //Calls for doctor class replace null method
                    System.out.println(Arrays.toString(d.slotTimes));           //Outprints doctor classes slot times array to console
                    System.out.println(d.name + "     " + Arrays.toString(d.availability)); //Outprints doctors name and doctor classes availability array to console

                    break;                                                      //Break statement to stop switch execution

                case 2:                                                         //2nd case
                    d = doctor.get(1);                                          //Gets an object from doctors array lists 2nd slot

                    d.replaceNull();                                            //Calls for doctor class replace null method
                    System.out.println(Arrays.toString(d.slotTimes));           //Outprints doctor classes slot times array to console
                    System.out.println(d.name + " " + Arrays.toString(d.availability));     //Outprints doctors name and doctor classes availability array to console

                    break;                                                      //Break statement to stop switch execution

                case 3:                                                         //3rd case
                    d = doctor.get(2);                                          //Gets an object from doctors array lists 3rd slot

                    d.replaceNull();                                            //Calls for doctor class replace null method
                    System.out.println(Arrays.toString(d.slotTimes));           //Outprints doctor classes slot times array to console
                    System.out.println(d.name + "  " + Arrays.toString(d.availability));    //Outprints doctors name and doctor classes availability array to console
                    break;                                                      //Break statement to stop switch execution

                case 4:                                                         //4th case
                    d = doctor.get(3);                                          //Gets an object from doctors array lists 4th slot

                    d.replaceNull();                                            //Calls for doctor class replace null method
                    System.out.println(Arrays.toString(d.slotTimes));           //Outprints doctor classes slot times array to console
                    System.out.println(d.name + "         " + Arrays.toString(d.availability)); //Outprints doctors name and doctor classes availability array to console
                    break;                                                      //Break statement to stop switch execution

                case 5:                                                         //5th case

                    viewAllDoctorsAppointments();                               //Calls for view all doctors appointments method
                    viewDoctorsScheduleMenu();                                  //Method calls itself to take user back to choice
                    break;                                                      //Break statement to stop switch execution

                case 6:                                                         //6th case

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");        //Creates date and time formatter object
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //Creates new buffered reader object
                    System.out.println("Please input desired start date in format (DD/MM/YYYY):");  //Prints line in console, makes application more user friendly
                    String firstInput = reader.readLine();                                          //Declaring that variable equals user input
                    System.out.println("Please input desired end date in format (DD/MM/YYYY):");    //Prints line in console, makes application more user friendly
                    String secondInput = reader.readLine();                                         //Declares that variable equals user input
                    LocalDate firstDate = LocalDate.parse(firstInput, formatter);                   //Parses string input to date format
                    LocalDate secondDate = LocalDate.parse(secondInput, formatter);                 //Parses string input to date format
                    long days = ChronoUnit.DAYS.between(firstDate, secondDate);                     //Declares variable which is equal to ammount of days between user inputs
                    System.out.println("\nDay interval choosen: " + days + "days.\n");              //Prints line in console, makes application more user friendly

                    if (firstDate.isAfter(secondDate)) {                                            //If statement, declares what happens if first date is after second date

                        System.out.println("Please select correct start date.");                    //Prints line in console, makes application more user friendly
                        viewDoctorsScheduleMenu();                                                  //Method calls itself to take user back to choice

                    }
                    LocalDate start = LocalDate.from(firstDate);                                    //Declares start date variable 
                    LocalDate stop = LocalDate.from(secondDate);                                    //Declares stop date variable 
                    LocalDate today = LocalDate.now();                                              //Declares todays date variable
                    Boolean containsToday = (!today.isBefore(start)) && (today.isBefore(stop));     //Boolean check if range of dates contains todays date

                    for (firstDate = start; firstDate.isBefore(secondDate) || firstDate.equals(secondDate); firstDate = firstDate.plusDays(1)) {    //For loop to iterate through dates

                        if (containsToday = true && firstDate.equals(today)) {                      //If statement to declare what happens if date range contains today

                            System.out.println("\nAll doctors scedule for today " + today + " is: \n"); //Prints line in console, makes application more user friendly
                            viewAllDoctorsAppointments();                                           //Calls for view all doctors appointment method to take user back to menu

                        } else {                                                                    //Else statement to declare what happens if today is not in range of dates
                            System.out.println("\nAll doctors scedule for " + firstDate + " date is:\n");   //Prints line in console, makes application more user friendly
                            System.out.println("[                     09:00,      10:00,     11:00,     12:00,     13:00,     14:00,     15:00]");  //Prints line in console, makes application more user friendly
                            System.out.println("Dr Emily Likova     [Available, Available, Available, Available, Available, Available, Available]");    //Prints line in console, makes application more user friendly
                            System.out.println("Dr Stephen Marganic [Available, Available, Available, Available, Available, Available, Available]");    //Prints line in console, makes application more user friendly
                            System.out.println("Dr Seagal Handsome  [Available, Available, Available, Available, Available, Available, Available]");    //Prints line in console, makes application more user friendly
                            System.out.println("Dr Lily Win         [Available, Available, Available, Available, Available, Available, Available]");    //Prints line in console, makes application more user friendly

                        }                                                       //Else statements closing brackets

                    }                                                           //For loop closing brackets
                    viewDoctorsScheduleMenu();                                  //Method calls itself to take user back to choice

                    break;                                                      //Break statement to stop switch execution

                case 7:                                                         //7th case
                    printMenu();                                                //Calls for print menu method, takes user to main menu
                    break;                                                      //Break statement to stop switch execution
                    
                case 8:                                                         //8th case
                    System.out.println("\nThank you for using Woodland Medic Centre Appointment Application."); //Prints line in console, makes application more user friendly
                    System.out.println("Good Bye.");                            //Prints line in console, makes application more user friendly
                    Runtime.getRuntime().halt(0);                               //Stops applications execution

                default:                                                        //Default case, specifies what happens if invalid case option was chosen
                    System.out.println("Please select valid option.");          //Prints line in console, makes application more user friendly
                    break;                                                      //Break statement to stop switch execution

            }                                                                   //Switch closing brackets
        }                                                                       //While loop closing brackets

    }                                                                           //Methods closing brackets

    public static void viewAllDoctorsAppointments() {                           //Start of view all doctors appointment method

        Doctor d = doctor.get(0);                                               //Gets an object from doctors array lists 1nd slot

        d.replaceNull();                                                        //Calls for doctor class replace null method
        System.out.println(Arrays.toString(d.slotTimes));                       //Outprints doctor classes slot times array to console
        System.out.println(d.name + "     " + Arrays.toString(d.availability)); //Outprints doctors name and doctor classes availability array to console
        d = doctor.get(1);                                                      //Gets an object from doctors array lists 2nd slot

        d.replaceNull();                                                        //Calls for doctor class replace null method

        System.out.println(d.name + " " + Arrays.toString(d.availability));     //Outprints doctors name and doctor classes availability array to console
        d = doctor.get(2);                                                      //Gets an object from doctors array lists 3rd slot

        d.replaceNull();                                                        //Calls for doctor class replace null method

        System.out.println(d.name + "  " + Arrays.toString(d.availability));    //Outprints doctors name and doctor classes availability array to console
        d = doctor.get(3);                                                      //Gets an object from doctors array lists 4th slot

        d.replaceNull();                                                        //Calls for doctor class replace null method

        System.out.println(d.name + "         " + Arrays.toString(d.availability)); //Outprints doctors name and doctor classes availability array to console

    }                                                                           //Methods closing brackets

    public static void viewPatientsAppointmentMenu() throws IOException {       //Start of view patients appointment method with declared exeption

        
        System.out.println("Please Provide patients First Name:");              //Prints line in console, makes application more user friendly
        keyboard.nextLine();                                                    //Cleans the buffer memory, prevents input skipping
        String f = keyboard.nextLine();                                         //Declares variable as user input

        System.out.println("Please Provide patients Surname:");                 //Prints line in console, makes application more user friendly
        String s = keyboard.nextLine();                                         //Declares variable as user input

        for (int i = 0; i < doctor.size(); i++) {                               //For loop to iterate through doctors array list
            Doctor d = doctor.get(i);                                           //Gets doctors object from array list
            for (int j = 0; j < d.slot.length; j++) {                           //For loop to iterate through doctors slot array
                Patient p = d.slot[j];                                          //Checks for patient object in doctors slot array
                if (p != null && p.firstName.equalsIgnoreCase(f) && p.surname.equalsIgnoreCase(s)) {    //If statement, declares what happens if patients is not equal to null and name andsurename are equal user input

                    d.printDoctorDetails();                                     //Calls for doctor classes print doctor details method
                    System.out.println("Appointment slot time is:" + p.slotTime);   //Prints line in console, makes application more user friendly

                    p.printDetails();                                           //Calls for patient classes print details method

                    System.out.println("\nReturned to main menu. Thank you");   //Prints line in console, makes application more user friendly
                    printMenu();                                                //Calls for print menu method, takes user to main menu 

                }                                                               //If statement closint brackets

            }                                                                   //For loop closing brackets
        }                                                                       //For loop closing brackets
    }                                                                           //Methods closing brackets

    public static void printSlotChoise() {                                      //Start of print slot choice method
        System.out.println("\nPlease select a Time Slot:");                     //Prints line in console to display time slots and make application more user friendly
        System.out.println("1. 09:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("2. 10:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("3. 11:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("4. 12:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("5. 13:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("6. 14:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("7. 15:00");                                         //Prints line in console to display time slots and make application more user friendly
        System.out.println("8. Back.");                                         //Prints line in console, makes application more user friendly
        System.out.println("9. Exit");                                          //Prints line in console, makes application more user friendly
    }                                                                           //Methods closing brackets

    static public void doctorAvailability(int options) {                        //Start of doctor availability method

        for (int i = 0; i < doctor.size(); i++) {                               //For loop to iterate through doctors array list
            Doctor d = doctor.get(i);                                           //Gets doctors object from array list

            Patient p = d.slot[options];                                        //Sets patient object equal to doctors slot array

            if (p == null) {                                                    //If statement to declare what happens if patient is equal null

                System.out.println(d.name);                                     //Prints doctors name

            }                                                                   //If statement closing brackets
        }                                                                       //For loop closing brackets
    }                                                                           //Methods closing brackets

}                                                                               //Main class closing brackets                                                                               
