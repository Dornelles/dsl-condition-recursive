/*
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import zbr.test.condition.ide.contentassist.antlr.internal.InternalConditionParser;
import zbr.test.condition.services.ConditionGrammarAccess;

public class ConditionParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ConditionGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ConditionGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getLogicalOpeartorAccess().getAlternatives(), "rule__LogicalOpeartor__Alternatives");
			builder.put(grammarAccess.getCompositeConditionAccess().getAlternatives_1_1(), "rule__CompositeCondition__Alternatives_1_1");
			builder.put(grammarAccess.getNegationAccess().getAlternatives(), "rule__Negation__Alternatives");
			builder.put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
			builder.put(grammarAccess.getSessionIntervalAccess().getAlternatives(), "rule__SessionInterval__Alternatives");
			builder.put(grammarAccess.getMessageContentAccess().getAlternatives(), "rule__MessageContent__Alternatives");
			builder.put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
			builder.put(grammarAccess.getWeekDayAccess().getAlternatives(), "rule__WeekDay__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup(), "rule__CompositeCondition__Group__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup_1(), "rule__CompositeCondition__Group_1__0");
			builder.put(grammarAccess.getNegationAccess().getGroup_1(), "rule__Negation__Group_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup_0(), "rule__Term__Group_0__0");
			builder.put(grammarAccess.getTimeIntervalAccess().getGroup(), "rule__TimeInterval__Group__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_0(), "rule__SessionInterval__Group_0__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_0_0(), "rule__SessionInterval__Group_0_0__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_1(), "rule__SessionInterval__Group_1__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_2(), "rule__SessionInterval__Group_2__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_2_0(), "rule__SessionInterval__Group_2_0__0");
			builder.put(grammarAccess.getTimeoutAccess().getGroup(), "rule__Timeout__Group__0");
			builder.put(grammarAccess.getMaxNumberOfOperationAccess().getGroup(), "rule__MaxNumberOfOperation__Group__0");
			builder.put(grammarAccess.getWeekDaysIntervalAccess().getGroup(), "rule__WeekDaysInterval__Group__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_0(), "rule__MessageContent__Group_0__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_1(), "rule__MessageContent__Group_1__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_2(), "rule__MessageContent__Group_2__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_3(), "rule__MessageContent__Group_3__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getModelAccess().getConditionAssignment_0(), "rule__Model__ConditionAssignment_0");
			builder.put(grammarAccess.getModelAccess().getConditionalExpressionAssignment_1(), "rule__Model__ConditionalExpressionAssignment_1");
			builder.put(grammarAccess.getConditionalExpressionAccess().getBeforeSymbolAssignment_0(), "rule__ConditionalExpression__BeforeSymbolAssignment_0");
			builder.put(grammarAccess.getConditionalExpressionAccess().getConditionParamAssignment_3(), "rule__ConditionalExpression__ConditionParamAssignment_3");
			builder.put(grammarAccess.getConditionalExpressionAccess().getConditionAssignment_7(), "rule__ConditionalExpression__ConditionAssignment_7");
			builder.put(grammarAccess.getConditionalExpressionAccess().getAftetrSymbolAssignment_9(), "rule__ConditionalExpression__AftetrSymbolAssignment_9");
			builder.put(grammarAccess.getLogicalOpeartorAccess().getSymbolAssignment_0(), "rule__LogicalOpeartor__SymbolAssignment_0");
			builder.put(grammarAccess.getLogicalOpeartorAccess().getSymbolAssignment_1(), "rule__LogicalOpeartor__SymbolAssignment_1");
			builder.put(grammarAccess.getCompositeConditionAccess().getSymbolAssignment_1_1_0(), "rule__CompositeCondition__SymbolAssignment_1_1_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getSymbolAssignment_1_1_1(), "rule__CompositeCondition__SymbolAssignment_1_1_1");
			builder.put(grammarAccess.getCompositeConditionAccess().getRightAssignment_1_2(), "rule__CompositeCondition__RightAssignment_1_2");
			builder.put(grammarAccess.getNegationAccess().getSymbolAssignment_1_1(), "rule__Negation__SymbolAssignment_1_1");
			builder.put(grammarAccess.getNegationAccess().getConditionAssignment_1_2(), "rule__Negation__ConditionAssignment_1_2");
			builder.put(grammarAccess.getTimeIntervalAccess().getStartAssignment_2(), "rule__TimeInterval__StartAssignment_2");
			builder.put(grammarAccess.getTimeIntervalAccess().getEndAssignment_4(), "rule__TimeInterval__EndAssignment_4");
			builder.put(grammarAccess.getSessionIntervalAccess().getFrequencyAssignment_0_0_2(), "rule__SessionInterval__FrequencyAssignment_0_0_2");
			builder.put(grammarAccess.getSessionIntervalAccess().getTimeUnitAssignment_0_0_3(), "rule__SessionInterval__TimeUnitAssignment_0_0_3");
			builder.put(grammarAccess.getSessionIntervalAccess().getMessagecontentAssignment_0_0_5(), "rule__SessionInterval__MessagecontentAssignment_0_0_5");
			builder.put(grammarAccess.getSessionIntervalAccess().getFrequencyAssignment_1_2(), "rule__SessionInterval__FrequencyAssignment_1_2");
			builder.put(grammarAccess.getSessionIntervalAccess().getTimeUnitAssignment_1_3(), "rule__SessionInterval__TimeUnitAssignment_1_3");
			builder.put(grammarAccess.getSessionIntervalAccess().getFrequencyAssignment_2_0_2(), "rule__SessionInterval__FrequencyAssignment_2_0_2");
			builder.put(grammarAccess.getSessionIntervalAccess().getTimeUnitAssignment_2_0_3(), "rule__SessionInterval__TimeUnitAssignment_2_0_3");
			builder.put(grammarAccess.getSessionIntervalAccess().getValueAssignment_2_0_5(), "rule__SessionInterval__ValueAssignment_2_0_5");
			builder.put(grammarAccess.getTimeoutAccess().getValueAssignment_2(), "rule__Timeout__ValueAssignment_2");
			builder.put(grammarAccess.getMaxNumberOfOperationAccess().getOperationsNumberAssignment_2(), "rule__MaxNumberOfOperation__OperationsNumberAssignment_2");
			builder.put(grammarAccess.getMaxNumberOfOperationAccess().getTimeUnitAssignment_4(), "rule__MaxNumberOfOperation__TimeUnitAssignment_4");
			builder.put(grammarAccess.getWeekDaysIntervalAccess().getStartAssignment_2(), "rule__WeekDaysInterval__StartAssignment_2");
			builder.put(grammarAccess.getWeekDaysIntervalAccess().getEndAssignment_4(), "rule__WeekDaysInterval__EndAssignment_4");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_0_2(), "rule__MessageContent__ContentAssignment_0_2");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_1_2(), "rule__MessageContent__ContentAssignment_1_2");
			builder.put(grammarAccess.getMessageContentAccess().getTimeUnitAssignment_1_4(), "rule__MessageContent__TimeUnitAssignment_1_4");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_2_2(), "rule__MessageContent__ContentAssignment_2_2");
			builder.put(grammarAccess.getMessageContentAccess().getComparisonOperatorAssignment_2_3(), "rule__MessageContent__ComparisonOperatorAssignment_2_3");
			builder.put(grammarAccess.getMessageContentAccess().getValueAssignment_2_4(), "rule__MessageContent__ValueAssignment_2_4");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_3_2(), "rule__MessageContent__ContentAssignment_3_2");
			builder.put(grammarAccess.getMessageContentAccess().getComparisonOperatorAssignment_3_3(), "rule__MessageContent__ComparisonOperatorAssignment_3_3");
			builder.put(grammarAccess.getMessageContentAccess().getValueAssignment_3_4(), "rule__MessageContent__ValueAssignment_3_4");
			builder.put(grammarAccess.getMessageContentAccess().getTimeUnitAssignment_3_6(), "rule__MessageContent__TimeUnitAssignment_3_6");
			builder.put(grammarAccess.getComparisonOperatorAccess().getSymbolAssignment_0(), "rule__ComparisonOperator__SymbolAssignment_0");
			builder.put(grammarAccess.getComparisonOperatorAccess().getSymbolAssignment_1(), "rule__ComparisonOperator__SymbolAssignment_1");
			builder.put(grammarAccess.getComparisonOperatorAccess().getSymbolAssignment_2(), "rule__ComparisonOperator__SymbolAssignment_2");
			builder.put(grammarAccess.getComparisonOperatorAccess().getSymbolAssignment_3(), "rule__ComparisonOperator__SymbolAssignment_3");
			builder.put(grammarAccess.getComparisonOperatorAccess().getSymbolAssignment_4(), "rule__ComparisonOperator__SymbolAssignment_4");
			builder.put(grammarAccess.getComparisonOperatorAccess().getSymbolAssignment_5(), "rule__ComparisonOperator__SymbolAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ConditionGrammarAccess grammarAccess;

	@Override
	protected InternalConditionParser createParser() {
		InternalConditionParser result = new InternalConditionParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ConditionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConditionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
