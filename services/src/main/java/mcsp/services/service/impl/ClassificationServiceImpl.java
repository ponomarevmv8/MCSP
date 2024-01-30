package mcsp.services.service.impl;

import lombok.RequiredArgsConstructor;
import mcsp.services.dto.ClassificationDTO;
import mcsp.services.mapper.ClassificationMapper;
import mcsp.services.repository.ClassificationRepository;
import mcsp.services.service.ClassificationService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ClassificationServiceImpl implements ClassificationService {

    private final ClassificationRepository classificationRepository;
    private final ClassificationMapper classificationMapper;

    @Override
    public ClassificationDTO create(ClassificationDTO classificationDTO) {
        return classificationMapper.toDto(
                classificationRepository.save(classificationMapper.toEntity(classificationDTO))
        );
    }

    @Override
    public ClassificationDTO update(ClassificationDTO classificationDTO) {
        return classificationMapper.toDto(
                classificationRepository.save(classificationMapper.toEntity(classificationDTO))
        );
    }

    @Override
    public ClassificationDTO getById(Long id) {
        return classificationMapper.toDto(
                classificationRepository.findById(id).orElseThrow(
                        () -> new RuntimeException("Классификация не найдена"))
        );
    }

    @Override
    public List<ClassificationDTO> getAll() {
        return classificationMapper.toDto(
                classificationRepository.findAll()
        );
    }

    @Override
    public void delete(Long id) {
        classificationRepository.deleteById(id);
    }
}
