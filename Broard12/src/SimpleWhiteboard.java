import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class SimpleWhiteboard extends Panel{
  protected int lastX=0, lastY=0;
  private static Color pencolor;
  
 
  
  public SimpleWhiteboard() {
    setBackground(Color.white);
    addMouseListener(new PositionRecorder());
    addMouseMotionListener(new LineDrawer());
    
  }

  protected void record(int x, int y) {
    lastX = x;
    lastY = y;
    
  }

  // Record position that mouse entered window or
  // where user pressed mouse button.

  private class PositionRecorder extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent event) {
      requestFocus(); // Plan ahead for typing
      record(event.getX(), event.getY());
    }

    @Override
    public void mousePressed(MouseEvent event) {
      record(event.getX(), event.getY());
    }
  }

  // As user drags mouse, connect subsequent positions
  // with short line segments.

  private class LineDrawer extends MouseMotionAdapter {
    @Override
    public void mouseDragged(MouseEvent event) {
      int x = event.getX();
      int y = event.getY();
      Graphics g = getGraphics();
      g.setColor(pencolor);
      g.drawLine(lastX, lastY, x, y);
      record(x, y);
} 
}
  public static void setpencolor(Color c){
	  pencolor =c;  
  }
 
}

	