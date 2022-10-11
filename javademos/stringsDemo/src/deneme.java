public class deneme {
    public static void main(String[] args) {
        String mesaj="Aysuyu çok seviyorum.";

        System.out.println(mesaj);
        System.out.println("Eleman Sayısı: "+mesaj.length());
        System.out.println("5.Eleman: "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Beraberiz!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler= new char[9];
        mesaj.getChars(0,9,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ç"));
        System.out.println(mesaj.lastIndexOf("ç/**/"));

    }
}
