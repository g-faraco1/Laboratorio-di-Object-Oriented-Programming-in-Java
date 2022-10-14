public class Infected {

    private final String disease;
    private int numberOfInfected;

    public Infected(String disease) {
        this.disease = disease;
    }

    public Infected(String disease, int numberOfInfected) {
        this.disease = disease;
        this.numberOfInfected = numberOfInfected;
    }

    public int getNumberOfInfected() {
        return numberOfInfected;
    }

    public String getDisease() {
        return disease;
    }

    public void addInfected(int numberOfInfected) {
        this.numberOfInfected = numberOfInfected + 1;
    }

    public void updateInfectedByRt(double Rt) {
        numberOfInfected = (int) (numberOfInfected * Rt);
    }
}