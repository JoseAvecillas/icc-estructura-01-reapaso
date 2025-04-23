package views;

import Models.Persona;

public class ViewConsole {

    public void printPersonsArray(Persona[] personas){
        StringBuilder resultado = new StringBuilder();
        for (Persona persona : personas) {
            if (persona != null) {
                resultado.append(persona.toString()).append(" || ");
            }
        }


        if (resultado.length() > 0) {
            resultado.setLength(resultado.length() - 4); 
        }

        System.out.println(resultado.toString());
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}