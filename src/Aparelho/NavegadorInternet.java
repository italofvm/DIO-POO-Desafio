package Aparelho;

public class NavegadorInternet implements Iphone.NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando o site... ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Aberta...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada...");
    }
}
