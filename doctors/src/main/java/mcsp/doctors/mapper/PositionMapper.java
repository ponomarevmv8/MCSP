package mcsp.doctors.mapper;

import mcsp.doctors.dto.PositionDTO;
import mcsp.doctors.entity.Position;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PositionMapper extends Mappable<Position, PositionDTO>{
}
