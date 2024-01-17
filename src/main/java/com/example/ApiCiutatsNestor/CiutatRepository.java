package com.example.ApiCiutatsNestor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiutatRepository extends CrudRepository<Ciutat,Long> {
}
