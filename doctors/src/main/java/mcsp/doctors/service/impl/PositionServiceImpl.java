package mcsp.doctors.service.impl;

import lombok.RequiredArgsConstructor;
import mcsp.doctors.dto.PositionDTO;
import mcsp.doctors.entity.Position;
import mcsp.doctors.exception.ResourceNotFoundException;
import mcsp.doctors.mapper.PositionMapper;
import mcsp.doctors.repository.PositionRepository;
import mcsp.doctors.service.PositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;
    private final PositionMapper positionMapper;

    @Override
    public PositionDTO getById(Long id) {
        return positionMapper.toDto(positionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Должность не найдена")));
    }

    @Override
    public List<PositionDTO> getAll() {
        return positionMapper.toDto(positionRepository.findAll());
    }

    @Override
    public PositionDTO create(PositionDTO position) {
        return positionMapper.toDto(positionRepository.save(positionMapper.toEntity(position)));
    }

    @Override
    public PositionDTO update(PositionDTO position) {
        return positionMapper.toDto(positionRepository.save(positionMapper.toEntity(position)));
    }

    @Override
    public void delete(Long id) {
        positionRepository.deleteById(id);
    }
}
