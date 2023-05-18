package collections.comparators.comparable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
        return this.getAccHolderName().compareTo(o.getAccHolderName());// for String we dont have compare
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




}
