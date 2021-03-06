@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* Generate geometry representing a parametric surface.
	*/
open external class ParametricBufferGeometry(func: dynamic = definedExternally, slices: Int = definedExternally, stacks: Int = definedExternally): ch.viseon.threejs.declarations.core.BufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic  = definedExternally
}