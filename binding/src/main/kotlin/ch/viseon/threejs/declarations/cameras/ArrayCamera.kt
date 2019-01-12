//Generated date 12.01.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.cameras

	/**
	* [name] can be used in order to efficiently render a scene with a predefined set of cameras. This is an important performance aspect for rendering VR scenes. An instance of [name] always has an array of sub cameras. It's mandatory to define for each sub camera the **bounds** property which determines the part of the viewport that is rendered with this camera.
	*/
open external class ArrayCamera(array: Array<dynamic>/*Array*/ = definedExternally): ch.viseon.threejs.declarations.cameras.PerspectiveCamera{

	/**
	* An array of cameras.
	*/
	open var cameras: Array<dynamic>/*Array*/  = definedExternally
}