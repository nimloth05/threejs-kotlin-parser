@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* A class for generating an icosahedron geometry.
	*/
open external class IcosahedronBufferGeometry(radius: Double = definedExternally, detail: Int = definedExternally): ch.viseon.threejs.declarations.geometries.PolyhedronBufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	override var parameters: dynamic 
}