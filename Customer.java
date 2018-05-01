
public class Customer extends Person {
    private boolean mailing;
    private int customernum;
    public Customer(boolean mailing,int customernum,String name,String address,int phone){
        super(name,address,phone);
        this.mailing = mailing;
        this.customernum = customernum;
        
        
        
    }

    public boolean isMailing() {
        return mailing;
    }

    public void setMailing(boolean mailing) {
        this.mailing = mailing;
    }

    public int getCustomernum() {
        return customernum;
    }

    public void setCustomernum(int customernum) {
        this.customernum = customernum;
    }
    
}
