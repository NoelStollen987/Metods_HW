import java.util.Scanner;

public class StudentGrader {
    public static String calcGrade(int sc) {
        if (sc < 0 || sc > 100)
            return "Impossible score";
        else if (sc >= 90)
            return "A";
        else if (sc >= 80)
            return "B";
        else if (sc >= 70)
            return "C";
        else if (sc >= 60)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score = scan.nextInt();
        String gr = calcGrade(score);
        System.out.print("нour grade is " + gr);
    }

}
