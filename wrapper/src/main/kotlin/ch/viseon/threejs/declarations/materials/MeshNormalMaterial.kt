@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* A material that maps the normal vectors to RGB colors.
	*/
open external class MeshNormalMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.Material{

	/**
	* The texture to create a bump map. The black and white values map to the perceived depth in relation to the lights. Bump doesn't actually affect the geometry of the object, only the lighting. If a normal map is defined this will be ignored.
	*/
	open var bumpMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* How much the bump map affects the material. Typical ranges are 0-1. Default is 1.
	*/
	open var bumpScale: Double  = definedExternally


	/**
	* The displacement map affects the position of the mesh's vertices. Unlike other maps which only affect the light and shade of the material the displaced vertices can cast shadows, block other objects, and otherwise act as real geometry. The displacement texture is an image where the value of each pixel (white being the highest) is mapped against, and repositions, the vertices of the mesh.
	*/
	open var displacementMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* How much the displacement map affects the mesh (where black is no displacement, and white is maximum displacement). Without a displacement map set, this value is not applied. Default is 1.
	*/
	open var displacementScale: Double  = definedExternally


	/**
	* The offset of the displacement map's values on the mesh's vertices. Without a displacement map set, this value is not applied. Default is 0.
	*/
	open var displacementBias: Double  = definedExternally


	/**
	* Whether the material is affected by fog. Default is **false**.
	*/
	override var fog: Boolean 


	/**
	* Defines whether the material uses morphNormals. Set as true to pass morphNormal attributes from the [page:Geometry] to the shader. Default is **false**.
	*/
	open var morphNormals: Boolean  = definedExternally


	/**
	* Define whether the material uses morphTargets. Default is false.
	*/
	open var morphTargets: Boolean  = definedExternally


	/**
	* The texture to create a normal map. The RGB values affect the surface normal for each pixel fragment and change the way the color is lit. Normal maps do not change the actual shape of the surface, only the lighting. In case the material has a normal map authored using the left handed convention, the y component of normalScale should be negated to compensate for the different handedness.
	*/
	open var normalMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* The type of normal map. Options are [page:constant THREE.TangentSpaceNormalMap] (default), and [page:constant THREE.ObjectSpaceNormalMap].
	*/
	open var normalMapType: Int  = definedExternally


	/**
	* How much the normal map affects the material. Typical ranges are 0-1. Default is a [page:Vector2] set to (1,1).
	*/
	open var normalScale: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* Define whether the material uses skinning. Default is false.
	*/
	open var skinning: Boolean  = definedExternally


	/**
	* Render geometry as wireframe. Default is false (i.e. render as smooth shaded).
	*/
	open var wireframe: Boolean  = definedExternally


	/**
	* Controls wireframe thickness. Default is 1. Due to limitations of the [link:https://www.khronos.org/registry/OpenGL/specs/gl/glspec46.core.pdf OpenGL Core Profile] with the [page:WebGLRenderer WebGL] renderer on most platforms linewidth will always be 1 regardless of the set value.
	*/
	open var wireframeLinewidth: Double  = definedExternally
}