/**
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.videoGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mlh.videoGen.VideoSeq#getVid <em>Vid</em>}</li>
 *   <li>{@link org.xtext.mlh.videoGen.VideoSeq#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.mlh.videoGen.VideoSeq#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.mlh.videoGen.VideoSeq#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.mlh.videoGen.VideoSeq#getDisplay_stats <em>Display stats</em>}</li>
 * </ul>
 *
 * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoSeq()
 * @model
 * @generated
 */
public interface VideoSeq extends EObject
{
  /**
   * Returns the value of the '<em><b>Vid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vid</em>' attribute.
   * @see #setVid(String)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoSeq_Vid()
   * @model
   * @generated
   */
  String getVid();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.VideoSeq#getVid <em>Vid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vid</em>' attribute.
   * @see #getVid()
   * @generated
   */
  void setVid(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoSeq_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.VideoSeq#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoSeq_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.VideoSeq#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(Duration)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoSeq_Duration()
   * @model containment="true"
   * @generated
   */
  Duration getDuration();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.VideoSeq#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(Duration value);

  /**
   * Returns the value of the '<em><b>Display stats</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display stats</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display stats</em>' containment reference.
   * @see #setDisplay_stats(Display_stats)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getVideoSeq_Display_stats()
   * @model containment="true"
   * @generated
   */
  Display_stats getDisplay_stats();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.VideoSeq#getDisplay_stats <em>Display stats</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display stats</em>' containment reference.
   * @see #getDisplay_stats()
   * @generated
   */
  void setDisplay_stats(Display_stats value);

} // VideoSeq
