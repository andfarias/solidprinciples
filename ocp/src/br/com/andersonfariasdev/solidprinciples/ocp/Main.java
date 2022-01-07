package br.com.andersonfariasdev.solidprinciples.ocp;

import br.com.andersonfariasdev.solidprinciples.ocp.vehicle.Car;
import br.com.andersonfariasdev.solidprinciples.ocp.vehicle.Motorcycle;

public class Main {
    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {
        typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle == TypeVehicle.CAR) {
            Car car = new Car("Amarelo", "2021", 2.0, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("", "2021", 250);
        }
    }
}
