/*
 * Raymond Luu
 * TCSS 305 - Winter 2012
 * Assignment 4 - PowerPaint
 */
package tools;

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

/**
 * Abstract Tools Class.
 * 
 * @author Raymond Luu
 * @version February 23, 2012
 */
public abstract class AbstractTools implements Tools
{
  
  /**
   * Constant for Pencil String.
   */
  private static final String PENCIL = "Pencil";
  
  /**
   * Constant for Line String.
   */
  private static final String LINE = "Line";
  
  /**
   * Constant for Rectangle String.
   */
  private static final String RECTANGLE = "Rectangle";
  
  /**
   * Constant for Ellipse String.
   */
  private static final String ELLIPSE = "Ellipse";
  
  /**
   * Start point.
   */
  private Point my_start;
  
  /**
   * End point.
   */
  private Point my_end;
  
  /**
   * Color.
   */
  private Color my_color;
  
  /**
   * Thickness.
   */
  private int my_thickness;
  
  /**
   * Shape.
   */
  private Shape my_shape;
  
  /**
   * Shape string.
   */
  private final String my_shape_string;
  
  /**
   * Constructs a shape.
   * 
   * @param the_shape_string string of the shape.
   */
  public AbstractTools(final String the_shape_string)
  {
    my_shape_string = the_shape_string;
    my_start = new Point();
    my_end = new Point();
    my_color = Color.BLACK;
    my_thickness = 1;
  }
  
  /**
   * Returns the shape.
   * 
   * @return the shape.
   */
  public Shape getShape()
  {
    return my_shape;
  }
  
  /**
   * Returns the shapes string.
   * 
   * @return the string.
   */
  public String getShapeString()
  {
    return my_shape_string;
  }
  
  /**
   * Returns the color.
   * 
   * @return color.
   */
  public Color getColor()
  {
    return my_color;
  }
  
  /**
   * Returns the thickness.
   * 
   * @return integer thickness.
   */
  public int getThickness()
  {
    return my_thickness;
  }
  
  /**
   * Sets start point.
   * 
   * @param the_point a point.
   */
  public void setStartPoint(final Point the_point)
  {
    my_start = the_point;
  }
  
  /**
   * Sets end point.
   * 
   * @param the_point a point.
   */
  public void setEndPoint(final Point the_point)
  {
    my_end = the_point;
  }
  
  /**
   * Sets the shape.
   */
  public void setShape()
  {
    if (LINE.equals(my_shape_string))
    {
      my_shape = new Line2D.Double(my_start, my_end);
    }
    else if (RECTANGLE.equals(my_shape_string))
    {
      final RectangularShape r = new Rectangle2D.Double();
      r.setFrameFromDiagonal(my_start, my_end);
      my_shape = r;
    }
    else if (ELLIPSE.equals(my_shape_string))
    {
      final RectangularShape e = new Ellipse2D.Double();
      e.setFrameFromDiagonal(my_start, my_end);
      my_shape = e;
    }
    else if (PENCIL.equals(my_shape_string))
    {
      my_shape = new GeneralPath();
    }
  }
  
  /**
   * Sets the color.
   * 
   * @param the_color color.
   */
  public void setColor(final Color the_color)
  {
    my_color = the_color;
  }
  
  /**
   * Sets the thickness.
   * 
   * @param the_thickness thickness.
   */
  public void setThickness(final int the_thickness)
  {
    my_thickness = the_thickness;
  }
  
  /**
   * Returns next tool.
   * 
   * @return next tool.
   */
  public Tools nextTool()
  {
    Tools t = null;
    final String s = my_shape_string;
    if (PENCIL.equals(s))
    {
      t = new PencilTool();
    }
    else if (LINE.equals(s))
    {
      t = new LineTool();
    }
    else if (RECTANGLE.equals(s))
    {
      t = new RectangleTool();
    }
    else if (ELLIPSE.equals(s))
    {
      t = new EllipseTool();
    }
    return t;
  }
  
}
