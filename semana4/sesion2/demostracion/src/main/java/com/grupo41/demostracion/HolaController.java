package com.grupo41.demostracion;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class HolaController {

    @GetMapping("perros")
    public ArrayList<Perro> saludar() {
        ArrayList<Perro> perros = new ArrayList<Perro>();
        perros.add(new Perro("Firulais", "Labrador", 2,
                "https://images.dog.ceo/breeds/kuvasz/n02104029_4456.jpg"));
        perros.add(new Perro("Tony", "Spaniel Cocker", 3,
                "https://images.dog.ceo/breeds/spaniel-cocker/n02102318_14794.jpg"));
        perros.add(new Perro("Pancho", "Spaniel Cocker", 4,
                "https://images.dog.ceo/breeds/spaniel-cocker/Lucky the dog2.jpg"));
        perros.add(new Perro("Pepito", "Terrier Norwich", 5,
                "https://images.dog.ceo/breeds/terrier-norwich/n02094258_1386.jpg"));
        return perros;
    }

}
