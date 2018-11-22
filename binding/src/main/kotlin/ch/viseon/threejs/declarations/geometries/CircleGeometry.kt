//Generated date 22.11.2018@file:JsModule("three")
package ch.viseon.threejs.declarations.geometries

	/**
	* CircleGeometry is a simple shape of Euclidean geometry. It is contructed from a number of triangular segments that are oriented around a central point and extend as far out as a given radius. It is built counter-clockwise from a start angle and a given central angle. It can also be used to create regular polygons, where the number of segments determines the number of sides.
	*/
open external class CircleGeometry(radius: Float = definedExternally, segments: Int = definedExternally, thetaStart: Float = definedExternally, thetaLength: Float = definedExternally): ch.viseon.threejs.declarations.core.Geometry{

	/**
	* An object with a property for each of the constructor parameters. Any modification after instantiation does not change the geometry.
	*/
	open var parameters: dynamic/*Object*/  = definedExternally
}