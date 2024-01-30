package mcsp.services.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "service")
@Data
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double prices;

    @CollectionTable(name = "services_classifications")
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "classification_id")
    private Classification classification;

}
