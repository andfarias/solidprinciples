package br.com.andersonfariasdev.solidprinciples.lsp;

import br.com.andersonfariasdev.solidprinciples.lsp.vehicles.Car;
import br.com.andersonfariasdev.solidprinciples.lsp.vehicles.Motorcycle;

public class Main {
    private static String type;

    public static void main(String[] args) {
        type = "Car";
        if (type == "Car") {
            Car car = new Car("Azul", "2022", 2.6, 4);
        } else {
            Motorcycle motorcycle = new Motorcycle("branca", "2022", 250);
        }
    }
}
