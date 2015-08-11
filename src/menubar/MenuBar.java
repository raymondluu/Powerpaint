/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint
 */
package menubar;

import actions.AboutAction;

import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

/**
 * MenuBar object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
@SuppressWarnings("serial")
public class MenuBar extends JMenuBar
{
  
  /**
   * File menu.
   */
  private final JMenu my_file = new JMenu("File");
  
  /**
   * Options menu.
   */
  private final JMenu my_options = new JMenu("Options");
  
  /**
   * Tools menu.
   */
  private final JMenu my_tools = new JMenu("Tools");
  
  /**
   * Help menu.
   */
  private final JMenu my_help = new JMenu("Help");
  
  /**
   * Thickness menu within Options menu.
   */
  private JMenu my_thickness;
  
  /**
   * Group of buttons for Tools menu.
   */
  private final ButtonGroup my_tools_group = new ButtonGroup();
  
  /**
   * Group of buttons for Thickness Menu Item.
   */
  private final ButtonGroup my_thickness_group = new ButtonGroup();
  
  /**
   * Constructs the MenuBar.
   */
  public MenuBar()
  {
    super();
    addMenu();
    setMnemonics();
    createHelpMenuButtons();
  }
  
  /**
   * Private constructor helper method for adding menus.
   */
  private void addMenu()
  {
    add(my_file);
    add(my_options);
    add(my_tools);
    add(my_help);
  }
  
  /**
   * Private constructor helper method to set mnemonics.
   */
  private void setMnemonics()
  {
    my_file.setMnemonic(KeyEvent.VK_F);
    my_options.setMnemonic(KeyEvent.VK_O);
    my_tools.setMnemonic(KeyEvent.VK_T);
    my_help.setMnemonic(KeyEvent.VK_H);
  }
  
  /**
   * Creates File Menu Clear button.
   * 
   * @param the_action the action.
   */
  public void createFileMenuButtons(final Action the_action)
  {
    final JMenuItem button = new JMenuItem(the_action);

    my_file.add(button);
  }
  
  /**
   * Creates File Menu Quit button.
   * 
   * @param the_action action.
   */
  public void createFileMenuQuitButton(final Action the_action)
  {
    final JSeparator separate = new JSeparator();
    final JMenuItem quit_button = new JMenuItem(the_action);
    
    my_file.add(separate);
    my_file.add(quit_button);
  }
  
  /**
   * Creates Option Menu Buttons.
   * 
   * @param the_action the action.
   */
  public void createOptionMenuButtons(final Action the_action)
  {
    my_thickness = new JMenu("Thickness");
    my_thickness.setMnemonic(KeyEvent.VK_T);
    final JCheckBoxMenuItem grid_button = new JCheckBoxMenuItem(the_action);
    
    my_options.add(grid_button);
    my_options.add(my_thickness);
  }
  
  /**
   * Creates Thickness Menu items.
   * 
   * @param the_action the action.
   */
  public void createThicknessMenuButtons(final Action the_action)
  {
    final JRadioButtonMenuItem button = new JRadioButtonMenuItem(the_action);
    
    my_thickness_group.add(button);
    my_thickness.add(button);
  }
  
  /**
   * Creates Tool Menu buttons.
   * 
   * @param the_action action.
   */
  public void createToolsMenuButtons(final Action the_action)
  {
    final JRadioButtonMenuItem button = new JRadioButtonMenuItem(the_action);
    
    my_tools_group.add(button);
    my_tools.add(button);
  }
  
  /**
   * Creates Tool Menu Color button.
   * 
   * @param the_action action.
   */
  public void createToolsMenuColorButton(final Action the_action)
  {
    final JMenuItem color_button = new JMenuItem(the_action);
    final JSeparator separate = new JSeparator();
    
    my_tools.add(color_button);
    my_tools.add(separate);
  }
  
  /**
   * Private constructor helper method to make help menu buttons.
   */
  private void createHelpMenuButtons()
  {
    final JMenuItem about_button = new JMenuItem(new AboutAction());
    
    my_help.add(about_button);
  }
  
}
