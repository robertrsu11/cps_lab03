package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private int id;
    private String nombre;
    private String carrera;

    public StudentEntity(int id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }
}

