package mcsp.doctors.controller;

import lombok.RequiredArgsConstructor;
import mcsp.doctors.dto.DoctorDTO;
import mcsp.doctors.entity.Doctor;
import mcsp.doctors.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;


    @GetMapping("/{doctorId}")
    public DoctorDTO getDoctorById(@PathVariable Long doctorId) {
        return doctorService.getById(doctorId);
    }

    @GetMapping
    public List<DoctorDTO> getAllDoctors() {
        return doctorService.getAll();
    }

    @PostMapping
    public String createDoctor(@RequestBody DoctorDTO doctor){
        DoctorDTO newDoctor = doctorService.create(doctor);
        return newDoctor.getId() == null ? "Доктор не создан" : "Доктор сохранен";
    }

    @PutMapping
    public String updateDoctor(@RequestBody DoctorDTO doctor) {
        DoctorDTO updateDoctor = doctorService.update(doctor);
        return "Доктор обновлен";
    }

}
