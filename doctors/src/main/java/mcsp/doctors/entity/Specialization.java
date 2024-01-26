package mcsp.doctors.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Specialization")
@Data
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
