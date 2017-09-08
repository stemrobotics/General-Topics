public class MySingleton
{
    private static MySingleton mySingleton;
    public  int    instanceCount, accessRequests;

    private MySingleton()
    {
        instanceCount++;
    }

    public static MySingleton getInstance()
    {
        if (mySingleton == null) mySingleton = new MySingleton();

        accessRequests++;
        
        return mySingleton;
    }

    public int getInstanceCount()
    {
        return instanceCount;
    }
    
    public int getRequestCount()
    {
        return accessRequestCount;
    }
}
