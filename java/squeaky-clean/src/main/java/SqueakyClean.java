import java.lang.Character;
class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(" ", "_");
        identifier = identifier.replace("\\", "CTRL");
        identifier = identifier.replace("-", "");
        identifier = identifier.replaceAll("[Α-Ωα-ω]", "");
        identifier = identifier.replaceAll("[a-zA-Z]+$", "");
        return identifier;
    }
}
