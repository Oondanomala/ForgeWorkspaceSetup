# Forge Workspace Setup: 1.12.2

Empty setup for forge.

## Setup:

1. Open up a command line in this folder, and execute `gradlew setupDecompWorkspace`. Once it's done, run `gradlew genIntellijRuns`;
2. Use `gradlew build` whenever you need to build a `.jar` with your mod. It will end up being in `build/libs` directory within your mod-specific workspace folder.
