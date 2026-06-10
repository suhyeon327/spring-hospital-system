package com.suhyeon327.hospital.service;

import com.suhyeon327.hospital.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private List<Patient> patients = new ArrayList<>();

    // CREATE
    public Patient create(String name, int age) {
        Patient patient = new Patient(name, age);
        patients.add(patient);
        return patient;
    }

    // READ
    public List<Patient> findAll() {
        return patients;
    }
}
