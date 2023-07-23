package com.demo.desafio.dto;

import com.demo.desafio.entity.Provider;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDto {

    private Long id;

    private String cnpj;

    private String fantasy_name;

    private String corporate_name;

    private String cep;

    private List<Provider> providers;
}
