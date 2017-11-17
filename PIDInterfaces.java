/**
 * This interface allows for PIDController to automatically read from this object.
 */
public interface PIDSource 
{
  /**
   * Get the result to use in PIDController.
   *
   * @return the result to use in PIDController
   */
  double pidGet();
}

/**
 * This interface allows PIDController to write it's results to its output.
 */
public interface PIDOutput 
{
  /**
   * Set the output to the value calculated by PIDController.
   *
   * @param output the value calculated by PIDController
   */
  void pidWrite(double output);
}
