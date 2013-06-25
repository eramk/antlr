/*------------------------------------------------------------------------------
 *******************************************************************************
Set<String>  num  =  new  HashSet<String>();
num.add("1");
num.add("2"); * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.ne;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String command = "All on RNC1 RNC2-5";
		ANTLRStringStream stream = new ANTLRStringStream(command);
		SearchQueryLexer lexer = new SearchQueryLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		SearchQueryParser parser = new SearchQueryParser(tokens);
try {
	System.out.println("SC: "+ parser.query().scq);
} catch (RecognitionException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}

