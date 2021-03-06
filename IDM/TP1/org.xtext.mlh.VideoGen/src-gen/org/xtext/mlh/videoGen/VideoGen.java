/**
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.videoGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mlh.videoGen.VideoGen#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends EObject
{
  /**
   * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mlh.videoGen.VideoType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videos</em>' containment reference list.
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoGen_Videos()
   * @model containment="true"
   * @generated
   */
  EList<VideoType> getVideos();

} // VideoGen
