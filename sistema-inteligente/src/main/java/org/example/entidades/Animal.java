package org.example.entidades;

import org.example.entorno.Entorno;

public class Animal extends Organismos {
private String tipo;
    private String nombre;
    private String raza;
    private String color;
    private String sexo;
    private String edad;
    private String peso;
    private String altura;
    private String fechaNacimiento;
    private String fechaIngreso;
    private String fechaSalida;
    private String estado;
    private String observaciones;
    private String id;
    private String idJaula;
    private String idCuidador;
    private String idVeterinario;
    private String idAlimentacion;
    private String idVacuna;
    private String idDesparasitacion;
    private String idCirugia;
    private String idTratamiento;
    private String idAnalisis;
    private String idSimulacion;
    private String idEspecie;
    private String idFamilia;
    private String idOrden;
    private String idClase;
    private String idReino;
    private String idDominio;
    private String idHabitat;
    private String idAlimentacionAnimal;
    private String idVacunaAnimal;
    private String idDesparasitacionAnimal;
    private String idCirugiaAnimal;
    private String idTratamientoAnimal;
    private String idAnalisisAnimal;
    private String idSimulacionAnimal;
    private String idEspecieAnimal;
    private String idFamiliaAnimal;
    private String idOrdenAnimal;
    private String idClaseAnimal;
    private String idReinoAnimal;
    private String idDominioAnimal;
    private String idHabitatAnimal;
    private String idAlimentacionAnimalAnimal;
    private String idVacunaAnimalAnimal;
    private String idDesparasitacionAnimalAnimal;
    private String idCirugiaAnimalAnimal;
    private String idTratamientoAnimalAnimal;
    private String idAnalisisAnimalAnimal;
    private String idSimulacionAnimalAnimal;
    private String idEspecieAnimalAnimal;
    private String idFamiliaAnimalAnimal;
    private String idOrdenAnimalAnimal;
    private String idClaseAnimalAnimal;
    private String idReinoAnimalAnimal;
    private String idDominioAnimalAnimal;
    private String idHabitatAnimalAnimal;
    private String idAlimentacionAnimalAnimalAnimal;
    private String idVacunaAnimalAnimalAnimal;

    public Animal(String nombre, String tipo, String descripcion, int fecha, String lugar, String estado) {
    super(nombre, tipo, descripcion, String.valueOf(fecha), lugar, estado);
    }

    public void predar(Planta planta) {
        if (planta.getSalud() > 0) {
            planta.setSalud(planta.getSalud() - 1);
            this.salud += 1; // The animal gains health
        }
    }
    @Override
    public void consumirRecurso(Entorno entorno) {
        if (entorno.getRecursosDisponibles() > 0) {
            entorno.setRecursosDisponibles(entorno.getRecursosDisponibles() - 2);
        }
    }
    public void pollinate(Planta planta) {
        planta.pollinate();
    }

    @Override
    public void symbiosis(Organismos partner) {
        super.symbiosis(partner);
    }
}
