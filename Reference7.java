Stringbuffer mySB = new StringBuffer("abc");

public void myMethod1( StringBuffer sb )
{
      sb.append( "xyz" );
}

public void myMethod2( StringBuffer sb )
{
    sb = new StringBuffer( "123");
}

myMethod1( mySB );

myMethod2( mySB );
