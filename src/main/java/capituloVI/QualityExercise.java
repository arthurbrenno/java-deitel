
package capituloVI;
public class QualityExercise {
    public static void main(String[] args) {
        for(int i = 50; i < 100; i+=10) {
            System.out.printf("MEDIA>> [%d] -> %d%n", i, qualityPoints(i));
        }
    }
    
    public static int qualityPoints(double media) {
        if(media >= 90 && media <=100) { return 4; }
        else if (media >=80 && media<=89) { return 3; }
        else if (media >=70 && media<=79) { return 2; }
        else if (media >= 60 && media<=69) { return 1; }
        else { return 0; }
    }
}
