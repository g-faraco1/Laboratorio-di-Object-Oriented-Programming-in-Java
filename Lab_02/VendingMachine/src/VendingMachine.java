public class VendingMachine {
    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine() {
    }

    public VendingMachine(int initialNumberOfCans) {
        numberOfCans = initialNumberOfCans;
        numberOfTokens = 0;
    }

    public void addCans(int numberOfNewCans) {
        numberOfCans = numberOfCans + numberOfNewCans;
    }

    public void takeCan() {
        numberOfCans = numberOfCans - 1;
    }

    public void takeTokens() {
        numberOfTokens = numberOfTokens + 1;
    }

    public int getNumberOfCans() {
        return numberOfCans;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }
}