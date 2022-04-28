package com.example.patientsmvc.repositories;

import com.example.patientsmvc.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  PatientRepository extends JpaRepository<patient,Long> {


   /* public List<patient> findByMalade(boolean m);
    Page<patient> findByMalade(boolean m, Pageable pageable);
    List<patient> findbyMaladeAndScoreLessThan(boolean m, int score);
    List<patient> findbyMaladeIsTrueAndScoreLessThan( int score);
    List<patient> findbyDateNaissanceBetweenAndMaladeIsTrueOrNomLike(Date d1, Date d2, String mc);
    @Query("select p from patient p where p.nom like :x and p.score<:y")
    List<patient> chercherPatient(@Param("x")String nom,@Param("y") int scoreMin);*/
}
 