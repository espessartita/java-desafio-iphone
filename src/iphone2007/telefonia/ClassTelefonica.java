package iphone2007.telefonia;
public class ClassTelefonica implements AparelhoTelefonico{
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
}
