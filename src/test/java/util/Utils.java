package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    private static final String PATTERN_DOUBLE = "\\d+[.]\\d+";

    public static Double getDoubleCost(String costString) {
        costString = costString.replaceAll(",", "");
        Double costDouble = null;
        Pattern pattern = Pattern.compile(PATTERN_DOUBLE);
        Matcher matcher = pattern.matcher(costString);
        if (matcher.find()) {
            try {
                costDouble = Double.parseDouble(matcher.group(0));
            } catch (NumberFormatException e) {
                System.out.println("Total cost isn't a number");
            }
        }
        return costDouble;
    }

    public static boolean checkConditionsOfCorrectCost(Double cost) {
        return cost != null && cost > 0;
    }
}
