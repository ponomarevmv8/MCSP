package mcsp.services.dto;

import lombok.Data;

@Data
public class ServiceDTO {

    private Long id;
    private String name;
    private double prices;
    private ClassificationDTO classification;

}

