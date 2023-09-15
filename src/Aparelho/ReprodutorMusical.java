package Aparelho;

public class ReprodutorMusical implements Iphone.ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando Musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada...");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Selecionar a musica: " + musica);
    }
}
