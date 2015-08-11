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
 * RedoAction object class.
 * 
 * @author Raymond Luu
 * @version February 25, 2012
 */
public class RedoAction extends AbstractAction
{
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a UndoAction Action.
   * 
   * @param the_panel paint panel
   */
  public RedoAction(final PaintPanel the_panel)
  {
    super("Redo");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_panel.redo();
    my_panel.repaint();
  }
}
