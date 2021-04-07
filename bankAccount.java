public class bankAccount {
    String name;
    String CNP;
    String cardNumber;
    double depositedMoney;
    String phoneNumber;
    String startDate;
    String placeOfBirth;

    bankAccount(){
        this.name=null;
        this.startDate=null;
        this.CNP=null;
        this.cardNumber=null;
        this.phoneNumber=null;
        this.depositedMoney=0;
        this.placeOfBirth=null;
    }
    bankAccount(String name,String startDate,String cardNumber,String CNP, String phoneNumber,double depositedMoney, String placeOfBirth){
        this.name = name;
        this.startDate=startDate;
        this.phoneNumber=phoneNumber;
        this.CNP = CNP;
        this.cardNumber=cardNumber;
        this.depositedMoney=depositedMoney;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName(){
        return this.name;
    }
    public String getCNP(){
        return this.CNP;
    }
    public String getCardNumber(){
        return this.cardNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public double getDepositedMoney(){
        return this.depositedMoney;
    }
    public String getPlaceOfBirth(){
        return this.placeOfBirth;
    }
    public void addDepositedMoney(double depositedMoney){
        this.depositedMoney+=depositedMoney;
    }
    protected void removeDepositedMoney(double depositedMoney){
        if(this.depositedMoney>=depositedMoney){
            this.depositedMoney-=depositedMoney;
        }else{
            System.out.println("Not enough money!");
        }
    }

    public void printData(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Name: "+this.name);
        System.out.println("Starting Date: "+this.startDate);
        System.out.println("Card Number: "+this.cardNumber);
        System.out.println("Deposited Money: "+this.depositedMoney+'$');
        System.out.println("CNP: "+this.CNP);
        System.out.println("Phone Number: "+this.phoneNumber);
        System.out.println("Place Of Birth: "+this.placeOfBirth);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
    }
}