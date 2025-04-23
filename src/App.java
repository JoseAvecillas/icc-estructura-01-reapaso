
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 39),
            new Persona("Elena", 26),
        };

        
         //*0. Instanciar clases necesarias
        PersonaController pC= new PersonaController();
        ViewConsole vC = new ViewConsole();
        //  * 1. Mensaje= Arreglo Personas

        vC.printMessage("Arreglo de Personas");
        //  * 2. Imprimimos el arreglo
        vC.printPersonsArray(personas);
        //  * 3. Mensaje= Arreglo ordenado por insercion ascendete
        vC.printMessage("\nArreglo de Personas ordenado");
        pC.ordenarPorEdad(personas); // Ordenado
        //  * 4.Imprimos el arreglo ordenado
        vC.printPersonsArray(personas); // Imprimiendo ya ordenado
        //  * 5. Mensaje= buscar persona con edad 40
        //  * 6. Imprimir resultado de busqueda y la persona si la encontro
        vC.printMessage("Persona con edad de 40:");
        Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if (personaBuscada== null) {
            vC.printMessage("Persona de 40 no encontrada");
        }else{
            vC.printMessage("Se encontro persona con edad 40");
            vC.printMessage(personaBuscada.toString());
        }
        //  * 7. Mensaje buscar persona con edad 99
        //  * 8.Imprimir resultado de busqueda de la persona si la encontro
        vC.printMessage("Persona con edad de 99:");
        Persona personaBuscada1 = pC.buscarPorEdad(personas, 99);
        if (personaBuscada1== null) {
            vC.printMessage("Persona de 99 no encontrada");
        }else{
            vC.printMessage("Se encontro persona con edad 99");
            vC.printMessage(personaBuscada.toString());
        }
    }
}
