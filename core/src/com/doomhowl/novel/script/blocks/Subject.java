package com.doomhowl.novel.script.blocks;

/**
 * Speaking object/character in your novel.
 */
public class Subject {

    /**
     * Internal name of the character.
     * Translated according to TranslationBundle, if not found fallbacks to this name.
     */
    final String name;

    /**
     * @param name Internal name of the character.
     */
    public Subject(String name) {
        this.name = name;
    }
}
