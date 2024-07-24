package co.dlacademy.utils;

import com.github.javafaker.Faker;

public class GeneradorDatos extends Faker {

    public String generarNombre(){
        return name().firstName();
    }

    public String generarApellido(){
        return name().lastName();
    }

    public String generarApodoBanco(){
        return funnyName().name() + number().numberBetween(0,100);
    }

}
