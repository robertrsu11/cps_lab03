package pe.edu.tecsup.lab03;

import pe.edu.tecsup.lab03.controllers.StudentController;

public class Application {

    public static void main(String[] args) {

        StudentController controller =
                new StudentController();

        controller.registrar(
                1, "Robert Silva Ullilen",
                "Diseño y Desarrollo de Software"
        );

        controller.registrar(
                2, "Juan Perez",
                "Ingenieria de Sistemas"
        );

        System.out.println("LISTA DE ESTUDIANTES:");
        controller.mostrarEstudiantes();
    }
}


