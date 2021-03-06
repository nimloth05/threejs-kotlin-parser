@file:JsModule("three")
package ch.viseon.threejs.declarations.animation.tracks

	/**
	* A Track of keyframe values that represent color changes. The very basic implementation of this subclass has nothing special yet. However, this is the place for color space parameterization.
	*/
open external class ColorKeyframeTrack(name: String = definedExternally, times: Array<dynamic> = definedExternally, values: Array<dynamic> = definedExternally): ch.viseon.threejs.declarations.animation.KeyframeTrack{

	/**
	* String 'color'.
	*/
	open var ValueTypeName: String  = definedExternally
}