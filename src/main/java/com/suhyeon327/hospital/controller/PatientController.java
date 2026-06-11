package com.suhyeon327.hospital.controller;

import com.suhyeon327.hospital.dto.UpdatePatientRequest;
import com.suhyeon327.hospital.model.Patient;
import com.suhyeon327.hospital.service.PatientService;
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

    @PutMapping("/{id}")
    public String updatePatient(
            @PathVariable int id,
            @RequestBody UpdatePatientRequest request
    ) {
        boolean result = patientService.update(
                id,
                request.getName(),
                request.getAge()
        );

        if (result) {
            return "수정 완료";
        }

        return "해당 환자를 찾을 수 없습니다.";
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {

        boolean result = patientService.delete(id);

        if (result) {
            return "삭제 완료";
        }

        return "해당 환자를 찾을 수 없습니다.";
    }
}
