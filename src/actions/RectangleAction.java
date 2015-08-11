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
import javax.swing.ImageIcon;

import tools.RectangleTool;
import tools.Tools;

/**
 * RectangleAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class RectangleAction extends AbstractAction
{
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a RectangleAction Action.
   * @param the_panel paint panel.
   */
  public RectangleAction(final PaintPanel the_panel)
  {
    super("Rectangle", new ImageIcon("rectangle_bw.gif"));
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
    putValue(Action.SELECTED_KEY, true);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    final Tools t = new RectangleTool();
    my_panel.changeTool(t);
  }
  
}
