package exercicios;

public class Exer7 {
    public static void main(String[] args) {
        for (int ct = 1; ct <= 5 ; ct++) {
            System.out.println("For 1 - " + ct);
            for (int ct2 = 1; ct2 <= 5 ; ct2++) {
                System.out.println("For 2 - " + ct2);
                if(ct2 == 3){
                    break;
                }
            }
        }

    }
}
