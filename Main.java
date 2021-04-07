public class Main{
    public static void main(String[] args){
        bankDatabase bank = new bankDatabase();
        bankAccount b1 = new bankAccount("Ferid Basim", "21.05.2021","0521 6072 3222 5467","5060723248823","0722996059",785,"Maramures/Repedea");
        bankAccount b2 = new bankAccount("Lia Diodorus", "19.02.2018","0219 5041 2244 0934","5050412249115","0244266748",450 ,"Maramures/Repedea");
        bankAccount b3 = new bankAccount("Hiroto Marie-Laure", "03.09.2019","0903 4022 7259 5477","5040227249514","0259313427",500 ,"Maramures/Repedea");
        bankAccount b4 = new bankAccount("Ferid Basim", "18.11.2017","0521 6072 3222 4536","5040205246838","0771715157",300,"Maramures/Viseu De Jos");
        bankAccount b5 = new bankAccount("Darwin Osamu", "04.03.2021","0304 6032 3243 3254" ,"5060323246198", "0743382578",0,"Maramures/Repedea");
        bankAccount b6 = new bankAccount( "","" , "","", "", bank.payedTaxes, "");
        bankCreditAccount a1 = new bankCreditAccount("Hiroto Marie-Laure", "03.09.2019","0903 4022 7259 0768","5040227249514","0259313427",500 ,"Maramures/Repedea");


        bank.addAccount(b1);
        bank.addAccount(b2);
        bank.addAccount(b3);
        bank.addAccount(b4);
        bank.addAccount(b5);
        bank.addAccount(a1);

        bank.transferMoney("0903 4022 7259 5477","0304 6032 3243 3254",100);
        bank.transferMoney("0521 6072 3222 5467", "0219 5041 2244 0934", 100);
        bank.transferMoney("0219 5041 2244 0934","0521 6072 3222 5467",150);

        bank.printAllTransfers();

    }
}