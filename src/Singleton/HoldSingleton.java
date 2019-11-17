package Singleton;

public class HoldSingleton {
    /**
     * private class SingletonHolder -- better than syn-singleton
     */
    private static class SingletonHolder {
        private static final HoldSingleton INSTANCE = new HoldSingleton();
    }
    private HoldSingleton (){}
    public static final HoldSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
