package com.example.patientsmvc.web;


import com.example.patientsmvc.entities.patient;
import com.example.patientsmvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;
    @GetMapping(path="/index")
    public String patients(Model model){
    List<patient> patients=patientRepository.findAll();
    model.addAttribute("listPatients",patients);
    return "patients";
    }
}
