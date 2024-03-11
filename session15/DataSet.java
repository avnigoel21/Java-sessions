import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
    private ArrayList<DataRow>rows;
    private int numIndependentVariables;

    public DataSet(String fileName) {
        rows = new ArrayList<>();
        readFile(fileName);
    }

    private void readFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            String headerLine = scanner.nextLine();
            String[] headers = headerLine.split(",\\s*");
            numIndependentVariables = headers.length - 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",\\s*");

                if (values.length >= headers.length) {
                    double y = Double.parseDouble(values[0]);
                    double[] x = new double[numIndependentVariables];

                    for (int i = 1; i < values.length; i++) {
                        x[i - 1] = Double.parseDouble(values[i]);
                    }

                    rows.add(new DataRow(y, x));
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<DataRow> getRows() {
        return rows;
    }

    public int getNumIndependentVariables() {
        return numIndependentVariables;
    }
}
