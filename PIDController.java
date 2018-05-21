public class PIDController
{
    private PIDSource   source;
    private PIDOutput   output;
    
    public PIDController(PIDSource source, PIDOutput output)
    {
        this.source = source;
        this.output = output;
    }
    
    // This method could be called from another class or performed in
    // a loop in a thread. It's job is to read the source value from
    // the source object, for example an encoder's current counts and calculate
    // an appropriate output value and write that output value to the 
    // output object, for example a motor to change the motors behavior.
    // The key is that this code does care what the source and
    // output objects actually are, it just reads, calculates and writes.
    
    public void calculate()
    {
        double sourceValue;
        double outputValue;
        
        sourceValue = source.pidGet();
        
        outputValue = some calculation or process using sourceValue;
        
        output.pidWrite(outputValue);
    }
}
