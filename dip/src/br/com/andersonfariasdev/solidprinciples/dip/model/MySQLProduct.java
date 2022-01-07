package br.com.andersonfariasdev.solidprinciples.dip.model;

public class MySQLProduct implements IDbProduct {

    @Override
    public String getProductById(String productId) {
        return "MySQL:Exibindo dados do produto " + productId;
    }
}
