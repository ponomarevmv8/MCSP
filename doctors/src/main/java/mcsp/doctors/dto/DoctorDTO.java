package mcsp.doctors.dto;

import lombok.Data;

import java.util.List;

@Data
public class DoctorDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private List<PositionDTO> position;
    private Integer workExperience;
    private String description;
    private String photo;
    private List<SpecializationDTO> specialization;

}
