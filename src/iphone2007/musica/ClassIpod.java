package iphone2007.musica;
public class ClassIpod implements ReprodutorMusical{
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
}
