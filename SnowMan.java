import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SnowMan extends Applet implements ActionListener {
  int x = 350;
  int y = 350;

 
	
  Button leftButton;
  Button rightButton;
  Button upButton;
  Button downButton;
  Button resetButton;

  public void init() {
    // create the buttons
    leftButton = new Button("Move Left");
    rightButton = new Button("Move Right");
    upButton = new Button("Move Up");
    downButton = new Button("Move Down");
    resetButton = new Button("Reset");

    // add the buttons to the applet
    add(leftButton);
    add(rightButton);
    add(upButton);
    add(downButton);
    add(resetButton);


    // add action listeners to the buttons
    leftButton.addActionListener(this);
    rightButton.addActionListener(this);
    upButton.addActionListener(this);
    downButton.addActionListener(this);
    resetButton.addActionListener(this);

    // set the size of the applet window
    setSize(700,700);
  }

  
public void paint (Graphics e)
    {
        

        setBackground(Color.cyan);
        e.setColor (Color.blue);

        e.setColor (Color.yellow);
        e.fillOval (-40, -40, 120, 120);  // sun

        e.setColor (Color.white);
        e.fillOval (x-20, y, 40, 40);      // head
        e.fillOval (x-35, y+35, 70, 50);   // upper torso
        e.fillOval (x-50, y+80, 100, 60);  // lower torso

        e.setColor (Color.black);
        e.fillOval (x-10, y+10, 5, 5);   // left eye
        e.fillOval (x+5, y+10, 5, 5);    // right eye

        e.drawArc (x-10, y+20, 20, 10, 190, 160);   // smile

        e.drawLine (x-25, y+60, x-50, y+40);  // left arm
        e.drawLine (x+25, y+60, x+55, y+60);  // right arm
//
        e.drawLine (x-20, y+5, x+20, y+5);  // brim of hat
        e.fillRect (x-15, y-20, 30, 25);        // y of hat
    }

  public void actionPerformed(ActionEvent e) {
    // move the snowman based on which button was clicked
    if (e.getSource() == leftButton) {
      x-= 100;

    } else if (e.getSource() == rightButton) {
      x+= 100;
    } else if (e.getSource() == upButton) {
      y-= 100;
    } else if (e.getSource() == downButton) {
      y+= 100;
    }else if (e.getSource()==resetButton){
	x=350;
	y=350;
}

repaint();  }
}
/*
    <applet code = "SnowMan" width=700 height=600>
    </applet>
    */