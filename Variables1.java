public class MyClass
{
    int myVar1;

    myVar1 = 5;      // fails, not in a method.

    public void myMethod()
    {
        int myVar2;
        final int myVar4 = 9;

        myVar2 = 1;   // ok.
        myVar1 = 1;   // ok.

        if (myVar1 == 1)
        {
            int myVar3 = 2;

            myVar3 = myVar2 + myVar1;    // ok.
        }

        myVar3 = 7;   // fails. myVar3 only visible in the if statement code block.
    }

    public void myMethod2()
    {
        myVar2 = 3;   // fails, myVar2 only visible in myMethod1.
    }
}
