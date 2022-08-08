package voxel;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;
import shaders.StaticShader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Callback debugProc=GLUtil.setup
		//System.out.println("OUTPUT");
		//System.err.println("obvious error");
		/*DisplayManager.createDisplay();
		
		Loader loader=new Loader();
		Renderer renderer=new Renderer();
		StaticShader shader=new StaticShader();
		float[] vertices = {
			    -0.5f, 0.5f, 0f,
			    -0.5f, -0.5f, 0f,
			    0.5f, -0.5f, 0f,
			    0.5f, 0.5f, 0f,
			   // -0.5f, 0.5f, 0f

		};//
		//String msg = GLDebugMessageCallback.getMessage(length, message);
	   // 0.5f, -0.5f, 0f,
	    int[] indices= {
	    	0,1,3,
	    	3,1,2,
	    };
		RawModel model=loader.loadToVAO(vertices,indices);
		//System.out.println("MUDA!");
		while(true&&!Display.isCloseRequested()) {
			renderer.prepare();
			shader.start();
			renderer.render(model);
			shader.stop();
			DisplayManager.updateDisplay();
			//System.out.println("FREEZE!");
		}
	//	System.out.println("OWO!");
		shader.cleanUp();
		loader.cleanUp();
		
		DisplayManager.closeDisplay();
		*/

		DisplayManager.createDisplay();
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		StaticShader shader = new StaticShader();
		
		float[] vertices = {			
				-0.5f,0.5f,0,	//V0
				-0.5f,-0.5f,0,	//V1
				0.5f,-0.5f,0,	//V2
				0.5f,0.5f,0		//V3
		};
		
		int[] indices = {
				0,1,3,	//Top left triangle (V0,V1,V3)
				3,1,2	//Bottom right triangle (V3,V1,V2)
		};
		
		RawModel model = loader.loadToVAO(vertices,indices);
		
		while(!Display.isCloseRequested()){
			//game logic
			renderer.prepare();
			shader.start();
			renderer.render(model);
			shader.stop();
			DisplayManager.updateDisplay();			
		}

		shader.cleanUp();
		loader.cleanUp();
		DisplayManager.closeDisplay();
	}

}
