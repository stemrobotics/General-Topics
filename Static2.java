class MyClass2
{
    public static int globalCount = 0;
    public int theVar = 0;

    // class constructor counts each new instance of the class.

    public MyClass2()
    {
        globalCount++;
    }

    public static int getTheCount()
    {
        return globalCount;
    }
}

{ some code in some other class.
    System.out.println("instance count=" + MyClass2.getTheCount());

    MyClass2 instance1 = new MyClass2();
    MyClass2 instance2 = new MyClass2();
   
    // access the static (global) variable directly using the
    // name of the class not an instance reference.

    MyClass2.globalCount++;

    System.out.println("instance count=" + MyClass2.getTheCount());
   
    MyClass2.theVar++; 
}
