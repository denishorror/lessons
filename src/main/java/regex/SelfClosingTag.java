package regex;

import lombok.AllArgsConstructor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelfClosingTag {
    public static void main(String[] args) {
        String xml = """
                <ns:tag xmlns="aaa bbb ccc"></tag>"
                "<tag ns:xmlns = "всякая хрень">123</ns3:tag>"
                "<ns22:PSK xmlns:ns22="http://www.rshb.ru/cdm/cft/get_person_liabilities/201711/resp">13.477</ns22:PSK>"
                "<RepaymentScheme>Аннуитетные</RepaymentScheme>"
                "<ns22:PDNScheduledRepaymentDate xmlns:ns22="http://www.rshb.ru/cdm/cft/get_person_liabilities/201711/resp">2024-06-25</ns22:PDNScheduledRepaymentDate>
                """;
        System.out.println("xml:");
        System.out.println(removeXmlStringNamespaceAndPreamble(xml)); //
    }

    public static String removeXmlStringNamespaceAndPreamble(String xmlString) {
//        return xmlString
//                .replaceAll("(<\\?[^<]*\\?>)?", "")/* remove preamble */
//                .replaceAll("\s+[\\w]+:(?!:)+xmlns.*?(\"|\').*?(\"|\')", "") /* remove xmlns declaration */
////                .replaceAll("[\\w]+:(?!:)", "")/* remove prefix */
//                .replaceAll("\s+xmlns.*?(\"|\').*?(\"|\')", "")  /* remove xmlns declaration without prefix*/
//                .replaceAll("(<)(\\w+:)(.*?>)", "$1$3") /* remove opening tag prefix */
//                .replaceAll("(</)(\\w+:)(.*?>)", "$1$3") /* remove closing tags prefix */
//                .replaceAll("<(\\w+).*?></(\\w+).*?>","<$1/>");

        List<XMLPatterns> patterns = new ArrayList<>();
        patterns.add(new XMLPatterns("(<\\?[^<]*\\?>)?", ""));
        patterns.add(new XMLPatterns("\s+[\\w]+:(?!:)+xmlns.*?(\"|\').*?(\"|\')", ""));
        patterns.add(new XMLPatterns("\s+xmlns.*?(\"|\').*?(\"|\')", ""));
        patterns.add(new XMLPatterns("(<)(\\w+:)(.*?>)", "$1$3"));
        patterns.add(new XMLPatterns("(</)(\\w+:)(.*?>)", "$1$3"));
        patterns.add(new XMLPatterns("<(\\w+).*?></(\\w+).*?>", "<$1/>"));

        for (XMLPatterns pattern : patterns) {
            xmlString = Pattern.compile(pattern.regEx)
                    .matcher(xmlString)
                    .replaceAll(pattern.replacement);
        }

        return xmlString;
    }

    @AllArgsConstructor
    private static class XMLPatterns {
        String regEx;
        String replacement;
    }
}
