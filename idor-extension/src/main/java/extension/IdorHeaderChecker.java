package extension;

import org.zaproxy.zap.extension.script.ExtensionScript;
import org.zaproxy.zap.extension.script.ScriptWrapper;

public class IdorHeaderChecker extends ExtensionScript {

    @Override
    public void init() {
        ScriptWrapper wrapper = new ScriptWrapper();
        wrapper.setExtension(this);
        wrapper.setScriptName("IDOR Header Checker");
        wrapper.setDescription("Checks for IDOR-related headers in request headers.");
        this.addScript(wrapper);
    }

    @Override
    public String getName() {
        return "IDOR Header Checker";
    }
}
