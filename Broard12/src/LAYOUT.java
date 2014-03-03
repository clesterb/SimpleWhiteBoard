import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LAYOUT extends Applet {	
public void init() {
	setLayout(new BorderLayout());
	  SimpleWhiteboard Center = new SimpleWhiteboard();
	 SouthPanel sb = new SouthPanel();
	 northPanel np = new northPanel();
	 WestPanel wp = new WestPanel();
	 EastPanel ep = new EastPanel();
	 setLayout(new BorderLayout());
	 add(np, BorderLayout.NORTH);
	add(sb, BorderLayout.SOUTH);
	add(wp, BorderLayout.WEST);
	add(ep, BorderLayout.EAST);
	add(Center, BorderLayout.CENTER);
		
}

}
