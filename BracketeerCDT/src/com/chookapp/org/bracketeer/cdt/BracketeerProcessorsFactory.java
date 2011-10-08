/*******************************************************************************
 * Copyright (c) Gil Barash - chookapp@yahoo.com
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gil Barash - initial API and implementation
 *    
 *******************************************************************************/

package com.chookapp.org.bracketeer.cdt;

import com.chookapp.org.bracketeer.extensionpoint.BracketeerProcessor;
import com.chookapp.org.bracketeer.extensionpoint.IBracketeerProcessorsFactory;

import org.eclipse.ui.IEditorPart;

public class BracketeerProcessorsFactory implements
		IBracketeerProcessorsFactory 
{

	public BracketeerProcessorsFactory() 
	{
	}

	@Override
	public BracketeerProcessor createProcessorFor(IEditorPart part) 
	{
		if( part.getClass().getName().contains("CEditor") )
		    return new BracketeerCdtProcessor(part);
		
		return null;
	}

}
