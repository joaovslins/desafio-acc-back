package com.demo.desafio.dto;

import com.demo.desafio.entity.Enterprise;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDto {

    private Long id;

    private String name;

    private String email;

    private String cep;

    private Integer type;

    private String document;

    private Integer age;

    private Long rg;

    private String birthday;

    private List<Enterprise> enterprises;
}
