public abstract class Model {
    protected DataSet trainingData;

    public Model(DataSet training) {
        this.trainingData = training;
    }

    public abstract double[] predict();

    public abstract double sumSquaredError();
}
