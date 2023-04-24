package Ejercicios;

public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distancia(Punto punto){
        int dX = this.x-punto.getX();
        int dY = this.y-punto.getY();
        int base = (int) Math.pow(dX,2);
        int altura = (int) Math.pow(dY, 2);
        int catetos = base+altura;
        return Math.sqrt(catetos);
    }

    public double distancia(int x, int y){
        return this.distancia(new Punto(x,y));
    }
}
