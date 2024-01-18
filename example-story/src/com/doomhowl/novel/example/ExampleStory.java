package com.doomhowl.novel.example;

import com.badlogic.gdx.graphics.Color;
import com.doomhowl.novel.DesktopLauncher;
import com.doomhowl.novel.NovelGame;
import com.doomhowl.novel.script.blocks.Subject;

public class ExampleStory extends NovelGame {
    Subject sFloof = new Subject("floof", Color.RED);
    Subject sFlan = new Subject("flan", Color.PURPLE);

    @Override
    public void run() {
        speak(sFloof, "MyAssets.FLOOF_HAPPY", "Hello, I am Floof and I like mushrooms!");
    }

    @Override
    public void speak(Subject subject, String dialog) {

    }

    @Override
    public void speak(String dialog) {

    }

    // start with gradle on MacOS!
    public static void main(String[] args) {
        DesktopLauncher.startDesktopEngine(new ExampleStory());
    }
}