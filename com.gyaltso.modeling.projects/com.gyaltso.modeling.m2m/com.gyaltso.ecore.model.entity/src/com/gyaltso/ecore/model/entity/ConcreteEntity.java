/**
 */
package com.gyaltso.ecore.model.entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.ecore.model.entity.ConcreteEntity#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.gyaltso.ecore.model.entity.ConcreteEntity#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.gyaltso.ecore.model.entity.ConcreteEntity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see com.gyaltso.ecore.model.entity.EntityPackage#getConcreteEntity()
 * @model
 * @generated
 */
public interface ConcreteEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see com.gyaltso.ecore.model.entity.EntityPackage#getConcreteEntity_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link com.gyaltso.ecore.model.entity.ConcreteEntity#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity</em>' reference.
	 * @see #setSuperEntity(Entity)
	 * @see com.gyaltso.ecore.model.entity.EntityPackage#getConcreteEntity_SuperEntity()
	 * @model
	 * @generated
	 */
	Entity getSuperEntity();

	/**
	 * Sets the value of the '{@link com.gyaltso.ecore.model.entity.ConcreteEntity#getSuperEntity <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Entity</em>' reference.
	 * @see #getSuperEntity()
	 * @generated
	 */
	void setSuperEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.gyaltso.ecore.model.entity.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.gyaltso.ecore.model.entity.EntityPackage#getConcreteEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // ConcreteEntity
