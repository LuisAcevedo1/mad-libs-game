package com.LAAG.madlibs.service;

import org.springframework.stereotype.Service;
import com.LAAG.madlibs.model.MadLibRequest;


@Service
public class MadLibService {
    //Contiene la lógica de negocio independiente del protocolo HTTP.
    public String generateStory(MadLibRequest request) {

        return "Había un " + request.getAnimal() +
               " muy " + request.getAdjetivo() +
               " en el " + request.getLugar() +
               " que decidió " + request.getVerbo() + ".";
    }
}