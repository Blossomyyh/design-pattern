package Singleton;

public class DCLSingleton {
    /**
     * obj volatile which ensures that multiple threads
     * offer the obj variable correctly
     * when it is being initialized to Singleton instance.
     */
    private volatile static DCLSingleton obj;

    /**
     * Accessing a volatile variable synchronizes all the cached copied of the variables in the main memory.
     * Volatile can only be applied to instance variables,
     * which are of type object or private.
     * A volatile object reference can be null.
     */


    //private constructor
    private DCLSingleton() {}


    public static DCLSingleton getInstance()
    {
        if (obj == null)
        {
            // To make thread safe -- only one DCLSingleton.class can be operated at a time
            synchronized (DCLSingleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new DCLSingleton();
            }
        }
        return obj;
    }
}
