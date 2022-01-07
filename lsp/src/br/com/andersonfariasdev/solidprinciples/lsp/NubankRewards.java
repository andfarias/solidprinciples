package br.com.andersonfariasdev.solidprinciples.lsp;

public class NubankRewards implements IPaymentInstrument {

    @Override
    public void validate() throws Exception {
        System.out.println("Limite ok, rewards ok");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso");
        System.out.println("Pontuação creditada corretamente");
    }
}
