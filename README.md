# Yerzhan Aitimov. SE-2526. Assignment 1 - Software Design Patterns.

PC Configurator - Builder patterns.

**What is this?**

This project is a Java implementation of the Builder Design Pattern. It shows how a complex PC configuration can be created step by step with different hardware specifications.
The project has two different builders for two common types of computers: Gaming PCs and Office PCs. Each builder allows us to create a PC with hardware that fits its specific purpose.

**How to build **

```mvn clean compile```

**How to run**

```mvn exec:java -Dexec.mainClass="Main"```

**Project structure**

+ PCBuild - The final PC configuration with all selected components.

+ AbstractPCBuilder – The base builder class that contains common methods for setting PC component s.

+ GamingPCBuilder – A builder for gaming PCs. It requires a dedicated GPU, at least 16GB of RAM, and enough PSU power.

+ OfficePCBuilder – A builder for office PCs. It uses air cooling and has smaller default specifications.

+ PCDirector – A class that helps create standard PC configurations using the builders.

+ Main – Shows how to build both types of PCs using the director and directly with the builder. It also demonstrates how errors are handled.

**Key features**
+ Fluent builder interface that makes it easy to customize the PC.
+ Director class for creating ready-made PC configurations.
+ Different validation rules for gaming and office PCs.
+ Clear error messages when something is configured incorrectly.
