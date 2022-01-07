package br.com.andersonfariasdev.solidprinciples.ocp.vehicle;

public interface IVehicleCar {
    void configureVehicle(String color, String year, double engine, int seats);
    void startVehicle();
}