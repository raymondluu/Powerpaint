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
 * ThicknessAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class Thickness1Action extends AbstractAction
{
  
  /**
   * Constant for thickness 1.
   */
  private static final int THICKNESS_1 = 1;
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a ThicknessAction Action.
   * 
   * @param the_panel panel.
   */
  public Thickness1Action(final PaintPanel the_panel)
  {
    super("1");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_1);
    putValue(Action.SELECTED_KEY, true);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_panel.changeThickness(THICKNESS_1);
  }
  
}
