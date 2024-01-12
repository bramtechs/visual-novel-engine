# Visual Novel Engine

A work-in-progress visual novel engine proof-of-concept, vaguely inspired by RenPy.

Based on LibGDX.

## Desired syntax

```java
class MyExampleStory implements Runnable {

    Subject sFloof = new Subject("floof", Color.Red);
    Subject sFlan = new Subject("flan", Color.Purple);
    
    @Override
    public void run() {
        Scene("example_scene", this::exampleScene, Assets.CORE, Assets.FOREST);
    }

    void exampleScene() {
        Enter(sFloof);
        
        Speak(sFloof, MyAssets.FLOOF_HAPPY, "Hello, I am Floof and I like mushrooms!");

        Enter(sFlan);
        Speak(sFlan, MyAssets.FLAN_EXCITED, "Did you say you like mushrooms! [pause=3] I am Flan and I also like mushrooms!");
        
        Speak(sFloof, MyAssets.FLOOF_HAPPY, "Lets be friends and start the [wavy]Mushroom Association![/wavy]");

        Speak(sFlan, MyAssets.FLAN_FOCUSED, "Thats a great idea! I will start filling the paperwork right away.");
        
        Leave(sFloof);
        Leave(sFlan);
        
        Speak("They got right to work and soon they represented all the mushrooms of the forest.");
    }
}
```