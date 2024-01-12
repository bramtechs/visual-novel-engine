package com.doomhowl.novel.script.blocks;

public class Speak {

    private final Subject subject;
    private final String dialog;

    /**
     * Makes specified subject speak.
     * @param subject   Who should speak.
     * @param dialog    Dialog text in primary language. (or the script would be unreadable if its just keys)
     */
    public Speak(Subject subject, String dialog) {
        this.subject = subject;
        this.dialog = dialog;
    }

    /**
     * Makes the narrator speak.
     * @param dialog Dialog text in primary language. (or the script would be unreadable if its just keys)
     */
    public Speak(String dialog) {
        this.subject = null;
        this.dialog = dialog;
    }
}
