/*
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import zbr.test.condition.services.ConditionGrammarAccess;

@SuppressWarnings("all")
public class ConditionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ConditionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Term_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Term_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ConditionGrammarAccess) access;
		match_Term_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
		match_Term_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Term_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Term_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Term_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Term_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'MaxNumberOfOperation' '(' operationsNumber=INT
	 *     (rule start) (ambiguity) 'MessageContent' '(' content=STRING
	 *     (rule start) (ambiguity) 'SessionInterval' '(' frequency=INT
	 *     (rule start) (ambiguity) 'TimeInterval' '(' start=STRING
	 *     (rule start) (ambiguity) 'Timeout' '(' value=STRING
	 *     (rule start) (ambiguity) 'WeekDaysInterval' '(' start=WeekDay
	 *     (rule start) (ambiguity) symbol='NOT'
	 *     (rule start) (ambiguity) {BinaryTermOperator.left=}
	 
	 * </pre>
	 */
	protected void emit_Term_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) symbol='NOT'
	 *     (rule start) (ambiguity) {BinaryTermOperator.left=}
	 
	 * </pre>
	 */
	protected void emit_Term_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
