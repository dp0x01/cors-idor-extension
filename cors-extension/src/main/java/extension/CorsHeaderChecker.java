package extension;

import org.zaproxy.zap.extension.script.ExtensionScript;
import org.zaproxy.zap.extension.script.ScriptWrapper;

public class CorsHeaderChecker extends ExtensionScript {

    @Override
    public void init() {
        ScriptWrapper wrapper = new ScriptWrapper();
        wrapper.setExtension(this);
        wrapper.setScriptName("CORS Header Checker");
        wrapper.setDescription("Checks for Cross-Origin Resource Sharing (CORS) related headers in request headers.");
        this.addScript(wrapper);
    }

    @Override
    public String getName() {
        return "CORS Header Checker";
    }
}
