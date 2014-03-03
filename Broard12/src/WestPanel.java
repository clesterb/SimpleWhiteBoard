import java.awt.*;
import java.awt.event.*;


public class WestPanel extends Panel implements ActionListener{
WestPanel (){
	setLayout(new GridLayout(12,12));
	
	Button gray = new Button("gray");
    gray.setBackground(Color.gray);
    gray.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="gray"){
        	SimpleWhiteboard.setpencolor(Color.gray);
        	
        }
        
    }

});
    Button blue = new Button("blue");
	blue.setBackground(Color.blue);
	//blue.addActionListener(this);
    blue.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand()=="blue"){
                	SimpleWhiteboard.setpencolor(Color.blue);
                }
                
            }

        });
	Button black = new Button("black");
	black.setBackground(Color.black);
	//black.addActionListener(this);
	black.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="black"){
	        	SimpleWhiteboard.setpencolor(Color.black);
	        }
	        
	    }

	});
	Button orange = new Button("orange");
	orange.setBackground(Color.orange);
	//orange.addActionListener(this);
	orange.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="orange"){
	        	SimpleWhiteboard.setpencolor(Color.orange);
	        }
	        
	    }

	});
	Button pink = new Button("pink");
	pink.setBackground(Color.pink);
	pink.setBackground(Color.pink);
	//pink.addActionListener(this);
	pink.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="pink"){
	        	SimpleWhiteboard.setpencolor(Color.pink);
	        }
	        
	    }

	});
	Button red = new Button("red");
	red.setBackground(Color.red);
	//red.addActionListener(this);
	red.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="red"){
	        	SimpleWhiteboard.setpencolor(Color.red);
	        }
	        
	    }

	});
	Button yellow = new Button("yellow");
	yellow.setBackground(Color.yellow);
	//yellow.addActionListener(this);
	yellow.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="yellow"){
	        	SimpleWhiteboard.setpencolor(Color.yellow);
	        }
	        
	    }

	});
	Button green = new Button("green");
	green.setBackground(Color.green);
	//green.addActionListener(this);
	green.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="green"){
	        	SimpleWhiteboard.setpencolor(Color.green);
	        }
	        
	    }

	});
	
	Button cyan = new Button("cyan");
	cyan.setBackground(Color.cyan);
		//cyan.addActionListener(this);
	cyan.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="cyan"){
	        	SimpleWhiteboard.setpencolor(Color.cyan);
	        }
	        
	    }

	});
	
	Button magenta = new Button("magenta");
	magenta.setBackground(Color.magenta);
	//magenta.addActionListener(this);
	magenta.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        if (e.getActionCommand()=="magenta"){
	        	SimpleWhiteboard.setpencolor(Color.magenta);
	        }
	        
	    }

	});

	add(cyan);
	add(green);
	add(yellow);
	add(red);
	add(gray);
	add(blue);
	add(black);
	add(orange);
	add(pink);
	add(magenta);
	
}

	
}

