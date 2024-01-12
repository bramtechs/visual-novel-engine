package com.doomhowl.novel.script.blocks;

import com.doomhowl.novel.script.assets.AssetBundle;

/**
 * A scene is a standalone, section of your VN. You can use them like chapters, but it is not a requirement.
 * Scenes are constructed with AssetBundles that the engine will load on the scene begin.
 * and unload at the end of the scene.<br/>
 * Split your story into multiple scenes for reduced memory usage as not all assets need to be kept in memory!
 **/
public class Scene {
    private final AssetBundle[] bundles;

    /**
     * Internal name for your scene, stored in saves.
     * Is displayed according to a matching key in a TranslationBundle.
     */
    private final String name;

    public Scene(String name, AssetBundle[] bundles) {
        this.name = name;
        this.bundles = bundles;
    }
}
