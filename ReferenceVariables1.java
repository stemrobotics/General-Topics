String myString = new String("hello");    // Sets myString to point to a new String object instance that
                                          // contains "hello".

String myString1 = "goodbye";             // Special case of String that does the same as the new keyword.
                                          // This only works for Strings and the Number classes (Unit 12).
                                          // Now we have two instances of the object String, one containing
                                          // "hello" and one containing "goodbye".

String myString1 = myString;              // myString1 now points to the same instance of a String object
                                          // containing "hello" that myString points to. The "goodbye" 
                                          // instance is no longer pointed to by a reference variable so it
                                          // is deleted from memory.
