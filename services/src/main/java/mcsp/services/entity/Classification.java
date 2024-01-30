package mcsp.services.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "classification")
@Data
public class Classification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long parent;

}
