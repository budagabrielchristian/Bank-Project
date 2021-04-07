class bankCreditAccount extends bankAccount {
    String name;
    String CNP;
    String cardNumber;
    double depositedMoney;
    String phoneNumber;
    String startDate;
    String placeOfBirth;

    bankCreditAccount(String name,String startDate,String cardNumber,String CNP, String phoneNumber,double depositedMoney, String placeOfBirth){
        this.name = name;
        this.startDate=startDate;
        this.phoneNumber=phoneNumber;
        this.CNP = CNP;
        this.cardNumber=cardNumber;
        this.depositedMoney=depositedMoney;
        this.placeOfBirth = placeOfBirth;
    }

    bankCreditAccount() {
        this.name = null;
        this.startDate = null;
        this.CNP = null;
        this.phoneNumber = null;
        this.depositedMoney = 0;
        this.placeOfBirth = null;
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

    public void useDepositedMoney(double depositedMoney) {
        this.depositedMoney -= depositedMoney;
    }
}