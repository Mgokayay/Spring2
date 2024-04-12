package com.workintech.Spring2.rest;

import com.workintech.Spring2.model.Developer;
import com.workintech.Spring2.tax.Taxable;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/developers")
public class DeveloperController {



    private Map<Integer, Developer> developers;

    private Taxable taxable;
    @Autowired
    public DeveloperController(Taxable taxable) {
        this.taxable = taxable;
    }

    @PostConstruct
    public void init(){
        developers = new HashMap<>();
    }

    @PostMapping
    public Developer save(@RequestBody Developer developer){
        //TODO create developer by experience
        //TODO calculate tax and substract from existing salary salary = salary-salary*taxrate
        return null;
    }
}
