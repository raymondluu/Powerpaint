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
 * GridAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class GridAction extends AbstractAction
{
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * Constructs a GridAction Action.
   * 
   * @param the_panel paint panel
   */
  public GridAction(final PaintPanel the_panel)
  {
    super("Grid");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_G);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_event)
  {
    if (my_panel.getGridStatus())
    {
      my_panel.gridSwitch(false);
    }
    else if (!my_panel.getGridStatus())
    {
      my_panel.gridSwitch(true);
    }
    my_panel.repaint();
  }
  
}
