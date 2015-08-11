/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint part 1
 */
package actions;

import gui.PaintPanel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * ClearAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class ClearAction extends AbstractAction
{
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a ClearAction Action.
   * 
   * @param the_panel paint panel
   */
  public ClearAction(final PaintPanel the_panel)
  {
    super("Clear");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_panel.clearCollection();
  }
  
}
