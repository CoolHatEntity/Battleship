import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        DrawGame Draw = new DrawGame(0, "Posicione suas peças");
        Draw = new DrawGame(1, "Jogue");
        Draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
