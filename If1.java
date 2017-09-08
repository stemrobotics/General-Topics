if ( x == y ) z = 9;      // x and y are equal so the boolean result is true and the statement is executed.

if ( x == y )
    z = 9;                // This is the same as above, the single statement can be on the next line.

if ( x == y )             // The two statements in the block are executed.
{
    z = 9;
    z = x + 3;
}

 if ( x > -1) y = 2;      // x is not greater than -1 (it is zero) so the statement is not executed.
