package com.LAAG.madlibs.controller;


import org.springframework.web.bind.annotation.*;
import com.LAAG.madlibs.model.MadLibRequest;
import com.LAAG.madlibs.service.MadLibService;

@RestController
@RequestMapping("/api")
public class MadLibController {
    //Es la capa que recibe peticiones HTTP, delega la lógica al Service y devuelve la respuesta.
    private final MadLibService madLibService;

    public MadLibController(MadLibService madLibService) {
        this.madLibService = madLibService;
    }

    @PostMapping("/generate")
    public String generate(@RequestBody MadLibRequest request) {
        return madLibService.generateStory(request);
    }
}
