public class testing {
    public static void main(String[] args) {
        char harf ='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalın harftir.Girdiğiniz harf:"+harf);
                break;
            default:
                System.out.println("İnce harftir.Girdiğiniz harf."+harf);
        }

    }
}
