import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Pratos {
    public static Queue<Integer> escorredor = new LinkedBlockingQueue<>(10);
    public static int pratosParaLavar = 100;
}