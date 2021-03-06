@file:JsModule("three")
package ch.viseon.threejs.declarations.materials

	/**
	* An extension of the [page:MeshStandardMaterial], providing more advanced physically-based rendering properties:
	*/
open external class MeshPhysicalMaterial(parameters: dynamic = definedExternally): ch.viseon.threejs.declarations.materials.MeshStandardMaterial{

	/**
	* Represents the thickness of the clear coat layer, from **0.0** to **1.0**. Use clear coat related properties to enable multilayer materials that have a thin translucent layer over the base layer. Default is **0.0**.
	*/
	open var clearcoat: Double  = definedExternally


	/**
	* The red channel of this texture is multiplied against [page:.clearcoat], for per-pixel control over a coating's thickness. Default is **null**.
	*/
	open var clearcoatMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* Can be used to enable independent normals for the clear coat layer. Default is **null**.
	*/
	open var clearcoatNormalMap: Double  = definedExternally


	/**
	* How much [page:.clearcoatNormalMap] affects the clear coat layer, from **(0,0)** to **(1,1)**. Default is **(1,1)**.
	*/
	open var clearcoatNormalScale: ch.viseon.threejs.declarations.math.Vector2  = definedExternally


	/**
	* Roughness of the clear coat layer, from **0.0** to **1.0**. Default is **0.0**.
	*/
	open var clearcoatRoughness: Double  = definedExternally


	/**
	* The green channel of this texture is multiplied against [page:.clearcoatRoughness], for per-pixel control over a coating's roughness. Default is **null**.
	*/
	open var clearcoatRoughnessMap: ch.viseon.threejs.declarations.textures.Texture  = definedExternally


	/**
	* An object of the form: { 'STANDARD': '' 'PHYSICAL': '', }; This is used by the [page:WebGLRenderer] for selecting shaders.
	*/
	override var defines: dynamic 


	/**
	* Degree of reflectivity, from **0.0** to **1.0**. Default is **0.5**. This models the reflectivity of non-metallic materials. It has no effect when [page:MeshStandardMaterial.metalness metalness] is **1.0**
	*/
	open var reflectivity: Double  = definedExternally


	/**
	* Degree of transparency, from **0.0** to **1.0**. Default is **0.0**. Thin, transparent or semitransparent, plastic or glass materials remain largely reflective even if they are mostly transparent. The transparency property can be used to model these materials. When transparency is non-zero, [page:Material.opacity opacity] should be set to **1**.
	*/
	open var transparency: Double  = definedExternally
}