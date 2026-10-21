package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;
import java.util.List;

public class StudentController {

    private final StudentService service =
            new StudentService();

    public void registrar(int id, String nombre, String carrera) {
        service.registrarEstudiante(id, nombre, carrera);
        System.out.println("Estudiante registrado: " + nombre);
    }

    public void mostrarEstudiantes() {
        List<StudentEntity> estudiantes =
                service.listarEstudiantes();

        for (StudentEntity estudiante : estudiantes) {
            System.out.println(
                    estudiante.getId() + " - " +
                            estudiante.getNombre() + " - " +
                            estudiante.getCarrera()
            );
        }
    }
}

