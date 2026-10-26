package dev.alika.openglforcer.mixin;

import org.lwjgl.sdl.SDLVideo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
@Mixin(targets = "com.mojang.renderpearl.backend.opengl.GlBackend")
abstract class OpenGLBackendMixin {
	@ModifyArgs(
		method = "createWindow",
		at = @At(
			value = "INVOKE",
			target = "Lorg/lwjgl/sdl/SDLVideo;SDL_GL_SetAttribute(II)Z"
		)
	)
	private void openglforcer$overrideContextVersion(Args args) {
		int attribute = args.get(0);
		if (attribute == SDLVideo.SDL_GL_CONTEXT_MAJOR_VERSION) {
			args.set(1, 4);
		} else if (attribute == SDLVideo.SDL_GL_CONTEXT_MINOR_VERSION) {
			args.set(1, 6);
		}
	}
}
