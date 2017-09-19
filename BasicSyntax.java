/* The next line starts a class definition */

public class MyClass()
{
    // Class level variable definitions, one a constant.
    
    int              myClassLevelVariable = 1;
    static final int MY_CLASS_CONSTANT = 1;

    /* Next line starts a method definition */

    public void myMethod()
    {
        /*
         Method local variable definitions.
        */

        int              myMethodLocalVariable;
        static final int MY_METHOD_CONSTANT = 2;

        // Next line is a statement.

        myMethodLocalVariable = myClassLevelVariable + MY_METHOD_CONSTANT;  // Comment.
    }
}
