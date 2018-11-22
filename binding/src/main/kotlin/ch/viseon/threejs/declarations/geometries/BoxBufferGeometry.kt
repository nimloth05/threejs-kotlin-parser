//Generated date 22.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* This is the [page:BufferGeometry] port of [page:BoxGeometry].
	*/
open external class BoxBufferGeometry(width: Float = definedExternally, height: Float = definedExternally, depth: Float = definedExternally, widthSegments: Int = definedExternally, heightSegments: Int = definedExternally, depthSegments: Int = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
Using the above example code above as our basis: geometry.parameters; // outputs an object {width: 1, height: 1, depth: 1, widthSegments: undefined, heightSegments: undefined} cube.geometry.parameters; // as above cube.geometry.parameters.width; // === 1 cube.geometry.parameters.widthSegments // === undefined.
	*/
	open var parameters: dynamic/*Object*/  = definedExternally
}