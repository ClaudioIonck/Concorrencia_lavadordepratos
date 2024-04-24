public class Main {
    public static void main(String[] args) {
        Lavador lavador = new Lavador();
        Secador secador1 = new Secador();
        Secador secador2 = new Secador();

        secador1.setName("Secador 1");
        secador2.setName("Secador 2");

        lavador.start();
        secador1.start();
        secador2.start();

        try {
            lavador.join();
            secador1.join();
            secador2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}