package mcsp.services.service;

import mcsp.services.dto.ServiceDTO;

import java.util.List;

public interface ServiceService extends BaseCrudService<ServiceDTO>{
    List<ServiceDTO> createList(List<ServiceDTO> serviceDTOS);

    List<ServiceDTO> getAllServiceByIdClassification(Long classificationId);

    void deleteAllServiceByIdClassification(Long id);
}
