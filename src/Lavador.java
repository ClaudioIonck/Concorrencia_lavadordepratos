public class Lavador extends Thread {
    @Override
    public void run() {
        while (Pratos.pratosParaLavar > 0) {
            synchronized (Pratos.escorredor) {
                while (Pratos.escorredor.size() == 10) {
                    try {
                        Pratos.escorredor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Pratos.escorredor.add(Pratos.pratosParaLavar--);
                System.out.println("Lavador lavou um prato. Pratos restantes para lavar: " + Pratos.pratosParaLavar);
                Pratos.escorredor.notifyAll();
            }
        }
    }
}