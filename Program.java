
public class Program {

    public static void main(String[] args) {
        LockableDoor l= new LockableDoor();
        l.close();
        l.lClose();
        l.state();
        l.unlock();
        l.lOpen();
        l.lClose();
        l.state();
    }

}
