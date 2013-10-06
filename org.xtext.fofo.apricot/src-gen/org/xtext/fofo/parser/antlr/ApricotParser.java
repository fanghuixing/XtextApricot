/*
* generated by Xtext
*/
package org.xtext.fofo.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.fofo.services.ApricotGrammarAccess;

public class ApricotParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ApricotGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.fofo.parser.antlr.internal.InternalApricotParser createParser(XtextTokenStream stream) {
		return new org.xtext.fofo.parser.antlr.internal.InternalApricotParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public ApricotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ApricotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
