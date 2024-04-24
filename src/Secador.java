public class Secador extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Pratos.escorredor) {
                while (Pratos.escorredor.isEmpty()) {
                    try {
                        Pratos.escorredor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer pratoSeco = Pratos.escorredor.poll();
                System.out.println("Secador " + this.getName() + " está secando o prato " + pratoSeco + ". Pratos no escorredor: " + Pratos.escorredor.size());
                Pratos.escorredor.notifyAll();
            }
            try {
                Thread.sleep(1000); // tempo para secar o prato
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}