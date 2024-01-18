package com.doomhowl.novel.screens.game;

import com.badlogic.gdx.utils.Align;
import com.doomhowl.novel.screens.ScreenStage;
import com.kotcrab.vis.ui.widget.VisLabel;

public class GameStage extends ScreenStage {
    public GameStage() {
        VisLabel lbl = new VisLabel();
        lbl.setFillParent(true);
        lbl.setText("Hello world!");
        lbl.setAlignment(Align.center, Align.center);
        addActor(lbl);
    }
}
