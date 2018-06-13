public class Class1
{
      // This method wants a reference to an instances of Class2 passed
      // to it when called.
      public void class1Method( Class2 class2Instance )
      {
            System.out.println( class2Instance.name );
      }
}

public class Class2
{
      public String name = "Class2";

      // The method parameter "name" hides the class level variable
      // above inside the method.
      
      public void someMethod(String name)
      {
            // name by itself refers to the parameter variable.
            // this.name refers to the class level variable.
            // The effect if this statement is to save the value
            // passed into the method in the class level variable so
            // that information persists after the method ends.
            
            this.name = name;
            
            Class1 c1 = new Class1();

            // Here we are calling the method on Class1 that wants a reference
            // to an instance of Class2, to which we will pass this instance of
            // Class2 by using the this keyword.
            
            c1.class1Method( this );
      }
}
