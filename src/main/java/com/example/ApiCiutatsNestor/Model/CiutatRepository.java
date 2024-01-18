package com.example.ApiCiutatsNestor.Model;

import com.example.ApiCiutatsNestor.Model.Ciutat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CiutatRepository extends CrudRepository<Ciutat,Long> {

    Optional<Ciutat> findByNom(String nom);

}
