import Aparelho.AparelhoTelefonico;
import Aparelho.Iphone;
import Aparelho.NavegadorInternet;
import Aparelho.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("XR", "T3XT7");

        Iphone.ReprodutorMusical reprodutor = new ReprodutorMusical();
        Iphone.AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        Iphone.NavegadorInternet navegadorInternet = new NavegadorInternet();

        System.out.println("----------------------------------------");
        //Reprodutor Musical
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.SelecionarMusica("Musica 2");

        System.out.println("----------------------------------------");
        //Aparelho Telefonico
        aparelhoTelefonico.ligar("9 9999-9999");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioDeVoz();

        System.out.println("----------------------------------------");
        //Navegador de Internet
        navegadorInternet.exibirPagina("www.google.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}