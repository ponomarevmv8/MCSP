package mcsp.doctors.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "doctor")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @CollectionTable(name = "doctors_positions")
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id")
    private List<Position> position;

    @Column(name = "work_experience")
    private Integer workExperience;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "photo")
    private String photo;

    @CollectionTable(name = "doctors_specializations")
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "specialization_id")
    private List<Specialization> specialization;

}
