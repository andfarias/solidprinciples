package br.com.andersonfariasdev.solidprinciples.dip.factory;

import br.com.andersonfariasdev.solidprinciples.dip.model.Db;
import br.com.andersonfariasdev.solidprinciples.dip.model.IDbProduct;
import br.com.andersonfariasdev.solidprinciples.dip.model.MongoDBProduct;
import br.com.andersonfariasdev.solidprinciples.dip.model.MySQLProduct;

public class DbProductFactory {
    public static IDbProduct create(Db dbType) {
        if (dbType == Db.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }
    }
}
