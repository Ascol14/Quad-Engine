package com.quad.states;

import java.io.File;

import com.quad.core.GameContainer;
import com.quad.core.Input;
import com.quad.core.Renderer;
import com.quad.core.components.State;
import com.quad.core.fx.Image;
import com.quad.entity.Animation;

public class CinematicStart extends State {

	int imageIndex = 0;

	Animation back = new Animation();

	@Override
	public void init(GameContainer gc) {
		Image[] images = new Image[250];
		// Initiate state
		System.out.println("Load Cinematic");

		for (int i = 0; i < images.length; i++) {
			String imagePath = "/cinematics/one/" + String.format("%04d", i + 1) + ".png";
			images[i] = new Image(imagePath);
		}

		back.setFrames(images);
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
		r.drawImage(back.getImage(), 0, 0, 1920, 1080);
		back.update();
	}

	@Override
	public void dipose() {
		// Dispose state

	}

}