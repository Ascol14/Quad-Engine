package com.quad.states;

import com.quad.core.GameContainer;
import com.quad.core.Input;
import com.quad.core.Renderer;
import com.quad.core.components.State;
import com.quad.core.fx.Image;

public class StateTest extends State {

	private Image image;

	@Override
	public void init(GameContainer gc) {
		// Initiate state
		image = new Image("/images/background.png");
	}

	@Override
	public void update(GameContainer gc, float dt) {
		// Update state
		Input input = gc.getInput();
		// if s
		if (input.isKeyPressed(27)) {
			gc.stop();
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r, float dt) {
		// Render state
		r.drawFillRect(0, 0, 100, 100, 0xffff00, null);

		if (image != null) {
            r.drawImage(image, 0, 0);
			r.drawImage(image, 0, 0, 1920, 1080);
        } else {
            System.out.println("Image not loaded");
        }
	}

	@Override
	public void dipose() {
		// Dispose state

	}

}