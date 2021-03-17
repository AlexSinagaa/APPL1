public class Commision extends Hourly {

    private double totalSales;
    private double commisionRate;

    public Commision(String eName, String eAddress, String ePhone,
                     String socSecNumber,double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, commisionRate);
        this.commisionRate = commisionRate;
        totalSales = 0;
    }
    public void addSales(double totalSales){
        this.totalSales = this.totalSales + totalSales;
    }

    public double pay(){
        double payment = super.pay() + (totalSales * commisionRate);
        totalSales = 0;
        return payment;
    }

    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
