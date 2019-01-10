//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.helpers

	/**
	* Helper object to show the world-axis-aligned bounding box around an object. Note that the object must have a [page:Geometry] or [page:BufferGeometry] for this to work, so it won't work with [page:Sprite Sprites].
	*/
open external class BoxHelper(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally, color: ch.viseon.threejs.declarations.math.Color = definedExternally): ch.viseon.threejs.declarations.objects.LineSegments{

	/**
	* Updates the helper's geometry to match the dimensions of the object, including any children. See [page:Box3.setFromObject].
	*/
	open fun update() : dynamic/*null*/


	/**
	* [page:Object3D object] - [page:Object3D] to create the helper of. Updates the wireframe box for the passed object.
	*/
	open fun setFromObject(`object`: ch.viseon.threejs.declarations.core.Object3D = definedExternally) : ch.viseon.threejs.declarations.helpers.BoxHelper
}