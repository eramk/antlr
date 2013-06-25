/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.ne;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;

public class NETokens extends CommonToken {
	public NETokens(CharStream input, int type, int channel, int start, int stop) {
	    super(input, type, channel, start, stop);
	  }

	  // your custom method
	public String customString(){
		return "Custom Token";
	}
	  public long toLong() {
	    String text = super.getText();
	    int radix = text.startsWith("0x") ? 16 : 10;
	    if(radix == 16) text = text.substring(2);
	    return Long.parseLong(text, radix);
	  }
}
