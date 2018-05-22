public class HelloWorld
{

     public static void main(String []args)
     {
        int x[] = new int[3];

        x[0] = 5;
        x[1] = 10;
        x[2] = 15;

        System.out.println("array index 1 contains " + x[1]);  // Prints out 10.

        int y1 = x[0] + x[1] * x[2];       // y1 will contain 155. Why?
        
        System.out.println("y1 = " + y1);
        
        int x1[] = new int[] {5, 10, 15};
        int y2[] = {5, 10, 15};            // is also valid.

        int x3[][] = new int[][] {{5,10},{15,20}};
        int x4[][] = new int[2][2];        // is also valid.

        for (int i = 0; i < x3.length; i++)
            for (int j = 0; j < x3.length; j++)
                System.out.println("row(" + i + ") col(" + j + ") = " + x3[i][j]);
        
        java.util.ArrayList <String>al = new java.util.ArrayList<String>();

        al.add("A String object");                  // Add an element to the ArrayList.
        al.add("A second String object");
        al.set(1, "A different String object");     // Change the element at index zero.

        al.remove(0);                               // Remove the element at index zero.

        String s = al.get(0);                       // Get the element at index zero.

        System.out.println("s = " + s);
     }
}
