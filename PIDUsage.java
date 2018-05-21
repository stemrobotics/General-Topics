public class PIDExample
{
    public static void main(String args[])
    {
        MySourceClass in = new MySourceClass();
        MyOutputClass out = new MyOutputClass();
        
        Encoder       enc = new Encoder();
        Motor         motor = new Motor();
        
        // Create a MyPidController object using my custom source
        // and output classes.
        
        MyPIDController controller = new MyPidController(in, out);
        
        controller.calculate();
        
        // Create another MyPidController object using regular 
        // encoder and motor classes from the FIRST library.
        
        MyPIDController controller1 = new MyPidController(enc, motor);
        
        controller1.calculate();
    }
}
