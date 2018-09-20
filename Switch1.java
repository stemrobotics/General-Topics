int x = 2, z;

switch ( x )
{
    case 1:
        z = 1;      // this statement is executed
                    // then continue into case 2 as
                    // there is no break for case 1.

    case 2:
        z = 5;
        break;      // Ends case 2.

    case 3:
         z = 9;

    default:
         z = 11;    // No case matched.
}
