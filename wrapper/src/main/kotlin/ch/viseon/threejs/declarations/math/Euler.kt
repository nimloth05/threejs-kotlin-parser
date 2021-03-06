@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A class representing [link:http://en.wikipedia.org/wiki/Euler_angles Euler Angles]. Euler angles describe a rotational transformation by rotating an object on its various axes in specified amounts per axis, and a specified axis order.
	*/
open external class Euler(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, order: String = definedExternally){

	/**
	* The order in which to apply rotations. Default is 'XYZ', which means that the object will first be rotated around its X axis, then its Y axis and finally its Z axis. Other possibilities are: 'YZX', 'ZXY', 'XZY', 'YXZ' and 'ZYX'. These must be in upper case. Three.js uses intrinsic Tait-Bryan angles. This means that rotations are performed with respect to the local coordinate system. That is, for order 'XYZ', the rotation is first around the local-X axis (which is the same as the world-X axis), then around local-Y (which may now be different from the world Y-axis), then local-Z (which may be different from the world Z-axis).
	*/
	open var order: String  = definedExternally


	/**
	* The current value of the x component.
	*/
	open var x: Double  = definedExternally


	/**
	* The current value of the y component.
	*/
	open var y: Double  = definedExternally


	/**
	* The current value of the z component.
	*/
	open var z: Double  = definedExternally


	/**
	* Copies value of [page:Euler euler] to this euler.
	*/
	open fun copy(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* Returns a new Euler with the same parameters as this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Euler


	/**
	* Checks for strict equality of this euler and [page:Euler euler].
	*/
	open fun equals(euler: ch.viseon.threejs.declarations.math.Euler = definedExternally) : Boolean


	/**
	* [page:Array array] of length 3 or 4. The optional 4th argument corresponds to the [page:.order order]. Assigns this euler's [page:.x x] angle to array[0]. Assigns this euler's [page:.y y] angle to array[1]. Assigns this euler's [page:.z z] angle to array[2]. Optionally assigns this euler's [page:.order order] to array[3].
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* Resets the euler angle with a new order by creating a quaternion from this euler angle and then setting this euler angle with the quaternion and the new order. WARNING: this discards revolution information.
	*/
	open fun reorder(newOrder: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:.x x] - the angle of the x axis in radians. [page:.y y] - the angle of the y axis in radians. [page:.z z] - the angle of the z axis in radians. [page:.order order] - (optional) a string representing the order that the rotations are applied. Sets the angles of this euler transform and optionally the [page:.order order].
	*/
	open fun set(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, order: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Matrix4 m] - a [page:Matrix4] of which the upper 3x3 of matrix is a pure [link:https://en.wikipedia.org/wiki/Rotation_matrix rotation matrix] (i.e. unscaled). [page:.order order] - (optional) a string representing the order that the rotations are applied. Sets the angles of this euler transform from a pure rotation matrix based on the orientation specified by order.
	*/
	open fun setFromRotationMatrix(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, order: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Quaternion q] - a normalized quaternion. [page:.order order] - (optional) a string representing the order that the rotations are applied. Sets the angles of this euler transform from a normalized quaternion based on the orientation specified by [page:.order order].
	*/
	open fun setFromQuaternion(q: ch.viseon.threejs.declarations.math.Quaternion = definedExternally, order: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Vector3 vector] - [page:Vector3]. [page:.order order] - (optional) a string representing the order that the rotations are applied. Set the [page:.x x], [page:.y y] and [page:.z z], and optionally update the [page:.order order].
	*/
	open fun setFromVector3(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally, order: String = definedExternally) : ch.viseon.threejs.declarations.math.Euler


	/**
	* [page:Array array] - (optional) array to store the euler in. [page:Integer offset] (optional) offset in the array. Returns an array of the form [[page:.x x], [page:.y y], [page:.z z], [page:.order order ]].
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>


	/**
	* [page:Vector3 optionalResult] — (optional) If specified, the result will be copied into this Vector, otherwise a new one will be created. Returns the Euler's [page:.x x], [page:.y y] and [page:.z z] properties as a [page:Vector3].
	*/
	open fun toVector3(optionalResult: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.math.Vector3
}