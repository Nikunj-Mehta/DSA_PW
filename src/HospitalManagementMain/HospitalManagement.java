package HospitalManagementMain;

import java.util.ArrayList;
import java.util.Scanner;
import HospitalManagement.Patient;
import HospitalManagement.Doctor;
import HospitalManagement.Appointment;

public class HospitalManagement {

    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    addPatient(sc);
                    break;
                case 2:
                    addDoctor(sc);
                    break;
                case 3:
                    scheduleAppointment(sc);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice != 0);

        sc.close();
    }


    private static void addPatient(Scanner sc) // Using this scanner object declared in main method
    {
        System.out.print("Enter Patient's Name: ");
        String name = sc.next();
        System.out.println();

        System.out.print("Enter Patient's Age: ");
        int age = sc.nextInt();
        System.out.println();

        System.out.print("Enter Patient's Gender: ");
        String gender = sc.next();
        System.out.println();

        Patient patient = new Patient(name, gender, age);
        patients.add(patient);

        System.out.println("Patient added successfully");
    }

    private static void addDoctor(Scanner sc)
    {
        System.out.print("Enter Doctor's Name: ");
        String name = sc.next();
        System.out.println();

        System.out.print("Enter Doctor's Speciality: ");
        String speciality = sc.next();
        System.out.println();

        Doctor doctor = new Doctor(name, speciality);
        doctors.add(doctor);

        System.out.println("Doctor added successfully added successfully");
    }

    private static void scheduleAppointment(Scanner sc)
    {
        System.out.print("Enter Patient's ID: ");
        int patientId = sc.nextInt();

        System.out.print("Enter Doctor's ID: ");
        int doctorId = sc.nextInt();

        System.out.print("Enter Appointment Date(YYYY-MM-DD): ");
        String date = sc.next();

        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient != null && doctor != null)
        {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        }
        else
        {
            System.out.println("Invalid Patient ID or Doctor ID.");
        }

    }

    private static void viewPatients()
    {
        System.out.println("List of Patients: ");
        for(Patient patient: patients)
        {
            System.out.println(patient);
        }
    }

    private static void viewDoctors()
    {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors)
        {
            System.out.println(doctor);
        }
    }

    private static void viewAppointments()
    {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments)
        {
            System.out.println(appointment);
        }
    }

    private static Patient findPatientById(int id)
    {
        for(Patient patient: patients)
        {
            if(patient.getId() == id) return patient;
        }
        return null;
    }

    private static Doctor findDoctorById(int id)
    {
        for (Doctor doctor : doctors)
        {
            if (doctor.getId() == id) return doctor;
        }
        return null;
    }
}
