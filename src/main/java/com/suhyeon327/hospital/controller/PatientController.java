package com.suhyeon327.spring_hospital_system.controller;

import com.suhyeon327.spring_hospital_system.model.Patient;
import com.suhyeon327.spring_hospital_system.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // 환자 등록 API
    @PostMapping
    public Patient createPatient(
            @RequestParam String name,
            @RequestParam int age
    ) {
        return patientService.create(name, age);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.findAll();
    }
}
