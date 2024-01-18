package com.doomhowl.novel.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class ScreenStage extends Stage implements Screen {
    @Override
    public void show() {
    }

    @Override
    public void render(float v) {
        this.draw();
    }

    @Override
    public void resize(int w, int h) {
        this.getViewport().update(w, h);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        this.dispose();
    }
}
