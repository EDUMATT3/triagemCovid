package com.example.triagemCovid.controllers;

import com.example.triagemCovid.gateway.jpa.questionaryJPA;
import com.example.triagemCovid.models.Questionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping (mainController.BASE_URL)
public class mainController {
    public static final String BASE_URL = "/questionary";

    @Autowired
    questionaryJPA questionaryRepositorie;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Questionary>> getByRegistry(){
        return new ResponseEntity<List<Questionary>>(questionaryRepositorie.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/registry")
    public ResponseEntity<Questionary> getByRegistry(@RequestParam(name = "id") Integer registry){
        return new ResponseEntity<Questionary>(questionaryRepositorie.findByRegistry(registry), HttpStatus.OK);
    }

    @GetMapping
    public String getDados(Model model){
    model.addAttribute("questionary", new Questionary());
        return "questionary";
    }

    @PostMapping
    public String canGoToWork(@ModelAttribute Questionary questionary, Model model){
        boolean can = questionary.canGoToWork();
        questionaryRepositorie.save(questionary);
        return can ? "canGo" : "cantGo";
    }
}
