# Visual Novel Engine

A work-in-progress visual novel engine proof-of-concept, vaguely inspired by RenPy.

Based on LibGDX.

## Run example
```console
./gradlew example-story:run
```

## Desired syntax

```java
class MyExampleStory implements Runnable {

    Subject sFloof = new Subject("floof", Color.RED);
    Subject sFlan = new Subject("flan", Color.PURPLE);
    
    @Override
    public void run() {
        openScene("example_scene", this::exampleScene, Assets.CORE, Assets.FOREST);
    }

    void exampleScene() {
        enter(sFloof);
        
        speak(sFloof, MyAssets.FLOOF_HAPPY, "Hello, I am Floof and I like mushrooms!");

        enter(sFlan);
        speak(sFlan, MyAssets.FLAN_EXCITED, "Did you say you like mushrooms! [pause=3] I am Flan and I also like mushrooms!");
        
        speak(sFloof, MyAssets.FLOOF_HAPPY, "Lets be friends and start the [wavy]Mushroom Association![/wavy]");

        speak(sFlan, MyAssets.FLAN_FOCUSED, "Thats a great idea! I will start filling the paperwork right away.");
        
        leave(sFloof);
        leave(sFlan);
        
        speak("They got right to work and soon they represented all the mushrooms of the forest.");
    }
}
```