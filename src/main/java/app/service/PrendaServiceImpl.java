package app.service;

import app.service.Inputports.PrendaUseCase;

public class PrendaServiceImpl implements PrendaUseCase {

    @Override
    public void createPrenda(int id, String nombre, String marca, String talla, String estado, double precio) {
        // Lógica para guardar o procesar la prenda
        System.out.println("Prenda registrada correctamente: " + nombre);
    }

    @Override
    public void showPrendas() {
        System.out.println("Listando todas las prendas...");
    }

    @Override
    public void showPrendaById(int id) {
        System.out.println("Buscando prenda con ID: " + id);
    }

    @Override
    public void deletePrenda(int id) {
        System.out.println("Eliminando prenda con ID: " + id);
    }
}