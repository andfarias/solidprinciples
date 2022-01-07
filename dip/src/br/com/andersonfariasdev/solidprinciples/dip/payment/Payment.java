package br.com.andersonfariasdev.solidprinciples.dip.payment;

import br.com.andersonfariasdev.solidprinciples.dip.factory.DbProductFactory;
import br.com.andersonfariasdev.solidprinciples.dip.model.Db;
import br.com.andersonfariasdev.solidprinciples.dip.model.IDbProduct;

public class Payment {
    public void pay(String productId) {
        IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
