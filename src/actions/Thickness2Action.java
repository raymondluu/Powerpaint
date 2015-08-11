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
public class Thickness2Action extends AbstractAction
{
  
  /**
   * Constant for thickness 2.
   */
  private static final int THICKNESS_2 = 2;
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a ThicknessAction Action.
   * 
   * @param the_panel panel.
   */
  public Thickness2Action(final PaintPanel the_panel)
  {
    super("2");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_2);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    my_panel.changeThickness(THICKNESS_2);
  }
  
}
