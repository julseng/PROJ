modular-media-suite
Refactored media player using structural design patterns

Modular Media Suite
This project shows how different structural design patterns can be used to improve a basic media player and turn it into a modular and easy-to-extend media suite. It uses five structural patterns: Bridge, Composite, Decorator, Proxy, and Adapter.

Structural Patterns Used:

Bridge Pattern: Separates the “what to do” (abstraction) from “how it is done” (implementation)
Composite Pattern: Lets playlists and single media items be treated the same way
Decorator Pattern: Adds extra features (like watermarking) without changing the original class
Proxy Pattern: Improves performance by caching remote media
Adapter Pattern: Allows different or old media sources to work with one common interface
Main Features:

Flexible rendering system with separated logic (Bridge)
Playlist structure that can include other playlists or media files (Composite)
Add-on features such as watermarking at runtime (Decorator)
Automatic caching for remote media (Proxy)
One unified way to use different media sources (Adapter)
What the Demo Shows
The main PlayDemo class provides a live, interactive demonstration that walks you through the key features and design patterns:

Assembling a Playlist: Shows the Composite pattern by building a playlist with both local files and other playlists.
Toggling Features: Interactively enable/disable features like watermarks, subtitles, and an audio equalizer, demonstrating the Decorator pattern.
Switching Renderers: Shows the Bridge pattern by switching from a software to a hardware renderer at runtime.
Caching Remote Media: Demonstrates the Proxy pattern by playing a remote stream twice, showing a cache miss followed by a cache hit.
How to Run the Project

This project uses Apache Maven to manage dependencies and build the source code.

Prerequisites
Java Development Kit (JDK) 11 or higher
Apache Maven
Running the Demo
First, clone the repository and navigate into the project directory:

# 1. Download the project from GitHub
git clone https://github.com/asda121-png/Modular-Media-Streaming-Suite.git

# 2. Move into the newly created project folder
cd Modular-Media-Streaming-Suite
Then, compile and run the interactive demo:

mvn compile exec:java -Dexec.mainClass="demo.PlayDemo"
Running Tests
To run the unit tests, execute the following command from the project's root directory:

mvn test
