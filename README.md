# OpenGL Forcer

A client-side Fabric mod for Minecraft 26.3 that changes the OpenGL context version passed to SDL when Minecraft creates its OpenGL window.

## Build

Use Java 25 and run:

```powershell
.\gradlew.bat build
```

The mod jar is written to `build\libs\openglforcer-x.x.x.jar`.

## Test in Minecraft

Install the jar and Fabric Loader 0.20.1 for Minecraft 26.3. The mod always requests an OpenGL 4.6 context from SDL; no configuration is needed. Restart Minecraft after installing or replacing the jar.

The GPU and driver must support OpenGL 4.6 or context creation can fail. Requesting a 4.6 context does not add support if the driver or hardware lacks it. The override applies to Minecraft's OpenGL backend only.
"# OpenGL-Forcer" 
