package com.demo.desafio.service.impl;

import com.demo.desafio.dto.ProviderDto;
import com.demo.desafio.entity.Provider;
import com.demo.desafio.repository.ProviderRepository;
import com.demo.desafio.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public List<Provider> getAllProvider() {
        return providerRepository.findAll();
    }

    @Override
    public Provider getProvider(Long id) {
        return providerRepository.findById(id).get();
    }

    @Override
    public Provider createProvider(ProviderDto dto) {
        Provider model = new Provider();

        model.setName(dto.getName());
        model.setCep(dto.getCep());
        model.setEmail(dto.getEmail());
        model.setAge(dto.getAge());
        model.setRg(dto.getRg());
        model.setBirthday(dto.getBirthday());
        model.setType(dto.getType());
        model.setDocument(dto.getDocument());
        model.setEnterprises(dto.getEnterprises());

        providerRepository.save(model);

        return model;
    }

    @Override
    public Provider updateProvider(Long id, ProviderDto dto) {
        Provider model = providerRepository.findById(id).get();

        model.setName(dto.getName());
        model.setCep(dto.getCep());
        model.setEmail(dto.getEmail());
        model.setAge(dto.getAge());
        model.setRg(dto.getRg());
        model.setBirthday(dto.getBirthday());
        model.setType(dto.getType());
        model.setDocument(dto.getDocument());
        model.setEnterprises(dto.getEnterprises());

        providerRepository.save(model);

        return model;
    }

    @Override
    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }

    @Override
    public List<Provider> findProviderByName(String name) {
        return providerRepository.findAllByName(name);
    }

    @Override
    public List<Provider> findProviderByDocument(String document) {
        return providerRepository.findAllByDocument(document);
    }
}
