package mcsp.doctors.service.impl;

import lombok.RequiredArgsConstructor;
import mcsp.doctors.dto.DoctorDTO;
import mcsp.doctors.entity.Doctor;
import mcsp.doctors.exception.ResourceNotFoundException;
import mcsp.doctors.mapper.DoctorMapper;
import mcsp.doctors.repository.DoctorRepository;
import mcsp.doctors.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;


    @Override
    public DoctorDTO getById(Long id) {
        return doctorMapper.toDto(doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Доктор не найден")));
    }

    @Override
    public List<DoctorDTO> getAll() {
        return doctorMapper.toDto(doctorRepository.findAll());
    }

    @Override
    public DoctorDTO create(DoctorDTO doctor) {
        return doctorMapper.toDto(doctorRepository.save(doctorMapper.toEntity(doctor)));
    }

    @Override
    public DoctorDTO update(DoctorDTO doctor) {
        return doctorMapper.toDto(doctorRepository.save(doctorMapper.toEntity(doctor)));
    }

    @Override
    public void delete(Long id) {
        doctorRepository.deleteById(id);
    }
}
