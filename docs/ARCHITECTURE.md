Architecture Overview
The architecture of the Modular Media Suite is designed to be flexible and extensible, primarily through the use of several structural design patterns.

Core Goals:
Normalize Media Sources (Adapter): To treat various media sources like local files or HLS streams uniformly.
Switchable Rendering (Bridge): To allow runtime switching between different rendering strategies (e.g., software and hardware) without affecting the player.
Dynamic Features (Decorator): To add features like watermarks or subtitles on-the-fly.
Nested Playlists (Composite): To create playlists that can contain both individual media items and other playlists.
Efficient Remote Playback (Proxy): To cache remote media streams for better performance.
Simplified Interface: To provide a clean and simple MediaPlayer class for clients to use.
Main Packages and Components:
modular_media.core: This is the heart of the application.

core.player: Contains the MediaPlayer, which is the main entry point for clients and part of the Bridge pattern's abstraction.
core.playlist: Contains the Playlist class, which is a Composite that can hold a collection of MediaSource objects.
modular_media.sources: This package defines the different types of media.

sources.base: The MediaSource interface is the component for the Composite pattern.
sources.local_file, sources.hls_stream, sources.remote_api: These are the "leaf" components, representing concrete media sources.
modular_media.adapters:

MediaSourceAdapter: The Adapter class for making incompatible media sources compatible with the MediaSource interface.
modular_media.renderers: This package contains the implementation side of the Bridge pattern.

RenderImplementation: The interface for the rendering logic.
renderers.software and renderers.hardware: Concrete rendering strategies.
modular_media.plugins: This is where the Decorator pattern is implemented.

plugins.base: MediaDecorator is the abstract base class for decorators.
plugins.watermark, plugins.subtitle_renderer, plugins.audio_equalizer: Concrete decorators that add functionality to MediaSource objects.
modular_media.proxy:

RemoteCacheProxy: A Proxy that adds caching to a MediaSource.
demo:

PlayDemo: Demonstrates how all the components and patterns work together.
