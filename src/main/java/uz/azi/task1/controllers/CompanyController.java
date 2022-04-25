package uz.azi.task1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.azi.task1.entity.Company;
import uz.azi.task1.service.CompanyService;

import java.util.List;

/**
 * @Author Aziza Tojiboyeva
 */
@RestController
@RequestMapping(value = "/api/company/*")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService service;


    @GetMapping(value = "/all")
    public ResponseEntity<List<Company>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/one/{id}")
    public ResponseEntity<Company> getOne(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(service.getOne(id));
    }
    




}
