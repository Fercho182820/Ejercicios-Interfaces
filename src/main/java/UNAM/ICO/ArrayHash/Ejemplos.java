package UNAM.ICO.ArrayHash;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejemplos {
    public static void main(String[] args){

        // ----------------ArrayList: Escuela
        ArrayList<String> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add("Garcia");
        listaEstudiantes.add("Carrillo");
        listaEstudiantes.add("Villalba");

        System.out.println("Alumno numero 2 de la lista: " + listaEstudiantes.get(1));

        // ------------------HashMap: Calificacion
        HashMap<String, Integer> calificaciones = new HashMap<>();
        calificaciones.put("Garcia",9);
        calificaciones.put("Carrillo",10);
        calificaciones.put("Villalba",8);

        System.out.println("El estudiante " + listaEstudiantes.get(1) + " tiene una calificacion de " + calificaciones.get("Carrillo"));

        //Garcia entrego un proyecto
        calificaciones.put("Garcia",10);
        if (calificaciones.containsKey("Perez")) {
            System.out.println("Calificacion: " + calificaciones.get("Perez"));
        } else {
            System.out.println("El alumno no se encuentra en el sistema");
        }
        //Villalba se cambio de escuela
        listaEstudiantes.remove(2);
        calificaciones.remove("Villalba");
        System.out.println(listaEstudiantes.get(0) + calificaciones.get("Garcia"));

        //for each
        for (String nombre : listaEstudiantes){
            System.out.println("Alumno: " + nombre + " | Calificacion: " +  calificaciones.get(nombre));
        }




    }

}
