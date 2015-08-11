/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint
 */
package gui;

import actions.ClearAction;
import actions.ColorAction;
import actions.EllipseAction;
import actions.GridAction;
import actions.LineAction;
import actions.PencilAction;
import actions.QuitAction;
import actions.RectangleAction;
import actions.RedoAction;
import actions.Thickness1Action;
import actions.Thickness2Action;
import actions.Thickness4Action;
import actions.Thickness8Action;
import actions.UndoAction;

import java.awt.BorderLayout;

import javax.swing.Action;
import javax.swing.JFrame;

import menubar.MenuBar;

import toolbar.ToolBar;

/**
 * GUI object class.
 * 
 * @author Raymond Luu
 * @version February 19, 2012
 */
public class GUI
{
  
  /**
   * Setup GUI.
   */
  public void setup()
  {
    final MenuBar menus = new MenuBar();
    final PaintPanel paint_panel = new PaintPanel();
    final ToolBar tools = new ToolBar();
    
    final Action[] file_actions = {new UndoAction(paint_panel),
                                   new RedoAction(paint_panel),
                                   new ClearAction(paint_panel)};
    for (Action a : file_actions)
    {
      menus.createFileMenuButtons(a);
    }
    menus.createOptionMenuButtons(new GridAction(paint_panel));
    
    final Action[] thickness_actions = {new Thickness1Action(paint_panel),
                                        new Thickness2Action(paint_panel),
                                        new Thickness4Action(paint_panel),
                                        new Thickness8Action(paint_panel)};
    for (Action a : thickness_actions)
    {
      menus.createThicknessMenuButtons(a);
    }
    
    final Action color_action = new ColorAction(paint_panel, tools);
    menus.createToolsMenuColorButton(color_action);
    tools.createColorToggleButton(color_action);
    
    final Action[] actions = {new PencilAction(paint_panel),
                              new LineAction(paint_panel),
                              new RectangleAction(paint_panel),
                              new EllipseAction(paint_panel)};
    for (Action a : actions)
    {
      menus.createToolsMenuButtons(a);
      tools.createToggleButtons(a);
    }
    
    final JFrame frame = new JFrame("PowerPaint");
    frame.setJMenuBar(menus);
    
    menus.createFileMenuQuitButton(new QuitAction(frame));
    
    frame.add(paint_panel, BorderLayout.CENTER);
    frame.add(tools, BorderLayout.SOUTH);
    
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
}
