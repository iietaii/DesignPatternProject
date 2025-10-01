# DesignPatternProject - Space Invaders Java GUI

This is a refactored version of a classic Space Invaders game implemented in Java with a GUI.  
The project demonstrates the use of **Creational Design Patterns** to improve object creation, maintainability, and performance.

## Design Patterns Applied

### 1. Factory Pattern
- Implemented using AlienFactory and BombFactory.
- Centralizes object creation instead of using new directly in the game logic.

### 2. Prototype Pattern
- Applied to Alien and Bomb classes.
- Enables cloning of existing objects instead of creating new instances from scratch.

### 3. Singleton Pattern
- Applied to ScoreManager.
- Ensures a single instance manages the game score consistently.
