package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.model.doctor.DoctorData;
import med.voll.api.model.doctor.DoctorRepository;
import med.voll.api.model.doctor.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired // dependencies injection
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void post(@RequestBody @Valid DoctorData data) {
        repository.save(new Doctor(data));
    }

}
