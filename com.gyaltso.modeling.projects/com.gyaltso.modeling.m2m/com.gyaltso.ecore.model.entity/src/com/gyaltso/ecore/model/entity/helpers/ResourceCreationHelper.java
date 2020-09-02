/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *******************************************************************************/

package com.gyaltso.ecore.model.entity.helpers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.gyaltso.ecore.model.entity.Attribute;
import com.gyaltso.ecore.model.entity.ConcreteEntity;
import com.gyaltso.ecore.model.entity.DataType;
import com.gyaltso.ecore.model.entity.EntityFactory;
import com.gyaltso.ecore.model.entity.Enumeration;
import com.gyaltso.ecore.model.entity.Literal;
import com.gyaltso.ecore.model.entity.Package;

/**
 * @author Neeraj Bhusare
 *
 */
public class ResourceCreationHelper {

	private static final EntityFactory FACTORY = EntityFactory.eINSTANCE;

	public void createAndSaveResource() throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Package
		Package pkg = FACTORY.createPackage();
		pkg.setName("PKG01");

		// Concrete Entity - 01
		ConcreteEntity entity01 = FACTORY.createConcreteEntity();
		entity01.setName("ENT01");
		entity01.setAbstract(true);

		DataType strDt = createDataType("String");
		entity01.getAttributes().add(createAttribute("ATT01", strDt, false, false));
		DataType boolDt = createDataType("Boolean");
		entity01.getAttributes().add(createAttribute("ATT02", boolDt, true, false));

		// Concrete Entity - 02
		ConcreteEntity entity02 = FACTORY.createConcreteEntity();
		entity02.setName("ENT02");
		entity02.setSuperEntity(entity01);

		entity02.getAttributes().add(createAttribute("ATT21", strDt, false, false));
		DataType intDt = createDataType("Integer");
		entity02.getAttributes().add(createAttribute("ATT22", intDt, true, false));

		// Enumeration Entity
		Enumeration enum01 = FACTORY.createEnumeration();
		enum01.setName("ENUM1");

		enum01.getLiterals().add(createLiteral("L1"));
		enum01.getLiterals().add(createLiteral("L2"));
		enum01.getLiterals().add(createLiteral("L3"));

		pkg.getEntities().add(entity01);
		pkg.getEntities().add(entity02);
		pkg.getEntities().add(enum01);

		// Attribute
		entity02.getAttributes().add(createAttribute("ATT23", enum01, false, false));
		entity02.getAttributes().add(createAttribute("ATT24", entity01, false, false));

		// Create and Save resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("./model/entities.xmi"));
		resource.getContents().add(pkg);
		resource.getContents().add(strDt);
		resource.getContents().add(boolDt);
		resource.getContents().add(intDt);
		resource.save(null);
	}

	private Attribute createAttribute(String name, DataType dataType, boolean trans, boolean vol) {
		Attribute attribute = FACTORY.createAttribute();
		attribute.setName(name);
		attribute.setDatatype(dataType);
		attribute.setTransient(trans);
		attribute.setVolatile(vol);
		return attribute;
	}

	private DataType createDataType(String name) {
		DataType dataType = FACTORY.createDataType();
		dataType.setName(name);
		return dataType;
	}

	private Literal createLiteral(String name) {
		Literal literal = FACTORY.createLiteral();
		literal.setName(name);
		return literal;
	}

	public static void main(String[] args) {
		try {
			new ResourceCreationHelper().createAndSaveResource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
