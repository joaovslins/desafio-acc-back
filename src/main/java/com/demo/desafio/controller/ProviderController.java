package com.demo.desafio.controller;

import com.demo.desafio.dto.ProviderDto;
import com.demo.desafio.entity.Provider;
import com.demo.desafio.service.impl.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderServiceImpl providerService;

    @GetMapping
    public List<Provider> getAll(){
        return providerService.getAllProvider();
    }

    @GetMapping("/{id}")
    public Provider getProvider(@PathVariable Long id){
        return providerService.getProvider(id);
    }

    @GetMapping("/name/{name}")
    public List<Provider> getProviderByName(@PathVariable String name){
        return providerService.findProviderByName(name);
    }

    @GetMapping("/document/{document}")
    public List<Provider> getProviderByDocument(@PathVariable String document){
        return providerService.findProviderByDocument(document);
    }

    @PostMapping
    public Provider createProvider(@RequestBody ProviderDto dto){
        return providerService.createProvider(dto);
    }

    @PutMapping("/{id}")
    public Provider updateProvider(@PathVariable Long id, @RequestBody ProviderDto dto){
        return providerService.updateProvider(id, dto);
    }

    @DeleteMapping({"/{id}"})
    public void deleteProvider(@PathVariable Long id){
        providerService.deleteProvider(id);
    }
}
