package br.com.andersonfariasdev.solidprinciples.lsp;

abstract public class NubankCard implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {
        //validação básico
        System.out.println("Verificando saldo");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado");
    }
}
