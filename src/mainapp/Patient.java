package mainapp;

import java.util.ArrayList;

public class Patient extends User {
    private String patientID;
    private String dateOfBirth;

    public Patient(String userID, String name, String username, String password, String patientID, String dateOfBirth) {
        super(userID, name, username, password);
        this.patientID = patientID;
        this.dateOfBirth = dateOfBirth;
    }

    public void updatePatientInfo(String newName, String newDOB) {
        this.name = newName;
        this.dateOfBirth = newDOB;
        System.out.println("Patient " + patientID + " info updated.");
    }

    public void bookAppointment(ArrayList<Appointment> appointments, Appointment a) {
        appointments.add(a);
        System.out.println("Patient " + name + " booked appointment ID: " + a.getAppointmentID());
    }

    public void cancelAppointment(ArrayList<Appointment> appointments, String appointmentID) {
        Appointment toRemove = null;
        for (Appointment app : appointments) {
            if (app.getAppointmentID().equals(appointmentID) && app.getPatient().equals(this)) {
                toRemove = app;
                break;
            }
        }
        if (toRemove != null) {
            appointments.remove(toRemove);
            System.out.println("Patient " + name + " canceled their appointment ID: " + appointmentID);
        } else {
            System.out.println("No such appointment found for you.");
        }
    }

    public void rescheduleAppointment(ArrayList<Appointment> appointments, String appointmentID, String newDate, String newTime) {
        for (Appointment app : appointments) {
            if (app.getAppointmentID().equals(appointmentID) && app.getPatient().equals(this)) {
                app.rescheduleAppointment(newDate, newTime);
                return;
            }
        }
        System.out.println("No such appointment found for you.");
    }

    public void viewMyAppointments(ArrayList<Appointment> appointments) {
        System.out.println("Appointments for Patient " + name + ":");
        boolean found = false;
        for (Appointment a : appointments) {
            if (a.getPatient().equals(this)) {
                System.out.println(a.toString());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No appointments found.");
        }
    }

    public String getPatientID() {
        return patientID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient: " + getName() + " (PatientID: " + patientID + ", DOB: " + dateOfBirth + ")";
    }
}
