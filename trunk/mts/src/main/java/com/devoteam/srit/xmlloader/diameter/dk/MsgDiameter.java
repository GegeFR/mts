/* 
 * Copyright 2012 Devoteam http://www.devoteam.com
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * 
 * This file is part of Multi-Protocol Test Suite (MTS).
 * 
 * Multi-Protocol Test Suite (MTS) is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the
 * License.
 * 
 * Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Multi-Protocol Test Suite (MTS).
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.devoteam.srit.xmlloader.diameter.dk;

import com.devoteam.srit.xmlloader.diameter.MsgDiamCommon;
import com.devoteam.srit.xmlloader.core.protocol.Stack;
import dk.i1.diameter.Message;

/**
 *
 * @author gpasquiers
 */
public class MsgDiameter extends MsgDiamCommon
{
        
    /** Creates a new instance */
    public MsgDiameter(Stack stack)
    {
    	super(stack);
    }
    
    /** Creates a new instance */
    public MsgDiameter(Stack stack, Message aMessage)
    {
        super(stack, aMessage);
    }

}