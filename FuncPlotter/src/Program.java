import java.awt.Color;

import graphics.Canvas;

public class Program {
    // Canvas GUI instance providing the drawing area on which to plot the functions
    private static Canvas canvas;

    public static void main(String[] args) {
        
        // Create the canvas instance, set its range to x:[-360, 360] and y:[-240, 240] then 
        // open it on the screen. Use canvas.plot(pX, pY) to plot a point at the (pX, pY) coords
        canvas = new Canvas();
        canvas.setRange(-360, -240, 360, 240);
        canvas.open();

        // Draw a short red diagonal on the canvas
        canvas.pause();
        canvas.setColor(Color.red);
        GetY Y = (x) ->
        { return (int) (200 * Math.sin(Math.PI * x/180));
        };
        plotFunction(Y);	

        // Pause and close the canvas then terminate the program.
        canvas.pause();
        canvas.close();
    }
    
    public static void plotFunction(GetY function) {
    	 for (int i = -360; i < 360; i++) {
             canvas.plot(i, function.calcY(i));
         }
    }
}
