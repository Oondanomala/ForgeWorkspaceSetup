# Forge Workspace Setup: Standalone 1.12.2

Basic setup for Forge-based mod development workspace. Essentially serves as ennobled version of last official setup provided by Forge itself (can be found [here](https://maven.minecraftforge.net/net/minecraftforge/forge/1.12.2-14.23.5.2855/forge-1.12.2-14.23.5.2855-mdk.zip)). Has a couple features that original setup does not:

## Building Features:

- Gradle wrapper 4.10.2 is used by default;
- Custom ForgeGradle 2.3 fork is used ([this one](https://github.com/anatawa12/ForgeGradle-2.3)). Though ForgeGradle 3.+ does partially support 1.12.2 projects already, it does not have `GradleStart` wrapper, which in 1.12.2 and below is relied upon for discovering coremods on the classpath. Without it coremods and tweakers are effectively unable to load in development environment, which is a critical issue for a lot of projects;
- Enforced UTF-8 encoding for all files;
- All data in `mcmod.info` file is filled when actually building a mod. This illustrates both how to inflate text files upon building and how to use `gradle.properties` file for declaring custom properties used by `build.gradle`;

## Short Setup Guide:

If you ended up here, I assume you are already familiar with how to setup a basic Forge workspace, so I won't be covering it all in great detail. Only the most important steps, just in case you forgot something:

1. Ensure you have JDK 8 installed (not just JRE), and `JAVA_HOME` environment variable is set in your system, pointing to that JDK;
2. Download the template from the [releases tab](https://github.com/Oondanomala/ForgeWorkspaceSetup/releases/latest/download/Template.zip), create a folder for your mod-specific workspace and unpack those contents into that folder;
3. Open up a command line in that folder, and execute `gradlew setupDecompWorkspace`. Once it's done, run `gradlew genIntellijRuns`;
4. Use `gradlew build` whenever you need to build a `.jar` with your mod. It will end up being in `build/libs` directory within your mod-specific workspace folder.
