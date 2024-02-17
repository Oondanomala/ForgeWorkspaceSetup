# Forge 1.12.2 Setup

Replace this with your mod's description.


## Short Setup Guide:

If you ended up here, I assume you are already familiar with how to setup basic Forge workspace, so I won't be covering it all in great detail. Only the most important steps, just in case you forgot something:

1. Open up a command line in this folder, and execute `gradlew setupDecompWorkspace`. Once it's done, run `gradlew genIntellijRuns`;
2. Use `gradlew build` whenever you need to build a `.jar` with your mod. It will end up being in `build/libs`.
