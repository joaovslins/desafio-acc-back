package com.demo.desafio.service;

import com.demo.desafio.dto.EnterpriseDto;
import com.demo.desafio.dto.ProviderDto;
import com.demo.desafio.entity.Enterprise;
import com.demo.desafio.entity.Provider;

import java.util.List;

public interface ProviderService {
    List<Provider> getAllProvider();

    Provider getProvider(Long id);

    Provider createProvider(ProviderDto dto);

    Provider updateProvider(Long id, ProviderDto dto);

    void deleteProvider(Long id);

    List<Provider> findProviderByName(String name);

    List<Provider> findProviderByDocument(String document);
}
