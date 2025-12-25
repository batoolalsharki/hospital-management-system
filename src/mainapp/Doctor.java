package mainapp;

import java.util.ArrayList;

public class Doctor extends User {
    private String specialty;
    private String location;
    private boolean availability = true;

    public Doctor(String userID, String name, String username, String password, String specialty, String location) {
        super(userID, name, username, password);
        this.specialty = specialty;
        this.location = location;
    }

    public void updateDoctorInfo(String newSpecialty, String newLocation) {
        this.specialty = newSpecialty;
        this.location = newLocation;
        System.out.println("Doctor " + name + "'s info updated.");
    }

    public void setDoctorAvailability(boolean available) {
        this.availability = available;
        System.out.println("Doctor " + name + " availability set to " + (available ? "available" : "not available"));
    }

    public boolean getDoctorAvailability() {
        return availability;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getLocation() {
        return location;
    }

    public void viewMyAppointments(ArrayList<Appointment> appointments) {
        System.out.println("Appointments for Dr. " + name + ":");
        boolean found = false;
        for (Appointment a : appointments) {
            if (a.getDoctor().equals(this)) {
                System.out.println(a.toString());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No appointments found.");
        }
    }

    @Override
    public String toString() {
        return "Doctor: " + getName() + " (ID: " + getUserID() + "), Specialty: " + specialty + ", Location: " + location;
    }
}
