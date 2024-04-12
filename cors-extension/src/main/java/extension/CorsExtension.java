package extension;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorsExtension {

    private static final String CORS_REGEX = "(?i)(access-control-allow-origin|access-control-allow-methods|access-control-allow-headers)";

    public static List<String> checkForCorsHeaders(String requestHeaders) {
        List<String> corsHeaders = new ArrayList<>();
        Pattern pattern = Pattern.compile(CORS_REGEX);
        Matcher matcher = pattern.matcher(requestHeaders);
        while (matcher.find()) {
            corsHeaders.add(matcher.group());
        }
        return corsHeaders;
    }
}
