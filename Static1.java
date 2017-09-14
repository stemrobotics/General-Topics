class MyClass
{
    public int theVar;

    public String toString()
    {
        return "theVar=" + theVar;
    }
}

{ some code in some other class.
    MyClass instance1 = new MyClass();
    MyClass instance2 = new MyClass();

    instance1.theVar = 3;
    instance2.theVar = 7;

    System.out.println(instance1.toString() + "   " + instance2.toString());
}
