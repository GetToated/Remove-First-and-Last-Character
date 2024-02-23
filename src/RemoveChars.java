public class RemoveChars {
    public static String remove(String str) {
        String noCharacter = str.substring(1);
        String noCharacter2 = noCharacter.substring(0, noCharacter.length() - 1);
        return noCharacter2;
    }
    public static void main(String[] args) {
        String str = "Lucas";
        String resultado = remove(str);
        System.out.println(resultado);
    }
}