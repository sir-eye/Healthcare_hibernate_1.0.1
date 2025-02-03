package healthcare.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Offices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OfficeID")
    private int officeId;

    @Column(name = "Location", nullable = false)
    private String location;

    @Column(name = "Phone", nullable = false)
    private String phone;

    @OneToOne
    @JoinColumn(name = "DoctorID", unique = true)
    private Doctor doctor;
}