package com.demo.desafio.controller;

import com.demo.desafio.dto.EnterpriseDto;
import com.demo.desafio.entity.Enterprise;
import com.demo.desafio.entity.Provider;
import com.demo.desafio.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping
    public List<Enterprise> getAll(){
        return enterpriseService.getAllEnterprise();
    }

    @GetMapping("/{id}")
    public Enterprise getEnterprise(@PathVariable Long id){
        return enterpriseService.getEnterprise(id);
    }

    @PostMapping
    public Enterprise createEnterprise(@RequestBody EnterpriseDto dto){
        return enterpriseService.createEnterprise(dto);
    }

    @PutMapping("/{id}")
    public Enterprise updateEnterprise(@PathVariable Long id, @RequestBody EnterpriseDto dto){
        return enterpriseService.updateEnterprise(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteEnterprise(@PathVariable Long id){
        enterpriseService.deleteEnterprise(id);
    }
}
