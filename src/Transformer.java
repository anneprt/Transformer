public class Transformer {
    public static void main(String[] args) {
        String phrase = "Qui dort ";
        String verbe = "dine";
        String p1 = "", p2 = "", p3 = "", p4 = "";
        int nombreCaracteres;
        System.out.println("1 : " + phrase);
        System.out.println("2 : " + verbe);
        p1 = phrase.toUpperCase();
        System.out.println("En majuscule : " + p1);
        p2 = phrase.toLowerCase();
        System.out.println("En minuscule : " + p2);
        p3 = phrase.concat(verbe);
        nombreCaracteres = p3.length();
        System.out.print("Après concat() : ");
        System.out.println(p3 + " possède : " + nombreCaracteres + " caractères");
        p4 = p3.replace('i', 'a');
        System.out.println("Après replace() : " + p3 + " devient : " + p4);
    }
}
