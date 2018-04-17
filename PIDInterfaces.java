/**
 * This interface allows PIDController to read from any implementing object.
 */
public interface PIDSource 
{
  /**
   * Get the source value to use in PIDController.
   *
   * @return the source value to use in PIDController
   */
  double pidGet();
}

/**
 * This interface allows PIDController to write it's results to any implementing object.
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
