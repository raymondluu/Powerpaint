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

import tools.EllipseTool;
import tools.Tools;

/**
 * EllipseAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class EllipseAction extends AbstractAction
{
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a EllipseAction Action.
   * @param the_panel paint panel.
   */
  public EllipseAction(final PaintPanel the_panel)
  {
    super("Ellipse", new ImageIcon("ellipse_bw.gif"));
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_E);
    putValue(Action.SELECTED_KEY, true);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    final Tools t = new EllipseTool();
    my_panel.changeTool(t);
  }
  
}
