@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A point's [link:https://en.wikipedia.org/wiki/Spherical_coordinate_system spherical coordinates].
	*/
open external class Spherical(radius: Double = definedExternally, phi: Double = definedExternally, theta: Double = definedExternally){
	open var radius: Double  = definedExternally

	open var phi: Double  = definedExternally

	open var theta: Double  = definedExternally


	/**
	* Returns a new spherical with the same [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Copies the values of the passed Spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties to this spherical.
	*/
	open fun copy(s: ch.viseon.threejs.declarations.math.Spherical = definedExternally) : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Restricts the polar angle [page:.phi phi] to be between 0.000001 and pi - 0.000001.
	*/
	open fun makeSafe() : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Sets values of this spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties.
	*/
	open fun set(radius: Double = definedExternally, phi: Double = definedExternally, theta: Double = definedExternally) : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Sets values of this spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties from the [page:Vector3 Vector3].
	*/
	open fun setFromVector3(vec3: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Spherical


	/**
	* Sets values of this spherical's [page:.radius radius], [page:.phi phi] and [page:.theta theta] properties from Cartesian coordinates.
	*/
	open fun setFromCartesianCoords(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.math.Spherical
}