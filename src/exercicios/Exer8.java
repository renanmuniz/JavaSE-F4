package exercicios;

public class Exer8 {
    public static void main(String[] args) {
        Loop1 : for (int ct = 1; ct <= 5 ; ct++) {
            System.out.println("For 1 - " + ct);
            Loop2 : for (int ct2 = 1; ct2 <= 5 ; ct2++) {
                System.out.println("For 2 - " + ct2);
                if(ct2 == 3){
                    break Loop1;

                }
            }
        }
    }
}
