@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* This class stores data for an attribute (such as vertex positions, face indices, normals, colors, UVs, and any custom attributes ) associated with a [page:BufferGeometry], which allows for more efficient passing of data to the GPU. See that page for details and a usage example. Data is stored as vectors of any length (defined by [page:BufferAttribute.itemSize itemSize]), and in general in the methods outlined below if passing in an index, this is automatically multiplied by the vector length.
	*/
open external class BufferAttribute(array: Array<dynamic> = definedExternally, itemSize: Int = definedExternally, normalized: Boolean = definedExternally){

	/**
	* The [page:TypedArray array] holding data stored in the buffer.
	*/
	open var array: Array<dynamic>  = definedExternally


	/**
	* Stores the [page:BufferAttribute.array array]'s length divided by the [page:BufferAttribute.itemSize itemSize]. If the buffer is storing a 3-component vector (such as a position, normal, or color), then this will count the number of such vectors stored.
	*/
	open var count: Int  = definedExternally


	/**
	* The length of vectors that are being stored in the [page:BufferAttribute.array array].
	*/
	open var itemSize: Int  = definedExternally


	/**
	* Optional name for this attribute instance. Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* Flag to indicate that this attribute has changed and should be re-sent to the GPU. Set this to true when you modify the value of the array. Setting this to true also increments the [page:BufferAttribute.version version].
	*/
	open var needsUpdate: Boolean  = definedExternally


	/**
	* Indicates how the underlying data in the buffer maps to the values in the GLSL shader code. See the constructor above for details.
	*/
	open var normalized: Boolean  = definedExternally


	/**
	* A callback function that is executed after the Renderer has transferred the attribute array data to the GPU.
	*/
	open var onUploadCallback: dynamic  = definedExternally


	/**
	* Object containing: [page:Integer offset]: Default is **0**. Position at which to start update. [page:Integer count]: Default is **-1**, which means don't use update ranges. This can be used to only update some components of stored vectors (for example, just the component related to color).
	*/
	open var updateRange: dynamic  = definedExternally


	/**
	* Defines the intended usage pattern of the data store for optimization purposes. Corresponds to the **usage** parameter of [link:https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData WebGLRenderingContext.bufferData](). Default is **THREE.StaticDrawUsage**.
	*/
	open var usage: Int  = definedExternally


	/**
	* A version number, incremented every time the [page:BufferAttribute.needsUpdate needsUpdate] property is set to true.
	*/
	open var version: Int  = definedExternally


	/**
	* Applies matrix [page:Matrix3 m] to every Vector3 element of this BufferAttribute.
	*/
	open fun applyMatrix3(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : BufferAttribute


	/**
	* Applies matrix [page:Matrix4 m] to every Vector3 element of this BufferAttribute.
	*/
	open fun applyMatrix4(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : BufferAttribute


	/**
	* Applies normal matrix [page:Matrix3 m] to every Vector3 element of this BufferAttribute.
	*/
	open fun applyNormalMatrix(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : BufferAttribute


	/**
	* Applies matrix [page:Matrix4 m] to every Vector3 element of this BufferAttribute, interpreting the elements as a direction vectors.
	*/
	open fun transformDirection(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : BufferAttribute


	/**
	* Return a copy of this bufferAttribute.
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copies another BufferAttribute to this BufferAttribute.
	*/
	open fun copy(bufferAttribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy the array given here (which can be a normal array or TypedArray) into [page:BufferAttribute.array array]. See [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set TypedArray.set] for notes on requirements if copying a TypedArray.
	*/
	open fun copyArray() : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy a vector from bufferAttribute[index2] to [page:BufferAttribute.array array][index1].
	*/
	open fun copyAt(index1: Int = definedExternally, bufferAttribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally, index2: Int = definedExternally) : dynamic


	/**
	* Copy an array representing RGB color values into [page:BufferAttribute.array array].
	*/
	open fun copyColorsArray(colors: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy an array representing [page:Vector2]s into [page:BufferAttribute.array array].
	*/
	open fun copyVector2sArray(vectors: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy an array representing [page:Vector3]s into [page:BufferAttribute.array array].
	*/
	open fun copyVector3sArray(vectors: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Copy an array representing [page:Vector4]s into [page:BufferAttribute.array array].
	*/
	open fun copyVector4sArray(vectors: Array<dynamic> = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Returns the x component of the vector at the given index.
	*/
	open fun getX(index: Int = definedExternally) : Double


	/**
	* Returns the y component of the vector at the given index.
	*/
	open fun getY(index: Int = definedExternally) : Double


	/**
	* Returns the z component of the vector at the given index.
	*/
	open fun getZ(index: Int = definedExternally) : Double


	/**
	* Returns the w component of the vector at the given index.
	*/
	open fun getW(index: Int = definedExternally) : Double


	/**
	* Sets the value of the onUploadCallback property. In the [example:webgl_buffergeometry WebGL / Buffergeometry] this is used to free memory after the buffer has been transferred to the GPU.
	*/
	open fun onUpload(callback: dynamic = definedExternally) : dynamic


	/**
	* value -- an [page:Array] or [page:TypedArray] from which to copy values. offset -- (optional) index of the [page:BufferAttribute.array array] at which to start copying. Calls [link:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set TypedArray.set]( [page:Array value], [page:Integer offset] ) on the [page:BufferAttribute.array array]. In particular, see that page for requirements on [page:Array value] being a [page:TypedArray].
	*/
	open fun set(value: Array<dynamic> = definedExternally, offset: Int = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Set [page:BufferAttribute.usage usage] to value.
	*/
	open fun setUsage(value: Int = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x component of the vector at the given index.
	*/
	open fun setX(index: Int = definedExternally, x: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the y component of the vector at the given index.
	*/
	open fun setY(index: Int = definedExternally, y: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the z component of the vector at the given index.
	*/
	open fun setZ(index: Int = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the w component of the vector at the given index.
	*/
	open fun setW(index: Int = definedExternally, w: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x and y components of the vector at the given index.
	*/
	open fun setXY(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x, y and z components of the vector at the given index.
	*/
	open fun setXYZ(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute


	/**
	* Sets the x, y, z and w components of the vector at the given index.
	*/
	open fun setXYZW(index: Int = definedExternally, x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally) : ch.viseon.threejs.declarations.core.BufferAttribute
}