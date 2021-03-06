@file:JsModule("three")
package ch.viseon.threejs.declarations.extras.curves

	/**
	* Create a smooth 3d cubic bezier curve, defined by a start point, endpoint and two control points.
	*/
open external class CubicBezierCurve3(v0: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v1: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v2: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, v3: ch.viseon.threejs.declarations.math.Vector3 = definedExternally): ch.viseon.threejs.declarations.extras.core.Curve{

	/**
	* The starting point.
	*/
	open var v0: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The first control point.
	*/
	open var v1: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The second control point.
	*/
	open var v2: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* The ending point.
	*/
	open var v3: ch.viseon.threejs.declarations.math.Vector2  = definedExternally
}