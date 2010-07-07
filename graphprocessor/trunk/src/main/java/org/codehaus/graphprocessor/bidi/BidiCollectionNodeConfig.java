/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2010 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package org.codehaus.graphprocessor.bidi;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.codehaus.graphprocessor.PropertyConfig;
import org.codehaus.graphprocessor.impl.AbstractNodeProcessor;
import org.codehaus.graphprocessor.impl.CollectionNodeProcessor;



public class BidiCollectionNodeConfig extends DefaultBidiNodeConfig
{
	private static final AbstractNodeProcessor DEFAULT_NODE_PROCESSOR = new CollectionNodeProcessor();

	public BidiCollectionNodeConfig(final BidiGraphConfig graphConfig)
	{
		super(graphConfig);
		setType(Collection.class);
		setProcessor(DEFAULT_NODE_PROCESSOR);

		//		setSourceConfig(new DefaultNodeConfig(Collection.class));
		//		setTargetConfig(new DefaultNodeConfig(Collection.class));


		setVirtual(true);
		setInitialized(true);
	}

	@Override
	public Map<String, PropertyConfig> getProperties()
	{
		return Collections.EMPTY_MAP;
	}



	@Override
	public boolean initializeNode()
	{
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see de.hybris.platform.webservices.util.objectgraphtransformer.bidi.BidiNodeConfig#getTargetNodeConfig()
	 */
	@Override
	public BidiNodeConfig getTargetNodeConfig()
	{
		return this;
	}


}
