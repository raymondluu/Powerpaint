package actions;

import gui.PaintPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JColorChooser;

import toolbar.ToolBar;

/**
 * ColorAction object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class ColorAction extends AbstractAction
{
  
  /**
   * The paint panel.
   */
  private final PaintPanel my_panel;
  
  /**
   * The tool bar.
   */
  private final ToolBar my_tool_bar;
  
  /**
   * Constructs a ColorAction Action.
   * 
   * @param the_panel panel.
   * @param the_tool_bar tool bar.
   */
  public ColorAction(final PaintPanel the_panel, final ToolBar the_tool_bar)
  {
    super("Color...");
    my_panel = the_panel;
    my_tool_bar = the_tool_bar;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void actionPerformed(final ActionEvent the_action)
  {
    final Color color = JColorChooser.showDialog(null, "PowerPaint Color Chooser", null);
    
    if (color != null)
    {
      my_panel.changeColor(color);
      my_tool_bar.changeButtonColor(color);
    }
    putValue(Action.SELECTED_KEY, false);
  }
  
}
