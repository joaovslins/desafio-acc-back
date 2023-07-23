package com.demo.desafio.service.impl;

import com.demo.desafio.dto.EnterpriseDto;
import com.demo.desafio.entity.Enterprise;
import com.demo.desafio.entity.Provider;
import com.demo.desafio.repository.EnterpriseRepository;
import com.demo.desafio.repository.ProviderRepository;
import com.demo.desafio.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {


    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Override
    public List<Enterprise> getAllEnterprise() {
        return enterpriseRepository.findAll();
    }

    @Override
    public Enterprise getEnterprise(Long id) {
        return enterpriseRepository.findById(id).get();
    }

    @Override
    public Enterprise createEnterprise(EnterpriseDto dto) {
        Enterprise model = new Enterprise();

        model.setCorporate_name(dto.getCorporate_name());
        model.setFantasy_name(dto.getFantasy_name());
        model.setCnpj(dto.getCnpj());
        model.setCep(dto.getCep());
        model.setProviders(dto.getProviders());

        enterpriseRepository.save(model);

        return model;
    }

    @Override
    public Enterprise updateEnterprise(Long id, EnterpriseDto dto) {
        Enterprise model = enterpriseRepository.findById(id).get();

        model.setCorporate_name(dto.getCorporate_name());
        model.setFantasy_name(dto.getFantasy_name());
        model.setCnpj(dto.getCnpj());
        model.setCep(dto.getCep());
        model.setProviders(dto.getProviders());

        enterpriseRepository.save(model);

        return model;
    }

    @Override
    public void deleteEnterprise(Long id) {
        enterpriseRepository.deleteById(id);
    }
}
