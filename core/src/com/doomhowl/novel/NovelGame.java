package com.doomhowl.novel;

import com.badlogic.gdx.Game;
import com.doomhowl.novel.screens.game.GameStage;
import com.doomhowl.novel.script.ScriptCommands;
import com.doomhowl.novel.script.blocks.Subject;
import com.kotcrab.vis.ui.VisUI;

public abstract class NovelGame extends Game implements Runnable, ScriptCommands {

	private GameStage game;

	@Override
	public void create () {
		VisUI.load();
		game = new GameStage();
		setScreen(game);
	}

	@Override
	public void speak(Subject subject, String avatar, String dialog) {

	}

	@Override
	public void speak(Subject subject, String dialog) {

	}

	@Override
	public void speak(String dialog) {

	}
}
