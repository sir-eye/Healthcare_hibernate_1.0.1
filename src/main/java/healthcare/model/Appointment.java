package healthcare.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppointmentID")
    private int appointmentId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "PatientID", referencedColumnName = "PatientID", nullable = false)
    private Patient patient;  // Updated field

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID", nullable = false)
    private Doctor doctor;  // Updated field

    @Column(name = "AppointmentDate")
    private String appointmentDate;

    @Column(name = "Notes")
    private String notes;

    // Default constructor
    public Appointment() {}

    // Updated constructor to use objects instead of IDs
    public Appointment(Patient patient, Doctor doctor, String appointmentDate, String notes) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.notes = notes;
    }

    // Getters and Setters
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
