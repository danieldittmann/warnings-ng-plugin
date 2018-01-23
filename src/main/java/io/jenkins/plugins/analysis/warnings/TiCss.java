package io.jenkins.plugins.analysis.warnings;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.TiCcsParser;
import io.jenkins.plugins.analysis.core.model.DefaultLabelProvider;
import io.jenkins.plugins.analysis.core.model.StaticAnalysisLabelProvider;
import io.jenkins.plugins.analysis.core.model.StaticAnalysisTool;

import hudson.Extension;

/**
 * Provides a parser and customized messages for the Texas Instruments Code Composer Studio compiler.
 *
 * @author Ullrich Hafner
 */
@Extension
public class TiCss extends StaticAnalysisTool {
    static final String ID = "code-composer";
    private static final String PARSER_NAME = Messages.Warnings_TexasI_ParserName();

    @Override
    public IssueParser createParser() {
return new TiCcsParser();
}

    @Override
    public StaticAnalysisLabelProvider getLabelProvider() {
        return new DefaultLabelProvider(ID, PARSER_NAME);
   }
}
