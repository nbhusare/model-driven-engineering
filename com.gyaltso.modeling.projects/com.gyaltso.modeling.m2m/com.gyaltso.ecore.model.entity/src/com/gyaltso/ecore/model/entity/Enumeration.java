/**
 */
package com.gyaltso.ecore.model.entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.ecore.model.entity.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see com.gyaltso.ecore.model.entity.EntityPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Entity {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link com.gyaltso.ecore.model.entity.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see com.gyaltso.ecore.model.entity.EntityPackage#getEnumeration_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getLiterals();

} // Enumeration
