public class Coche {
    private int numPuertas;
    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public void agregarPuerta() {
        numPuertas++;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public static void main(String[] args) {

        Coche miChoche = new Coche(4);

        miChoche.agregarPuerta();

        System.out.println("Mi coche tiene " + miChoche.getNumPuertas() + " puertas.");
    }
}