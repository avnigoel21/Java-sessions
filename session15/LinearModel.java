import java.util.Arrays;

public class LinearModel extends Model {
    private double[] coefficients;
    private double changeRate;

    public LinearModel(double rate, DataSet training) {
        super(training);
        changeRate = rate;
        initCoefficients();
        trainModel();
    }

    private void trainModel() {
        int maxIterations = 1000;
        double tolerance = 0.0001;
    
        for (int iteration = 0; iteration < maxIterations; iteration++) {
            double[] newCoefficients = new double[coefficients.length];
            Arrays.fill(newCoefficients, 0.0); 
    
            for (DataRow dataRow : trainingData.getRows()) {
                double[] independentVars = dataRow.getIndependentVariables();
                double prediction = predict(independentVars);
                double error = prediction - dataRow.getDependentVariable();
    
                for (int i = 0; i < coefficients.length; i++) {
                    newCoefficients[i] += changeRate * error * independentVars[i];
                }
            }
    
            for (int i = 0; i < coefficients.length; i++) {
                coefficients[i] += newCoefficients[i] / trainingData.getRows().size(); 
            }
    
            double sumSquaredError = sumSquaredError();
    
            if (Math.abs(sumSquaredError) < tolerance) {
                break;
            }
        }
    }
    
    private void initCoefficients() {
        int numIndependentVariables = trainingData.getNumIndependentVariables();
        coefficients = new double[numIndependentVariables];
        for (int i = 0; i < numIndependentVariables; i++) {
            coefficients[i] = Math.random() * 0.0002 - 0.0001;
        }
    }

    @Override
    public double[] predict() {
        double[] predictions = new double[trainingData.getRows().size()];
        int index = 0;
        for (DataRow dataRow : trainingData.getRows()) {
            predictions[index++] = predict(dataRow.getIndependentVariables());
        }
        return predictions;
    }

    private double predict(double[] x) {
        double prediction = 0.0;
        for (int i = 0; i < x.length; i++) {
            prediction += coefficients[i] * x[i];
        }
        return prediction;
    }

    @Override
    public double sumSquaredError() {
        double sumSquaredError = 0.0;
        for (DataRow dataRow : trainingData.getRows()) {
            double prediction = predict(dataRow.getIndependentVariables());
            double error = prediction - dataRow.getDependentVariable();
            sumSquaredError += Math.pow(error, 2);
        }
        return sumSquaredError;
    }

    @Override
    public String toString() {
        StringBuilder modelString = new StringBuilder();
        int numIndependentVariables = coefficients.length;

        for (int i = 0; i < numIndependentVariables; i++) {
            if (i > 0) {
                modelString.append(" + ");
            }
            modelString.append(String.format("%.2f*X%d", coefficients[i], i));
        }

        return modelString.toString();
    }
}
