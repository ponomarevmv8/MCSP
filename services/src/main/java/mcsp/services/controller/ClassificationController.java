package mcsp.services.controller;

import lombok.RequiredArgsConstructor;
import mcsp.services.dto.ClassificationDTO;
import mcsp.services.service.ClassificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classifications")
@RequiredArgsConstructor
public class ClassificationController {

    private final ClassificationService classificationService;


    @GetMapping("/{id}")
    public ClassificationDTO getById(@PathVariable Long id) {
        return classificationService.getById(id);
    }

    @GetMapping
    public List<ClassificationDTO> getAll() {
        return classificationService.getAll();
    }

    @PostMapping
    public ClassificationDTO create(@RequestBody ClassificationDTO classificationDTO) {
        return classificationService.create(classificationDTO);
    }

    @PutMapping
    public ClassificationDTO update(@RequestBody ClassificationDTO classificationDTO) {
        return classificationService.update(classificationDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        classificationService.delete(id);
    }

}
