@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* An instanced version of [page:InterleavedBuffer].
	*/
open external class InstancedInterleavedBuffer(array: Array<dynamic> = definedExternally, itemSize: Int = definedExternally, meshPerAttribute: Double = definedExternally): ch.viseon.threejs.declarations.core.InterleavedBuffer{

	/**
	* Default is **1**.
	*/
	open var meshPerAttribute: Double  = definedExternally
}