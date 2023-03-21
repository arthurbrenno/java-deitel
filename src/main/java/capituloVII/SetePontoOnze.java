package capituloVII;

public class SetePontoOnze {
    private static int[] counts = new int[10];
    private static int[] bonus = new int[15];
    public static int[] bestScores = new int[5];
    public static void main(String[] args) {
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }
        for (int i = 0; i < bestScores.length; i++) {
            bestScores[i] = 0;
        }
        String[] bestScoresArray = new String[bestScores.length + 1];
        for (int i = 0; i < bestScoresArray.length; i++) {
            if (i != 0 && i != bestScoresArray.length - 1) {
                bestScoresArray[i] = String.valueOf(bestScores[i]);
            }
            else if (i == 0) {
                bestScoresArray[i] = "[";
            }
            else {
                bestScoresArray[i] = "]";
            }
        }    
        for (String element : bestScoresArray) {
            System.out.print(element + " ");
        }
    }
}
