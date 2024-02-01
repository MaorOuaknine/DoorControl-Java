
public class LockableDoor extends Door {
    private boolean lock;

    public LockableDoor() {
        super();
        lock=true;
    }
    public void lOpen() {
        if(lock==true) {
            super.open();}
        else {
            System.out.println("Impossible The door is lock.");
        }
    }
    public void Close () {
        super.close();
    }
    public void lClose() {
        if(super.isOpen()==false)
            lock=false;
        else {
            System.out.println("Impossible The door is open.");
        }
    }

    public void unlock() {
        lock=true;
    }

    public void state() {
        if (super.isOpen()==true)
            System.out.println("the door is open.");
        else {
            System.out.println("the door is close.");
        }
        if(lock==true)
            System.out.println("the lock is open.");
        else {
            System.out.println("the lock is close.");
        }
    }
}

