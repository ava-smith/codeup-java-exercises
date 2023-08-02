import java.util.Scanner;

public class JavaStringBonuses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Date Format Converter Program
        System.out.println("Enter a date MM/DD/YYYY");
        String userDate = scanner.next();
        String month = userDate
                .trim()
                .substring(0, 2);
        String date = userDate
                .trim()
                .substring(3, 5);
        String year = userDate
                .trim()
                .substring(6, 10);
        switch (month) {
            case "01" -> System.out.printf("January %s, %s", date, year);
            case "02" -> System.out.printf("February %s, %s", date, year);
            case "03" -> System.out.printf("March %s, %s", date, year);
            case "04" -> System.out.printf("April %s, %s", date, year);
            case "05" -> System.out.printf("May %s, %s", date, year);
            case "06" -> System.out.printf("June %s, %s", date, year);
            case "07" -> System.out.printf("July %s, %s", date, year);
            case "08" -> System.out.printf("August %s, %s", date, year);
            case "09" -> System.out.printf("September %s, %s", date, year);
            case "10" -> System.out.printf("October %s, %s", date, year);
            case "11" -> System.out.printf("November %s, %s", date, year);
            case "12" -> System.out.printf("December %s, %s", date, year);
        }
        // Sentence Analyzer Program
    }
}
