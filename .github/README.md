# Forge Workspace Setup: Empty 1.12.2

Empty setup for Forge-based mod development workspace, without any code.

## Building Features:

- Gradle wrapper 4.10.2 is used by default;
- Custom ForgeGradle 2.3 fork is used ([this one](https://github.com/anatawa12/ForgeGradle-2.3)). Though ForgeGradle 3.+ does partially support 1.12.2 projects already, it does not have `GradleStart` wrapper, which in 1.12.2 and below is relied upon for discovering coremods on the classpath. Without it coremods and tweakers are effectively unable to load in development environment, which is a critical issue for a lot of projects;
- Enforced UTF-8 encoding for all files;

## Short Setup Guide:

If you ended up here, I assume you are already familiar with how to setup a basic Forge workspace, so I won't be covering it all in great detail. Only the most important steps, just in case you forgot something:

1. Ensure you have JDK 8 installed (not just JRE), and `JAVA_HOME` environment variable is set in your system, pointing to that JDK;
2. Download the template from the [releases tab](https://github.com/Oondanomala/ForgeWorkspaceSetup/releases/latest/download/TemplateEmpty.zip), create a folder for your mod-specific workspace and unpack those contents into that folder;
3. Open up a command line in that folder, and execute `gradlew setupDecompWorkspace`. Once it's done, run `gradlew genIntellijRuns`;
4. Put your code in `src/main/java`, and your assets in `src/main/resources`;
5. Use `gradlew build` whenever you need to build a `.jar` with your mod. It will end up being in `build/libs` directory within your mod-specific workspace folder.
