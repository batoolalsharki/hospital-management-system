package mainapp;

public class Appointment {
    private String appointmentID;
    private String date;
    private String time;
    private String type;
    private Doctor doctor;
    private Patient patient;

    public Appointment(String appointmentID, String date, String time, String type, Doctor doctor, Patient patient) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.type = type;
        this.doctor = doctor;
        this.patient = patient;
    }

    public void scheduleAppointment() {
        System.out.println("Appointment " + appointmentID + " scheduled.");
    }

    public void cancelAppointment() {
        System.out.println("Appointment " + appointmentID + " canceled.");
    }

    public void rescheduleAppointment(String newDate, String newTime) {
        this.date = newDate;
        this.time = newTime;
        System.out.println("Appointment " + appointmentID + " rescheduled to " + newDate + " at " + newTime);
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentID + ", Type: " + type + ", Date: " + date + ", Time: " + time +
                ", Doctor: " + doctor.getName() + ", Patient: " + patient.getName();
    }
}
