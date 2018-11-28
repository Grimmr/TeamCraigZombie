package com.craig.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.craig.game.state.State;

public class CraigGame extends Game {
	public SpriteBatch Batch;

	@Override
	public void create () {
		Batch = new SpriteBatch();
		setScreen(new State(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
		Batch.dispose();
	}
}
