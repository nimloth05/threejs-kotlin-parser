//Generated date 07.02.2019
@file:JsModule("three")
package ch.viseon.threejs.declarations.math

	/**
	* A class representing a 3x3 [link:https://en.wikipedia.org/wiki/Matrix_(mathematics) matrix].
	*/
open external class Matrix3(){

	/**
	* A [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order column-major] list of matrix values.
	*/
	open var elements: org.khronos.webgl.Float32Array  = definedExternally


	/**
	* Used to check whether this or derived classes are Matrix3s. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isMatrix3: Boolean  = definedExternally


	/**
	* [page:BufferAttribute attribute] - An attribute of floats that represent 3D vectors. Multiplies (applies) this matrix to every 3D vector in the [page:BufferAttribute attribute].
	*/
	open fun applyToBufferAttribute(attribute: ch.viseon.threejs.declarations.core.BufferAttribute = definedExternally) : Array<dynamic>


	/**
	* Creates a new Matrix3 and with identical elements to this one.
	*/
	open fun clone() : ch.viseon.threejs.declarations.math.Matrix3


	/**
	* Copies the elements of matrix [page:Matrix3 m] into this matrix.
	*/
	open fun copy(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Matrix3


	/**
	* Computes and returns the [link:https://en.wikipedia.org/wiki/Determinant determinant] of this matrix.
	*/
	open fun determinant() : Double


	/**
	* Return true if this matrix and [page:Matrix3 m] are equal.
	*/
	open fun equals(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Boolean


	/**
	* [page:Array array] - the array to read the elements from. [page:Integer offset] - (optional) index of first element in the array. Default is 0. Sets the elements of this matrix based on an array in [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order#Column-major_order column-major] format.
	*/
	open fun fromArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Matrix3


	/**
	* [page:Matrix3 m] - the matrix to take the inverse of. [page:Boolean throwOnDegenerate] - (optional) If true, throw an error if the matrix is degenerate (not invertible). Set this matrix to the [link:https://en.wikipedia.org/wiki/Invertible_matrix inverse] of the passed matrix [page:Matrix3 m], using the [link:https://en.wikipedia.org/wiki/Invertible_matrix#Analytic_solution analytic method]. If [page:Boolean throwOnDegenerate] is not set and the matrix is not invertible, set this to the 3x3 identity matrix.
	*/
	open fun getInverse(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally, throwOnDegenerate: Boolean = definedExternally) : Matrix3


	/**
	* [page:Matrix4 m] - [page:Matrix4] Sets this matrix as the upper left 3x3 of the [link:https://en.wikipedia.org/wiki/Normal_matrix normal matrix] of the passed [page:Matrix4 matrix4]. The normal matrix is the [link:https://en.wikipedia.org/wiki/Invertible_matrix inverse] [link:https://en.wikipedia.org/wiki/Transpose transpose] of the matrix [page:Matrix4 m].
	*/
	open fun getNormalMatrix(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix3


	/**
	* Resets this matrix to the 3x3 identity matrix: 1, 0, 0 0, 1, 0 0, 0, 1
	*/
	open fun identity() : Matrix3


	/**
	* Post-multiplies this matrix by [page:Matrix3 m].
	*/
	open fun multiply(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Matrix3


	/**
	* Sets this matrix to [page:Matrix3 a] x [page:Matrix3 b].
	*/
	open fun multiplyMatrices(a: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally, b: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Matrix3


	/**
	* Multiplies every component of the matrix by the scalar value **s**.
	*/
	open fun multiplyScalar(s: Double = definedExternally) : Matrix3


	/**
	* [page:Float n11] - value to put in row 1, col 1. [page:Float n12] - value to put in row 1, col 2. ... ... [page:Float n32] - value to put in row 3, col 2. [page:Float n33] - value to put in row 3, col 3. Sets the 3x3 matrix values to the given [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order row-major] sequence of values.
	*/
	open fun set(n11: Double = definedExternally, n12: Double = definedExternally, n13: Double = definedExternally, n21: Double = definedExternally, n22: Double = definedExternally, n23: Double = definedExternally, n31: Double = definedExternally, n32: Double = definedExternally, n33: Double = definedExternally) : Matrix3


	/**
	* Pre-multiplies this matrix by [page:Matrix3 m].
	*/
	open fun premultiply(m: ch.viseon.threejs.declarations.math.Matrix3 = definedExternally) : Matrix3


	/**
	* Set this matrx to the upper 3x3 matrix of the Matrix4 [page:Matrix4 m].
	*/
	open fun setFromMatrix4(m: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : Matrix3


	/**
	* [page:Float tx] - offset x [page:Float ty] - offset y [page:Float sx] - repeat x [page:Float sy] - repeat y [page:Float rotation] - rotation (in radians) [page:Float cx] - center x of rotation [page:Float cy] - center y of rotation Sets the UV transform matrix from offset, repeat, rotation, and center.
	*/
	open fun setUvTransform(tx: Double = definedExternally, ty: Double = definedExternally, sx: Double = definedExternally, sy: Double = definedExternally, rotation: Double = definedExternally, cx: Double = definedExternally, cy: Double = definedExternally) : Matrix3


	/**
	* [page:Array array] - (optional) array to store the resulting vector in. If not given a new array will be created. [page:Integer offset] - (optional) offset in the array at which to put the result. Writes the elements of this matrix to an array in [link:https://en.wikipedia.org/wiki/Row-_and_column-major_order#Column-major_order column-major] format.
	*/
	open fun toArray(array: Array<dynamic> = definedExternally, offset: Int = definedExternally) : Array<dynamic>


	/**
	* [link:https://en.wikipedia.org/wiki/Transpose Transposes] this matrix in place.
	*/
	open fun transpose() : Matrix3


	/**
	* [page:Array array] - array to store the resulting vector in. [link:https://en.wikipedia.org/wiki/Transpose Transposes] this matrix into the supplied array, and returns itself unchanged.
	*/
	open fun transposeIntoArray(array: Array<dynamic> = definedExternally) : Matrix3
}