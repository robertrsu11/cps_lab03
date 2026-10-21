package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;

public class StudentService {

    private final StudentRepository repository =
            new StudentRepository();

    public void registrarEstudiante(int id, String nombre,
                                    String carrera) {
        StudentEntity estudiante =
                new StudentEntity(id, nombre, carrera);
        repository.guardar(estudiante);
    }

    public List<StudentEntity> listarEstudiantes() {
        return repository.listar();
    }
}

