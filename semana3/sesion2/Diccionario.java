package semana3.sesion2;

import java.util.HashMap;

public class Diccionario {

    public static void main(String[] args) {
        
        HashMap<String, Persona> diccionario =
            new HashMap<String, Persona>();
        diccionario.put(
            "2313213",
            new Persona("Juan", 23)
        );
        diccionario.put(
            "332433",
            new Persona("Pedro", 24)
        );
        System.out.println(diccionario.size());
        System.out.println(diccionario.get("2313213"));
    }
    
}
