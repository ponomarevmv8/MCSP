package mcsp.doctors.service.impl;

import lombok.RequiredArgsConstructor;
import mcsp.doctors.dto.SpecializationDTO;
import mcsp.doctors.entity.Specialization;
import mcsp.doctors.exception.ResourceNotFoundException;
import mcsp.doctors.mapper.SpecializationMapper;
import mcsp.doctors.repository.SpecializationRepository;
import mcsp.doctors.service.SpecializationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecializationServiceImpl implements SpecializationService {

    private final SpecializationRepository specializationRepository;
    private final SpecializationMapper specializationMapper;

    @Override
    public SpecializationDTO create(SpecializationDTO specialization) {
        return specializationMapper.toDto(specializationRepository.save(specializationMapper.toEntity(specialization)));
    }

    @Override
    public SpecializationDTO update(SpecializationDTO specialization) {
        return specializationMapper.toDto(specializationRepository.save(specializationMapper.toEntity(specialization)));
    }

    @Override
    public SpecializationDTO getById(Long id) {
        return specializationMapper.toDto(specializationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Не найдена специализация")));
    }

    @Override
    public List<SpecializationDTO> getAll() {
        return specializationMapper.toDto(specializationRepository.findAll());
    }

    @Override
    public void delete(Long id) {
        specializationRepository.deleteById(id);
    }
}
