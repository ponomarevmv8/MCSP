package mcsp.services.controller;

import lombok.RequiredArgsConstructor;
import mcsp.services.dto.ServiceDTO;
import mcsp.services.service.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/services/")
@RequiredArgsConstructor
public class ServiceController {

    private final ServiceService serviceService;

    @GetMapping("/{id}")
    public ServiceDTO getById(@PathVariable Long id) {
        return serviceService.getById(id);
    }

    @GetMapping
    public List<ServiceDTO> getAll() {
        return serviceService.getAll();
    }

    @PostMapping
    public ServiceDTO create(@RequestBody ServiceDTO serviceDTO) {
        return serviceService.create(serviceDTO);
    }

    @PutMapping
    public ServiceDTO update(@RequestBody ServiceDTO serviceDTO) {
        return serviceService.update(serviceDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        serviceService.delete(id);
    }

}
