package mcsp.doctors.controller;

import lombok.RequiredArgsConstructor;
import mcsp.doctors.dto.PositionDTO;
import mcsp.doctors.service.PositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/positions")
@RequiredArgsConstructor
public class PositionController {

    private final PositionService positionService;

    @GetMapping("/{id}")
    public PositionDTO getById(@PathVariable Long id) {
        return positionService.getById(id);
    }

    @PostMapping
    public PositionDTO create(@RequestBody PositionDTO position) {
        return positionService.create(position);
    }

    @PutMapping
    public PositionDTO update(@RequestBody PositionDTO position) {
        return positionService.update(position);
    }

    @GetMapping
    public List<PositionDTO> getAll() {
        return positionService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        positionService.delete(id);
    }


}
