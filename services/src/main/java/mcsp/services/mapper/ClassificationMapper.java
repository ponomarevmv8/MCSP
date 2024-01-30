package mcsp.services.mapper;

import mcsp.services.dto.ClassificationDTO;
import mcsp.services.entity.Classification;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClassificationMapper extends Mappable<Classification, ClassificationDTO> {
}
