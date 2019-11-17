package Singleton;

public class SynSingleObject {
    private static SynSingleObject obj;

    private SynSingleObject() {}

    // Only one thread can execute this at a time

    //Java provides a way of creating threads and synchronizing their task by using synchronized blocks
    //All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block.
    public static synchronized SynSingleObject getInstance()
    {
        if (obj==null)
            obj = new SynSingleObject();
        return obj;

        //The main disadvantage of this is method is that using synchronized every time
        // while creating the singleton object is expensive
        // and may decrease the performance of your program.
    }
}
