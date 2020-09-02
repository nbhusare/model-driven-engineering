/**
 */
package com.gyaltso.ecore.model.entity.impl;

import com.gyaltso.ecore.model.entity.Entity;
import com.gyaltso.ecore.model.entity.EntityPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityImpl extends DataTypeImpl implements Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY;
	}

} //EntityImpl
