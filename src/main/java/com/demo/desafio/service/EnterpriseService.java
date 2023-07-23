package com.demo.desafio.service;

import com.demo.desafio.dto.EnterpriseDto;
import com.demo.desafio.entity.Enterprise;
import com.demo.desafio.entity.Provider;

import java.util.List;

public interface EnterpriseService {

    List<Enterprise> getAllEnterprise();

    Enterprise getEnterprise(Long id);

    Enterprise createEnterprise(EnterpriseDto dto);

    Enterprise updateEnterprise(Long id, EnterpriseDto dto);

    void deleteEnterprise(Long id);
}
