package com.demo.desafio.repository;

import com.demo.desafio.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

    List<Provider> findAllByDocument(String document);

    List<Provider> findAllByEmail(String email);

    List<Provider> findAllByName(String name);
}
