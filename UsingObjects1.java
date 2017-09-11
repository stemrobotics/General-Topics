public class Class1
{
      public void class1Method( Class2 class2Instance )
      {
            System.out.println( class2Instance.name );
      }
}

public class Class2
{
      public String name = "Class2";

      public void someMethod()
      {
            Class1 c1 = new Class1();

            c1.class1Method( this );
      }
}
