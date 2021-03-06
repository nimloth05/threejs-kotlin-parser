@file:JsModule("three")
package ch.viseon.threejs.declarations.loaders

	/**
	* Class for loading [page:AnimationClip AnimationClips] in JSON format. This uses the [page:FileLoader] internally for loading files.
	*/
open external class AnimationLoader(manager: ch.viseon.threejs.declarations.loaders.managers.LoadingManager = definedExternally): ch.viseon.threejs.declarations.loaders.Loader{

	/**
	* [page:String url] — the path or URL to the file. This can also be a [link:https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/Data_URIs Data URI]. [page:Function onLoad] — Will be called when load completes. The argument will be the loaded [page:AnimationClip animation clips]. [page:Function onProgress] — Will be called while load progresses. The argument will be the XMLHttpRequest instance, which contains .[page:Integer total] and .[page:Integer loaded] bytes. [page:Function onError] — Will be called if load errors. Begin loading from url and pass the loaded animation to onLoad.
	*/
	open fun load(url: String = definedExternally, onLoad: dynamic = definedExternally, onProgress: dynamic = definedExternally, onError: dynamic = definedExternally) : dynamic


	/**
	* [page:JSON json] — required Parse the JSON object and return an array of animation clips. Individual clips in the object will be parsed with [page:AnimationClip.parse].
	*/
	open fun parse(json: JSON = definedExternally) : Array<dynamic>
}