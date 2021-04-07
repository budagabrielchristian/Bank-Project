import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class bankDatabase {
    protected List<bankAccount> accountsList = new ArrayList<>();
    protected List<String> totalTransfers = new ArrayList<>();
    double payedTaxes;
    double totalMoney;

    public void addBankAccount(String name, String startDate, String cardNumber, String CNP, String phoneNumber, double depositedMoney, String placeOfBirth) {
        accountsList.add(new bankAccount(name, startDate, cardNumber, CNP, phoneNumber, depositedMoney, placeOfBirth));
    }

    public void getByName(String name) {
        for (bankAccount tmpName : accountsList) {
            if (tmpName.getName() == name) {
                tmpName.printData();
            }
        }
    }

    public void getByPlaceOfBirth(String placeOfBirth) {
        for (bankAccount tmpName : accountsList) {
            if (tmpName.getPlaceOfBirth() == placeOfBirth) {
                System.out.println(tmpName.getName());
            }
        }
    }

    public void searchAccount(String cardNumber) {
        for (bankAccount tmpName : accountsList) {
            if (tmpName.getCardNumber() == cardNumber) {
                tmpName.printData();
            }
        }
    }

    public void getByCNP(String CNP) {
        for (bankAccount tmpName : accountsList) {
            if (tmpName.getCNP() == CNP) {
                tmpName.printData();
            }
        }
    }

    public void getByCardNumber(String cardNumber) {
        for (bankAccount tmpName : accountsList) {
            if (tmpName.getCardNumber() == cardNumber) {
                tmpName.printData();
            }
        }
    }

    public void printAllAccounts() {
        for (bankAccount tmpName : accountsList) {
            tmpName.printData();
        }
    }

    public void printTotalMoney() {

        for (bankAccount tmpName : accountsList) {
            totalMoney += tmpName.getDepositedMoney();
        }
        System.out.println(totalMoney);
    }

    public void removeAccount(String cardNumber) {
        try {
            for (bankAccount tmpName : accountsList) {
                if (tmpName.getCardNumber()==cardNumber) {
                    accountsList.remove(tmpName);
                }
            }
        } catch (Exception e) {
        }
    }


    public void addAccount(bankAccount x) {
        accountsList.add(x);
    }
    public void transferMoney(String cardNumber, String cardNumber2, double money){
        double moneyWithTaxes = 0.98 * money;
        for(bankAccount tmpName : accountsList){
            for(bankAccount tmpNameTwo : accountsList){
                if(tmpName.getCardNumber()==cardNumber){
                    if(tmpNameTwo.getCardNumber()==cardNumber2){
                        tmpName.depositedMoney -= money;
                        tmpNameTwo.depositedMoney += moneyWithTaxes;
                        payedTaxes += money - moneyWithTaxes;

                        System.out.print(tmpName.getName() +'('+tmpName.getCardNumber()+')'+':' + tmpName.getDepositedMoney() + "$ (-" + money + "$)"+" -----> ");
                        System.out.println(tmpNameTwo.getName() + '('+tmpName.getCardNumber()+')'+':' + tmpNameTwo.getDepositedMoney() + "$ (+" + moneyWithTaxes + "$)");
                        totalTransfers.add("\n"+tmpName.getName() +'('+tmpName.getCardNumber()+')'+':' + tmpName.getDepositedMoney() + "(-" + money + "$)"+" -----> "+tmpNameTwo.getName() + ':' + tmpNameTwo.getDepositedMoney() + "(+" + moneyWithTaxes + "$)"+"\n");


                    }
                }
            }
        }
    }
    public void printTaxes() {
        System.out.print(payedTaxes);
        System.out.print('$');
    }
    public void printAllTransfers(){
        System.out.println(totalTransfers);
    }

}
