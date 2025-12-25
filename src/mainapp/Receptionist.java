package mainapp;

import java.util.ArrayList;

public class Receptionist extends Employee {
    public Receptionist(String userID, String name, String username, String password, String employeeID, String contactInfo) {
        super(userID, name, username, password, employeeID, contactInfo);
    }

    public void scheduleAppointment(ArrayList<Appointment> appointments, Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Receptionist " + name + " scheduled appointment ID: " + appointment.getAppointmentID());
    }

    public void cancelAppointment(ArrayList<Appointment> appointments, String appointmentID) {
        Appointment toRemove = null;
        for (Appointment a : appointments) {
            if (a.getAppointmentID().equals(appointmentID)) {
                toRemove = a;
                break;
            }
        }
        if (toRemove != null) {
            appointments.remove(toRemove);
            System.out.println("Receptionist " + name + " canceled appointment ID: " + appointmentID);
        } else {
            System.out.println("Appointment ID " + appointmentID + " not found.");
        }
    }

    public void addPatient(ArrayList<Patient> patientList, Patient p) {
        patientList.add(p);
        System.out.println("Patient " + p.getName() + " added by Receptionist " + name);
    }

    public void removePatient(ArrayList<Patient> patientList, String patientID) {
        Patient toRemove = null;
        for (Patient pt : patientList) {
            if (pt.getPatientID().equals(patientID)) {
                toRemove = pt;
                break;
            }
        }
        if (toRemove != null) {
            patientList.remove(toRemove);
            System.out.println("Patient " + toRemove.getName() + " removed by Receptionist " + name);
        } else {
            System.out.println("Patient with ID " + patientID + " not found.");
        }
    }

    public void addDoctor(ArrayList<Doctor> doctorList, Doctor d) {
        doctorList.add(d);
        System.out.println("Doctor " + d.getName() + " added by Receptionist " + name);
    }

    public void removeDoctor(ArrayList<Doctor> doctorList, String doctorID) {
        Doctor toRemove = null;
        for (Doctor dr : doctorList) {
            if (dr.getUserID().equals(doctorID)) {
                toRemove = dr;
                break;
            }
        }
        if (toRemove != null) {
            doctorList.remove(toRemove);
            System.out.println("Doctor " + toRemove.getName() + " removed by Receptionist " + name);
        } else {
            System.out.println("Doctor with ID " + doctorID + " not found.");
        }
    }
}
