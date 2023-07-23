package com.demo.desafio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer type;

    @Column(unique = true)
    @ColumnDefault("false")
    private String document;

    private String email;

    private String cep;

    private Integer age;

    private Long rg;

    private String birthday;

    @ManyToMany
    private List<Enterprise> enterprises = new ArrayList<>();

}
