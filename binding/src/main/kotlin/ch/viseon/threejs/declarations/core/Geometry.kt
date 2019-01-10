//Generated date 29.11.2018
@file:JsModule("three")
package ch.viseon.threejs.declarations.core

	/**
	* Geometry is a user-friendly alternative to [page:BufferGeometry]. Geometries store attributes (vertex positions, faces, colors, etc.) using objects like [page:Vector3] or [page:Color] that are easier to read and edit, but less efficient than typed arrays. Prefer [page:BufferGeometry] for large or serious projects.
	*/
open external class Geometry(){

	/**
	* Bounding box for the Geometry, which can be calculated with [page:.computeBoundingBox](). Default is **null**.
	*/
	open var boundingBox: ch.viseon.threejs.declarations.math.Box3  = definedExternally


	/**
	* Bounding sphere for the Geometry, which can be calculated with [page:.computeBoundingSphere](). Default is **null**.
	*/
	open var boundingSphere: ch.viseon.threejs.declarations.math.Sphere  = definedExternally


	/**
	* Array of vertex [page:Color colors], matching number and order of vertices. This is used by [page:Points] and [page:Line] and any classes derived from those such as [page:LineSegments] and various helpers. [page:Mesh Meshes] use [page:Face3.vertexColors] instead of this. To signal an update in this array, [page:Geometry Geometry.colorsNeedUpdate] needs to be set to true.
	*/
	open var colors: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Array of [page:Face3 faces]. The array of faces describe how each vertex in the model is connected to form faces. Additionally it holds information about face and vertex normals and colors. To signal an update in this array, [page:Geometry Geometry.elementsNeedUpdate] needs to be set to true.
	*/
	open var faces: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Array of face [link:https://en.wikipedia.org/wiki/UV_mapping UV] layers, used for mapping textures onto the geometry. Each UV layer is an array of [page:UV]s matching the order and number of vertices in faces. To signal an update in this array, [page:Geometry Geometry.uvsNeedUpdate] needs to be set to true.
	*/
	open var faceVertexUvs: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Unique number for this geometry instance.
	*/
	open var id: Int  = definedExternally


	/**
	* Used to check whether this or derived classes are Geometries. Default is **true**. You should not change this, as it used internally for optimisation.
	*/
	open var isGeometry: Boolean  = definedExternally


	/**
	* An array containing distances between vertices for Line geometries. This is required for [page:LineDashedMaterial] to render correctly.
	*/
	open var lineDistances: Array<dynamic>/*array*/  = definedExternally


	/**
	* Array of [link:https://en.wikipedia.org/wiki/Morph_target_animation morph targets]. Each morph target is a Javascript object: { name: "targetName", vertices: [ new THREE.Vector3(), ... ] } Morph vertices match number and order of primary vertices.
	*/
	open var morphTargets: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Array of morph normals. Morph normals have similar structure as morph targets, each normal set is a Javascript object: morphNormal = { name: "NormalName", normals: [ new THREE.Vector3(), ... ] } See the [example:webgl_morphnormals WebGL / morphNormals] example.
	*/
	open var morphNormals: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Optional name for this geometry. Default is an empty string.
	*/
	open var name: String  = definedExternally


	/**
	* When working with a [page:SkinnedMesh], each vertex can have up to 4 [page:Bone bones] affecting it. The skinWeights property is an array of weight values that correspond to the order of the vertices in the geometry. So for instance, the first skinWeight would correspond to the first vertex in the geometry. Since each vertex can be modified by 4 bones, a [page:Vector4] is used to represent the skin weights for that vertex.
The values of the vector should typically be between 0 and 1. For instance when set to 0 the bone transformation will have no affect. When set to 0.5 it will have 50% affect. When set to 100%, it will have 100% affect. If there is only 1 bone associated with the vertex then you only need to worry about the first component of the vector, the rest can be ignored and set to 0.
	*/
	open var skinWeights: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Just like the skinWeights property, the skinIndices' values correspond to the geometry's vertices. Each vertex can have up to 4 bones associated with it. So if you look at the first vertex, and the first skinIndex, this will tell you the bones associated with that vertex. For example the first vertex could have a value of ( 10.05, 30.10, 12.12 ). Then the first skin index could have the value of ( 10, 2, 0, 0 ). The first skin weight could have the value of ( 0.8, 0.2, 0, 0 ). In affect this would take the first vertex, and then the bone mesh.bones[10] and apply it 80% of the way. Then it would take the bone skeleton.bones[2] and apply it 20% of the way. The next two values have a weight of 0, so they would have no affect.
In code another example could look like this: // e.g. geometry.skinIndices[15] = new THREE.Vector4( 0, 5, 9, 10 ); geometry.skinWeights[15] = new THREE.Vector4( 0.2, 0.5, 0.3, 0 ); // corresponds with the following vertex geometry.vertices[15]; // these bones will be used like so: skeleton.bones[0]; // weight of 0.2 skeleton.bones[5]; // weight of 0.5 skeleton.bones[9]; // weight of 0.3 skeleton.bones[10]; // weight of 0
	*/
	open var skinIndices: Array<dynamic>/*Array*/  = definedExternally


	/**
	* [link:http://en.wikipedia.org/wiki/Universally_unique_identifier UUID] of this object instance. This gets automatically assigned and shouldn't be edited.
	*/
	open var uuid: String  = definedExternally


	/**
	* Array of [page:Vector3 vertices]. The array of vertices holds the position of every vertex in the model. To signal an update in this array, [page:.verticesNeedUpdate] needs to be set to true.
	*/
	open var vertices: Array<dynamic>/*Array*/  = definedExternally


	/**
	* Set to **true** if the vertices array has been updated.
	*/
	open var verticesNeedUpdate: Boolean  = definedExternally


	/**
	* Set to **true** if the faces array has been updated.
	*/
	open var elementsNeedUpdate: Boolean  = definedExternally


	/**
	* Set to **true** if the uvs array has been updated.
	*/
	open var uvsNeedUpdate: Boolean  = definedExternally


	/**
	* Set to **true** if the normals array has been updated.
	*/
	open var normalsNeedUpdate: Boolean  = definedExternally


	/**
	* Set to **true** if the colors array or a face3 color has been updated.
	*/
	open var colorsNeedUpdate: Boolean  = definedExternally


	/**
	* Set to **true** if a face3 materialIndex has been updated.
	*/
	open var groupsNeedUpdate: Boolean  = definedExternally


	/**
	* Set to **true** if the linedistances array has been updated.
	*/
	open var lineDistancesNeedUpdate: Boolean  = definedExternally


	/**
	* Bakes matrix transform directly into vertex coordinates.
	*/
	open fun applyMatrix(matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally) : dynamic/*null*/


	/**
	* Center the geometry based on the bounding box.
	*/
	open fun center() : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Creates a new clone of the Geometry. This method copies only vertices, faces and uvs. It does not copy any other properties of the geometry.
	*/
	open fun clone() : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Computes bounding box of the geometry, updating [page:Geometry Geometry.boundingBox] attribute.
	*/
	open fun computeBoundingBox() : dynamic/*null*/


	/**
	* Computes bounding sphere of the geometry, updating [page:Geometry Geometry.boundingSphere] attribute.
Neither bounding boxes or bounding spheres are computed by default. They need to be explicitly computed, otherwise they are **null**.
	*/
	open fun computeBoundingSphere() : dynamic/*null*/


	/**
	* Computes [page:Face3.normal face normals].
	*/
	open fun computeFaceNormals() : dynamic/*null*/


	/**
	* Computes flat [page:Face3.vertexNormals vertex normals]. Sets the vertex normal of each vertex of each face to be the same as the face's normal.
	*/
	open fun computeFlatVertexNormals() : dynamic/*null*/


	/**
	* Computes [page:.morphNormals].
	*/
	open fun computeMorphNormals() : dynamic/*null*/


	/**
	* areaWeighted - If true the contribution of each face normal to the vertex normal is weighted by the area of the face. Default is true. Computes vertex normals by averaging face normals.
	*/
	open fun computeVertexNormals(areaWeighted: Boolean = definedExternally) : dynamic/*null*/


	/**
	* Copies vertices, faces and uvs into this geometry. It does not copy any other properties of the geometry.
	*/
	open fun copy(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Removes The object from memory. Don't forget to call this method when you remove a geometry because it can cause memory leaks.
	*/
	open fun dispose() : dynamic/*null*/


	/**
	* Convert a [page:BufferGeometry] to a Geometry. The array used to store the vertices in the bufferGeometry is a non indexed array, so the resultant geometry may contain duplicated vertices. Use [page:mergeVertices] to remove them.
	*/
	open fun fromBufferGeometry(geometry: ch.viseon.threejs.declarations.core.BufferGeometry = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* vector - A world vector to look at. Rotates the geometry to face point in space. This is typically done as a one time operation but not during the render loop. Use [page:Object3D.lookAt] for typical real-time mesh usage.
	*/
	open fun lookAt(vector: ch.viseon.threejs.declarations.math.Vector3 = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Merge two geometries or geometry and geometry from object (using object's transform)
	*/
	open fun merge(geometry: ch.viseon.threejs.declarations.core.Geometry = definedExternally, matrix: ch.viseon.threejs.declarations.math.Matrix4 = definedExternally, materialIndexOffset: Int = definedExternally) : dynamic/*null*/


	/**
	* Merge the mesh's geometry with this, also applying the mesh's transform.
	*/
	open fun mergeMesh(mesh: ch.viseon.threejs.declarations.objects.Mesh = definedExternally) : dynamic/*null*/


	/**
	* Checks for duplicate vertices using hashmap. Duplicated vertices are removed and faces' vertices are updated.
	*/
	open fun mergeVertices() : dynamic/*null*/


	/**
	* Normalize the geometry. Make the geometry centered and have a bounding sphere of radius **1.0**.
	*/
	open fun normalize() : dynamic/*null*/


	/**
	* Rotate the geometry about the X axis. This is typically done as a one time operation but not during the render loop. Use [page:Object3D.rotation] for typical real-time mesh rotation.
	*/
	open fun rotateX(radians: Double = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Rotate the geometry about the Y axis. This is typically done as a one time operation but not during the render loop. Use [page:Object3D.rotation] for typical real-time mesh rotation.
	*/
	open fun rotateY(radians: Double = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Rotate the geometry about the Z axis. This is typically done as a one time operation but not during the render loop. Use [page:Object3D.rotation] for typical real-time mesh rotation.
	*/
	open fun rotateZ(radians: Double = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Sets the vertices for this Geometry from an array of points.
	*/
	open fun setFromPoints(points: Array<dynamic>/*Array*/ = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Sorts the faces array according to material index. For complex geometries with several materials, this can result in reduced draw calls and improved performance.
	*/
	open fun sortFacesByMaterialIndex() : dynamic/*null*/


	/**
	* Scale the geometry data. This is typically done as a one time operation but not during the render loop. Use [page:Object3D.scale] for typical real-time mesh scaling.
	*/
	open fun scale(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.Geometry


	/**
	* Convert the geometry to JSON format.
	*/
	open fun toJSON() : JSON


	/**
	* Translate the geometry. This is typically done as a one time operation but not during the render loop. Use [page:Object3D.position] for typical real-time mesh translation.
	*/
	open fun translate(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally) : ch.viseon.threejs.declarations.core.Geometry
}