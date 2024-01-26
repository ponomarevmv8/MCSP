package mcsp.doctors.mapper;

import mcsp.doctors.dto.DoctorDTO;
import mcsp.doctors.entity.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DoctorMapper extends Mappable<Doctor, DoctorDTO>{

    @Override
    @Mapping(source = "position", target = "position")
    @Mapping(source = "specialization", target = "specialization")
    DoctorDTO toDto(Doctor entity);
}
