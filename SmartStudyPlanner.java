import java.util.*;

class Subject {
    String name;
    int difficulty;

    Subject(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }
}

public class SmartStudyPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter subject name: ");
            String name = sc.nextLine();

         
   System.out.print("Enter difficulty (1=Easy, 2=Medium, 3=Hard): ");
            int difficulty = sc.nextInt();
            sc.nextLine();

            subjects.add(new Subject(name, difficulty));
        }

        System.out.print("\nEnter number of days left for exam: ");
        int days = sc.nextInt();

        Collections.sort(subjects, (a, b) -> b.difficulty - a.difficulty);

        System.out.println("\nGenerated Study Plan:\n");

        int index = 0;

        for (int day = 1; day <= days; day++) {
            System.out.println("Day " + day + ":");

            for (int j = 0; j < 2; j++) {
                if (index >= subjects.size()) {
                    index = 0;
                }

                System.out.println(" - " + subjects.get(index).name);
              
                 index++;
            }
        }

        System.out.println("\nPlan Generated Successfully!");
        sc.close();
    }
}
