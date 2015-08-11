/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint
 */
package gui;
/**
 * Main class for GUI.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public final class Main
{
  
  /**
   * Private Constructor.
   */
  private Main()
  {
    //do nothing
  }
  /**
   * @param the_args the argument.
   */
  public static void main(final String[] the_args)
  {
    new GUI().setup();
  }

}
