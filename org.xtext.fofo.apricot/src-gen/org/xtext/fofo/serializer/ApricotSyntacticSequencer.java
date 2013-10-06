package org.xtext.fofo.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.fofo.services.ApricotGrammarAccess;

@SuppressWarnings("all")
public class ApricotSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ApricotGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AbstractMethod_BuiltInModifierParserRuleCall_1_q;
	protected AbstractElementAlias match_AbstractMethod_ModifierParserRuleCall_0_q;
	protected AbstractElementAlias match_AdditiveExpression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0;
	protected AbstractElementAlias match_Class_ModifierParserRuleCall_0_q;
	protected AbstractElementAlias match_EqualityExpression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1;
	protected AbstractElementAlias match_IdentifierSuffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_3_0_ThisKeyword_1_3_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__;
	protected AbstractElementAlias match_Interface_ModifierParserRuleCall_0_q;
	protected AbstractElementAlias match_Method_ModifierParserRuleCall_0_q;
	protected AbstractElementAlias match_MultiplicativeExpression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1;
	protected AbstractElementAlias match_UnaryExpression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ApricotGrammarAccess) access;
		match_AbstractMethod_BuiltInModifierParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getAbstractMethodAccess().getBuiltInModifierParserRuleCall_1());
		match_AbstractMethod_ModifierParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getAbstractMethodAccess().getModifierParserRuleCall_0());
		match_AdditiveExpression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0()));
		match_Class_ModifierParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getModifierParserRuleCall_0());
		match_EqualityExpression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEqualityExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getEqualityExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1()));
		match_IdentifierSuffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_3_0_ThisKeyword_1_3_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getClassKeyword_1_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_3_0()), new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getThisKeyword_1_3_1()))), new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getLeftSquareBracketKeyword_1_0_0_0()), new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getRightSquareBracketKeyword_1_0_0_1())), new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getIdentifierSuffixAccess().getClassKeyword_1_0_2())));
		match_Interface_ModifierParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getInterfaceAccess().getModifierParserRuleCall_0());
		match_Method_ModifierParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getModifierParserRuleCall_0());
		match_MultiplicativeExpression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMultiplicativeExpressionAccess().getPercentSignKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_0_1()));
		match_UnaryExpression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getUnaryExpressionAccess().getHyphenMinusHyphenMinusKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getUnaryExpressionAccess().getPlusSignPlusSignKeyword_2_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getABSTRACT_CONDTIONRule())
			return getABSTRACT_CONDTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAMOUNTRule())
			return getAMOUNTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASYACTIONSRule())
			return getASYACTIONSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBuiltInModifierRule())
			return getBuiltInModifierToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getModifierRule())
			return getModifierToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ABSTRACT_CONDTION:
	 * 	'Condition' "{" "}" ";"
	 * ;
	 */
	protected String getABSTRACT_CONDTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Condition{};";
	}
	
	/**
	 * AMOUNT:
	 * 	AMOUNT_GEONE | AMOUNT_ONE_OR_ZERO
	 * ;
	 */
	protected String getAMOUNTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "1..*";
	}
	
	/**
	 * terminal ASYACTIONS:
	 * 	"(" "?" "|" "!" ")"
	 * ;
	 */
	protected String getASYACTIONSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(?|!)";
	}
	
	/**
	 * BuiltInModifier:
	 * 	'Native'
	 * ;
	 */
	protected String getBuiltInModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Native";
	}
	
	/**
	 * Modifier:
	 * 	'public' | 'private'
	 * ;
	 */
	protected String getModifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "public";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AbstractMethod_BuiltInModifierParserRuleCall_1_q.equals(syntax))
				emit_AbstractMethod_BuiltInModifierParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractMethod_ModifierParserRuleCall_0_q.equals(syntax))
				emit_AbstractMethod_ModifierParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AdditiveExpression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0.equals(syntax))
				emit_AdditiveExpression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_ModifierParserRuleCall_0_q.equals(syntax))
				emit_Class_ModifierParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EqualityExpression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1.equals(syntax))
				emit_EqualityExpression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IdentifierSuffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_3_0_ThisKeyword_1_3_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__.equals(syntax))
				emit_IdentifierSuffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_3_0_ThisKeyword_1_3_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Interface_ModifierParserRuleCall_0_q.equals(syntax))
				emit_Interface_ModifierParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Method_ModifierParserRuleCall_0_q.equals(syntax))
				emit_Method_ModifierParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultiplicativeExpression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1.equals(syntax))
				emit_MultiplicativeExpression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnaryExpression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a.equals(syntax))
				emit_UnaryExpression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     BuiltInModifier?
	 */
	protected void emit_AbstractMethod_BuiltInModifierParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Modifier?
	 */
	protected void emit_AbstractMethod_ModifierParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-' | '+'
	 */
	protected void emit_AdditiveExpression_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Modifier?
	 */
	protected void emit_Class_ModifierParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!=' | '=='
	 */
	protected void emit_EqualityExpression_EqualsSignEqualsSignKeyword_1_0_0_or_ExclamationMarkEqualsSignKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('[' ']')+ '.' 'class') | (('.' 'class') | ('.' 'this'))
	 */
	protected void emit_IdentifierSuffix_____FullStopKeyword_1_2_0_ClassKeyword_1_2_1___or___FullStopKeyword_1_3_0_ThisKeyword_1_3_1_____or_____LeftSquareBracketKeyword_1_0_0_0_RightSquareBracketKeyword_1_0_0_1__p_FullStopKeyword_1_0_1_ClassKeyword_1_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Modifier?
	 */
	protected void emit_Interface_ModifierParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Modifier?
	 */
	protected void emit_Method_ModifierParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '%' | '/' | '*'
	 */
	protected void emit_MultiplicativeExpression_AsteriskKeyword_1_0_0_or_PercentSignKeyword_1_0_2_or_SolidusKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('++' | '--' | '+' | '-')*
	 */
	protected void emit_UnaryExpression___HyphenMinusHyphenMinusKeyword_3_0_or_HyphenMinusKeyword_1_0_or_PlusSignKeyword_0_0_or_PlusSignPlusSignKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
