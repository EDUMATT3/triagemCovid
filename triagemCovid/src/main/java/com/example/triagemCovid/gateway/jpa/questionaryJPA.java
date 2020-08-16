package com.example.triagemCovid.gateway.jpa;

import com.example.triagemCovid.models.Questionary;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface questionaryJPA extends Repository<Questionary, Long> {
    Questionary findByRegistry(int r);
    Questionary save(Questionary persisted);
    List<Questionary> findAll();
}
