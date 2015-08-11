package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 * AboutAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class AboutAction extends AbstractAction
{
  
  /**
   * Constant for About string.
   */
  private static final String ABOUT = "About";
  
  /**
   * Constructs a AboutAction Action.
   */
  public AboutAction()
  {
    super(ABOUT);
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    JOptionPane.showMessageDialog(null,
                                  "TCSS 305 PowerPaint, Winter 2012",
                                  ABOUT,
                                  JOptionPane.INFORMATION_MESSAGE);
  }
  
}
