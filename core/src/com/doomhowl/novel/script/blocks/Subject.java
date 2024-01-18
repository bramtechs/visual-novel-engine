package com.doomhowl.novel.script.blocks;

import com.badlogic.gdx.graphics.Color;

/**
 * Speaking object/character in your novel.
 */
public class Subject {

    /**
     * Internal name of the character.
     * Translated according to TranslationBundle, if not found fallbacks to this name.
     */
    private String name;

    private Color color;

    /**
     * @param name Internal name of the character.
     */
    public Subject(String name) {
        this.name = name;
    }

    /**
     * @param name Internal name of the character.
     */
    public Subject(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
