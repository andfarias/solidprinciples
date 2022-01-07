package br.com.andersonfariasdev.solidprinciples.lsp;

public interface IPaymentInstrument {
    void validate() throws Exception;
    void collectPayment();
}
