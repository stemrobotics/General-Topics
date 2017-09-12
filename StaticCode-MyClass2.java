class MyClass2
{
    public static int globalCount = 0;
    public int theVar = 0;

    public MyClass2()
    {
        globalCount++;
    }

    public static int getTheCount()
    {
        return globalCount;
    }
}
