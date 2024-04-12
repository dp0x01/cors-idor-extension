package extension;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdorExtension {

    private static final String IDOR_REGEX = "(?i)(authorization|cookie|referer)";

    public static List<String> checkForIdorHeaders(String requestHeaders) {
        List<String> idorHeaders = new ArrayList<>();
        Pattern pattern = Pattern.compile(IDOR_REGEX);
        Matcher matcher = pattern.matcher(requestHeaders);
        while (matcher.find()) {
            idorHeaders.add(matcher.group());
        }
        return idorHeaders;
    }
}
