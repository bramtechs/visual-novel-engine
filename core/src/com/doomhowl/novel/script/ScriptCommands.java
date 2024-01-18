package com.doomhowl.novel.script;

import com.doomhowl.novel.script.blocks.Subject;

public interface ScriptCommands {
    void speak(Subject subject, String avatar, String dialog);
    void speak(Subject subject, String dialog);
    void speak(String dialog);
}
