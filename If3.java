if ( x == 2 )
    z = 5;
else if ( y == 0 ) 
    z = 2;              // This statement is executed.

if ( x == 2 )
    z = 5;
else if ( y == 1 ) 
    z = 2;              // Neither statement is executed, both boolean results are false.
You can also do:
if ( x == 9 )
    z = 5;
else if ( y == 9 ) 
    z +=2;
else
    z = 9;              // This statement is executed.
