package Aparelho;

public class AparelhoTelefonico implements Iphone.AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligado realizada...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendido...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz Iniciado...");
    }
}
