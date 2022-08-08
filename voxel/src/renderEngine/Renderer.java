package renderEngine;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class Renderer {
	/*public void prepare() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glClearColor(1+-1+(float)Math.random(), (float)Math.random(), 0+(float)Math.random(), 0);//0xFFEEDD//0//0
		GL30.glBindVertexArray(GL30.glGenVertexArrays());
	}//1//0
	public void render(RawModel model) {
	//	System.out.println("rendering stuff");
		GL30.glBindVertexArray(model.vaoID);
		GL20.glEnableVertexAttribArray(0);
	//	GL11.glColor3f(0f, 1f, 0);//r//0//2
		
		//GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, model.vertexCount);//0
		GL11.glDrawElements(GL11.GL_TRIANGLES, model.vertexCount,GL11.GL_UNSIGNED_INT,0);
		GL20.glDisableVertexAttribArray(0);//0//null
		GL30.glBindVertexArray(0);
	}*/public void prepare(){
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		GL11.glClearColor(1, 0, 0, 1);
	}
	
	public void render(RawModel model){
		GL30.glBindVertexArray(model.vaoID);//getVaoID()//getVertexCount()
		GL20.glEnableVertexAttribArray(0);
		GL11.glDrawElements(GL11.GL_TRIANGLES, model.vertexCount, GL11.GL_UNSIGNED_INT, 0);
		GL20.glDisableVertexAttribArray(0);
		GL30.glBindVertexArray(0);
	}
	
}
