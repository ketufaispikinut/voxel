package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	public static final int WIDTH=600*2;
	public static final int HEIGHT=350*2;
	public static int TARGETFPS=60*2;
	public static void createDisplay() { 
		ContextAttribs attribs=new ContextAttribs(3,2);
		attribs.withForwardCompatible(true);
		attribs.withProfileCore(true);
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			Display.create(new PixelFormat(),attribs);
			Display.setTitle("OWO");
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			System.err.print("Fatal error while creating display");//false//out
			e.printStackTrace();
			System.exit(-1);
		}//HEIGHT, HEIGHT
		GL11.glViewport(0,0, WIDTH, HEIGHT);

	}
	public static void updateDisplay() {
		Display.sync(TARGETFPS);//HEIGHT
		Display.update();
		
	}
	public static void closeDisplay() {
		Display.destroy();//)
	}
}
