package Aparelho;

public class Iphone {
    private String Modelo;
    private String numeroSerie;

    public Iphone(String modelo, String numeroSerie) {
        Modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public interface ReprodutorMusical{
        void tocar();
        void pausar();
        void SelecionarMusica(String musica);
    }

    public interface AparelhoTelefonico{
        void ligar(String numero);
        void atender();
        void iniciarCorreioDeVoz();
    }

    public interface NavegadorInternet{
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }

}
