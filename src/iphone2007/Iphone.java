package iphone2007;

import iphone2007.telefonia.AparelhoTelefonico;
import iphone2007.musica.ReprodutorMusical;
import iphone2007.browser.NavegadorInternet;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender(int numero) {
        System.out.println("Deslize para atender");
    }

    @Override
    public void iniciarCorreioVoz(String nome) {
        System.out.println("Você tem uma mensagem de voz de " + nome);
    }

    @Override 
    public void tocar(String musica) {
        System.out.println("Tocando agora: " + musica);
    }

    @Override 
    public void pausar(String musica) {
        System.out.println("Toque para pausar a música");
    }

    @Override 
    public void selecionarMusica(String musica) {
        System.out.println("Selecione a música");
    }

    @Override 
    public void exibirPagina(String website) {
        System.out.println("Digite a URL");
    }

    @Override 
    public void adicionarNovaAba(String website) {
        System.out.println("Toque para abrir nova aba");
    }

    @Override 
    public void atualizarPagina(String website) {
        System.out.println("Refresh");
    }

}
