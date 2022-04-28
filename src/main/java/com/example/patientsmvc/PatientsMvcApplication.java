package com.example.patientsmvc;

import com.example.patientsmvc.entities.patient;
import com.example.patientsmvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
@AllArgsConstructor
@SpringBootApplication
public class PatientsMvcApplication implements CommandLineRunner{
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(
                new patient(null, "test", new Date(), Math.random() > 0.5 ? true : false,(int)(Math.random()*100)));
       /* for (int i=0; i<100; i++) {
            patientRepository.save(
                    new patient(null, "Aya", new Date(), Math.random() > 0.5 ? true : false,(int)(Math.random()*100)));
        }
        Page<patient> patients = patientRepository.findAll(PageRequest.of(1,10));
        System.out.println("total pages:"+ patients.getTotalPages());
        System.out.println("total elements "+patients.getTotalPages());
        System.out.println("Num Page "+patients.getNumber());
        List<patient> content= patients.getContent();
        Page<patient> byMalade= patientRepository.findByMalade(true, PageRequest.of(0,4));
        List<patient> patientList=patientRepository.chercherPatient(":%h%", 40);
        byMalade.forEach(p->{
            System.out.println("=============");
            System.out.println(p.getId());
            System.out.println(p.getNom());
            System.out.println(p.getScore());
            System.out.println(p.getDateNaissance());
            System.out.println(p.isMalade());

        });

        System.out.println("******************");
        patient patient=patientRepository.findById(1L).orElse(null);
        if(patient!=null){
            System.out.println(patient.isMalade());
            System.out.println(patient.getNom());
        }
        patient.setScore(870);
        patientRepository.save(patient);
        patientRepository.deleteById(1L);*/


    }

}
