package mcsp.services.service.impl;

import lombok.RequiredArgsConstructor;
import mcsp.services.dto.ServiceDTO;
import mcsp.services.entity.Classification;
import mcsp.services.mapper.ServiceMapper;
import mcsp.services.repository.ClassificationRepository;
import mcsp.services.repository.ServiceRepository;
import mcsp.services.service.ClassificationService;
import mcsp.services.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;
    private final ServiceMapper serviceMapper;
    private final ClassificationRepository classificationRepository;


    @Override
    public ServiceDTO create(ServiceDTO serviceDTO) {
        return serviceMapper.toDto(
                serviceRepository.save(serviceMapper.toEntity(serviceDTO))
        );
    }

    @Override
    public ServiceDTO update(ServiceDTO serviceDTO) {
        return serviceMapper.toDto(
                serviceRepository.save(serviceMapper.toEntity(serviceDTO))
        );
    }

    @Override
    public ServiceDTO getById(Long id) {
        return serviceMapper.toDto(
                serviceRepository.findById(id).orElseThrow(() -> new RuntimeException("Услуги не найдено"))
        );
    }

    @Override
    public List<ServiceDTO> getAll() {
        return serviceMapper.toDto(
                serviceRepository.findAll()
        );
    }

    @Override
    public void delete(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public List<ServiceDTO> createList(List<ServiceDTO> serviceDTOS) {

        return serviceMapper.toDto(
                serviceRepository.saveAll(serviceMapper.toEntity(serviceDTOS))
        );
    }

    @Override
    public List<ServiceDTO> getAllServiceByIdClassification(Long classificationId) {
        return serviceMapper.toDto(serviceRepository.findAllByClassificationId(classificationId));
    }

    @Override
    public void deleteAllServiceByIdClassification(Long id) {
        serviceRepository.deleteAll(
                serviceRepository.findAllByClassificationId(id)
        );
    }
}
