/*
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ConditionAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("zbr/test/condition/parser/antlr/internal/InternalCondition.tokens");
	}
}
