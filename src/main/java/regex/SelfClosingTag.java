package regex;

public class SelfClosingTag {
    public static void main(String[] args) {
        String xml = "<ns:tag namespace=\"aaa bbb ccc\"></tag><tag ns:namespace = \"всякая хрень\">123</ns3:tag>";
        System.out.println("xml:");
        System.out.println(removeXmlStringNamespaceAndPreamble(xml)); //
    }

    public static String removeXmlStringNamespaceAndPreamble(String xmlString) {
        return xmlString.replaceAll("(<\\?[^<]*\\?>)?", "")/* remove preamble */
                .replaceAll("[\\w]+:(?!:)", "")/* remove prefix */
                .replaceAll("\s+namespace.*?(\"|\').*?(\"|\')", "") /* remove namespace declaration */
                .replaceAll("(<)(\\w+:)(.*?>)", "$1$3") /* remove opening tag prefix */
                .replaceAll("(</)(\\w+:)(.*?>)", "$1$3"); /* remove closing tags prefix */
    }
}
