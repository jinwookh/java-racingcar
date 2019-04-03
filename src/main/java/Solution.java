import domain.InputReport;
import java.util.Vector;

public class Solution {

    public static void main(String[] args) {

        String s;
        String[] sarray;
        Boolean bool;
        Vector<String> vector;
        int count;
        Vector<InputReport> reports;
        InputReport error;

        s = InputHandler.getInput();
        vector = InputHandler.parse(s, ",");

        System.out.print("size: ");
        System.out.println(vector.size());
        for(int i = 0; i < vector.size(); i++) {
            s = vector.get(i);
            System.out.println(s);
        }

        count = InputHandler.countName("car",vector);
        System.out.println(count);
        reports = InputReportHandler.gatherReports(vector, 5);
        for (InputReport report : reports
             ) {
            System.out.println(report);
        }

        error = InputReportHandler.findErrorReport(reports);
        System.out.print("Error:");
        System.out.println(error);
    }

}
