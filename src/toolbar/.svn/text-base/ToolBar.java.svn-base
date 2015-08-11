/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint
 */
package toolbar;

import java.awt.Color;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 * ToolBar object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
@SuppressWarnings("serial")
public class ToolBar extends JToolBar
{
  
  /**
   * Color button.
   */
  private JButton my_color_button;
  
  /**
   * Group of buttons for ToolBar.
   */
  private final ButtonGroup my_group = new ButtonGroup();
  
  // my constructor does nothing so it isn't included to suppress the warning.
//  /**
//   * Constructs the ToolBar.
//   */
//  public ToolBar()
//  {
//    super();
//  }
  
  /**
   * Creates Color Toggle button.
   * 
   * @param the_action action.
   */
  public void createColorToggleButton(final Action the_action)
  {
    my_color_button = new JButton(the_action);
    my_color_button.setBackground(Color.BLACK);
    
    add(my_color_button);
  }
  
  /**
   * Creates Toggle Buttons.
   * 
   * @param the_action action.
   */
  public void createToggleButtons(final Action the_action)
  {
    final JToggleButton button = new JToggleButton(the_action);
    
    my_group.add(button);
    add(button);
  }
  
  /**
   * Changes button color.
   * 
   * @param the_color color.
   */
  public void changeButtonColor(final Color the_color)
  {
    my_color_button.setBackground(the_color);
  }
}
