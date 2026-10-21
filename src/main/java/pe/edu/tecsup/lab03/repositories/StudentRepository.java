package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<StudentEntity> estudiantes = new ArrayList<>();

    public void guardar(StudentEntity estudiante) {
        estudiantes.add(estudiante);
    }

    public List<StudentEntity> listar() {
        return new ArrayList<>(estudiantes);
    }
}

