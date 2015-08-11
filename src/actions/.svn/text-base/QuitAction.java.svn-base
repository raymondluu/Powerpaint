/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint part 1
 */
package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;

/**
 * QuitAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class QuitAction extends AbstractAction
{
  
  /**
   * The JFrame.
   */
  private final JFrame my_frame;
  
  /**
   * Constructs a QuitAction Action.
   * 
   * @param the_frame frame.
   */
  public QuitAction(final JFrame the_frame)
  {
    super("Quit");
    my_frame = the_frame;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_Q);
    putValue(Action.SELECTED_KEY, true);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_frame.dispose();
  }
  
}
