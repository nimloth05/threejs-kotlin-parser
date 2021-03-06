@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* This is the [page:BufferGeometry] port of [page:ConeGeometry].
	*/
open external class ConeBufferGeometry(radius: Double = definedExternally, height: Double = definedExternally, radialSegments: Int = definedExternally, heightSegments: Int = definedExternally, openEnded: Boolean = definedExternally, thetaStart: Double = definedExternally, thetaLength: Double = definedExternally): ch.viseon.threejs.declarations.geometries.CylinderBufferGeometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	override var parameters: dynamic 
}