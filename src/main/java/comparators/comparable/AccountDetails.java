package comparators.comparable;

public class AccountDetails implements Comparable<AccountDetails> {

    private Long accNumber;
    private String accHolderName;
    private Double accBalance;
    private boolean isActive;

    AccountDetails(Long accNumber,String name,Double accBalance,boolean isActive){
        this.accNumber=accNumber;
        this.accHolderName=name;
        this.accBalance= accBalance;
        this.isActive=isActive;
    }

    /*@Override
    public int compareTo(AccountDetails o) {
        return Double.compare(this.getAccBalance(),o.getAccBalance());
    }*/

    @Override
    public int compareTo(AccountDetails o){
        return this.getAccHolderName().compareTo(o.getAccHolderName());
    }
   // we have Integer.compare(integer1, integer2); for int type

    /*@Override
    public int compareTo(AccountDetails o){
        return Long.compare(this.getAccNumber(),o.getAccNumber());
    }
*/
   /* @Override
    public int compareTo(AccountDetails o){
        return Boolean.compare(this.isActive,o.getIsActive());
    }*/


    public Long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Long accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public Double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(Double accBalance) {
        this.accBalance = accBalance;
    }

    public boolean getIsActive(){
        return isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive=isActive;
    }
    @Override
    public String toString() {
        return "AccountDetails{" +
                "accNumber=" + accNumber +
                ", accHolderName='" + accHolderName + '\'' +
                ", accBalance=" + accBalance +
                ", isActive =" + isActive +
                '}';
    }

}
