package mcsp.doctors.controller;

import lombok.RequiredArgsConstructor;
import mcsp.doctors.dto.SpecializationDTO;
import mcsp.doctors.entity.Specialization;
import mcsp.doctors.service.SpecializationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/specializations")
@RequiredArgsConstructor
public class SpecializationController {

    private final SpecializationService specializationService;

    @GetMapping("/{id}")
    public SpecializationDTO getById(@PathVariable Long id) {
        return specializationService.getById(id);
    }

    @PostMapping
    public SpecializationDTO create(@RequestBody SpecializationDTO specialization) {
        return specializationService.create(specialization);
    }

    @PutMapping
    public SpecializationDTO update(@RequestBody SpecializationDTO specialization) {
        return specializationService.update(specialization);
    }

    @GetMapping
    public List<SpecializationDTO> getAll() {
        return specializationService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        specializationService.delete(id);
    }

}
