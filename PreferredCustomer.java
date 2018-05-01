
public class PreferredCustomer extends Customer {
    private double spent;
    private double discount;
    public PreferredCustomer(boolean mailing,int customernum,String name,String address,int phone){
       super(mailing,customernum,name,address,phone);
    }

    public double getSpent() {
        return spent;
    }

    public void spendMoney(double spent) {
        this.spent += spent;
    }

    public double makeDiscount() {
        if (spent<500){
            discount=1;
        } else if (spent<1000){
            discount=0.95;
        } else if (spent<1500){
            discount=0.94;
        } else if (spent<2000){
            discount=0.93;
        } else {
            discount=0.9;
        }
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
}
