package mcsp.doctors.mapper;

import mcsp.doctors.dto.SpecializationDTO;
import mcsp.doctors.entity.Specialization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SpecializationMapper extends Mappable<Specialization, SpecializationDTO> {
}
