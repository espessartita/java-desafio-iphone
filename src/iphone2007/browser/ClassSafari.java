package iphone2007.browser;
public class ClassSafari implements NavegadorInternet {
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
