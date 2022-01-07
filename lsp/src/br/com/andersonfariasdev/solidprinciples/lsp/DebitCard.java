package br.com.andersonfariasdev.solidprinciples.lsp;

public class DebitCard extends NubankCard {
    @Override
    public void validate() throws Exception {
        super.validate();
        System.out.println("Saldo disponivel");
    }
}
