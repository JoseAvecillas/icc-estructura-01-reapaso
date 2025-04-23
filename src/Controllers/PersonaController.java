package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona actual = personas[i];
            int j = i - 1;
    
            while (j >= 0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
    
            personas[j + 1] = actual;
        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;
    
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            int edadMedio = personas[medio].getEdad();
    
            if (edadMedio == edad) {
                while (medio > 0 && personas[medio - 1].getEdad() == edad) {
                    medio--;
                }
                return personas[medio];
            } else if (edadMedio < edad) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return null;
    }
}
