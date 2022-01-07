package br.com.andersonfariasdev.solidprinciples.lsp;

public class CreditCard extends NubankCard {
    @Override
    public void validate() throws Exception {
        //validação do cartão de crédito
        super.validate();
        System.out.println("Limite ok");
    }
}
