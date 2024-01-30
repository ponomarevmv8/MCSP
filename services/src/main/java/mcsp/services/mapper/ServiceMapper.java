package mcsp.services.mapper;

import mcsp.services.dto.ServiceDTO;
import mcsp.services.entity.Service;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceMapper extends Mappable<Service, ServiceDTO>{
}
