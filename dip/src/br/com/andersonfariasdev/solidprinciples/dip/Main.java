package br.com.andersonfariasdev.solidprinciples.dip;

import br.com.andersonfariasdev.solidprinciples.dip.payment.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
