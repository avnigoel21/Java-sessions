public class Main {
    public static void main(String[] args) {
        
        DataSet dataSet = new DataSet("data.csv");


        LinearModel linearModel = new LinearModel(0.01, dataSet);

        System.out.println("Trained Linear Model:");
        System.out.println(linearModel);
        
        System.out.println("Sum of Squared Error: " + linearModel.sumSquaredError());
    }
}
