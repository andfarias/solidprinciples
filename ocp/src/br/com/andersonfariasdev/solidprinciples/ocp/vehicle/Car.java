package br.com.andersonfariasdev.solidprinciples.ocp.vehicle;

public class Car implements IVehicleCar {
    protected String color;
    protected String year;
    protected double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro com interface: " + color + " " + year + " " + engine + " com " + seats + " assentos");
        startVehicle();
    }
//
//    public void startVehicle() {
//        System.out.println("Criando um carro: " + color + " " + year + " " + engine + " com " + seats + " assentos");
//    }
    public void startVehicle() {
        System.out.println("Ligando os motores com interface");
    }
}
