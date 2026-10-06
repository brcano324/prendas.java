package app.view;

import app.service.Inputports.PrendaUseCase;
import java.util.Scanner;

public class PrendaView {

    Scanner sc = new Scanner(System.in);

    private final PrendaUseCase prendaService;

    public PrendaView(PrendaUseCase prendaUseCase) {
        this.prendaService = prendaUseCase;
    }

    public void createPrenda() {

        System.out.println("Creating prenda");

        System.out.print("Ingrese el ID de la prenda: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el nombre/tipo de la prenda: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la marca de la prenda: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese la talla de la prenda (XS, S, M, L, XL): ");
        String talla = sc.nextLine();

        System.out.print("Ingrese el estado de la prenda (Excelente, Bueno, Regular): ");
        String estado = sc.nextLine();

        System.out.print("Ingrese el precio de la prenda: ");
        double precio = Double.parseDouble(sc.nextLine());

        prendaService.createPrenda(id, nombre, marca, talla, estado, precio);
    }

    public void showPrenda() {
        System.out.println("Showing Prenda");
        prendaService.showPrendas();
    }

    public void showPrendaById() {
        System.out.println("Getting prenda by Id");
        System.out.print("Ingrese el ID de la prenda a buscar: ");
        int id = Integer.parseInt(sc.nextLine());
        prendaService.showPrendaById(id);
    }

    public void deletePrenda() {
        System.out.println("Deleting prenda");
        System.out.print("Ingrese el ID de la prenda a eliminar: ");
        int id = Integer.parseInt(sc.nextLine());
        prendaService.deletePrenda(id);
    }
}