public class MySingleton
{
    private static  MySingleton mySingleton;
    public  int     instanceCount;

    private MySingleton()
    {
        instanceCount++;
    }

    public static MySingleton getInstance()
    {
        if (mySingleton == null) mySingleton = new MySingleton();

        return mySingleton;
    }
    
    public int getInstanceCount()
    {
        return instanceCount;
    }
}
