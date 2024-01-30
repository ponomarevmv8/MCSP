package mcsp.services.service.impl;

import lombok.RequiredArgsConstructor;
import mcsp.services.dto.ServiceDTO;
import mcsp.services.mapper.ServiceMapper;
import mcsp.services.repository.ServiceRepository;
import mcsp.services.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;
    private final ServiceMapper serviceMapper;


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
}
