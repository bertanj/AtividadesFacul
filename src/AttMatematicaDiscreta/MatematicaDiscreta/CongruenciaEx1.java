package AttMatematicaDiscreta.MatematicaDiscreta;

public class CongruenciaEx1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(((i - 6)%13) == 0){
                System.out.println("O número " + i + " é congruente a 6 mod 13!");

            }
        }
    }
}
