# Bank-Project
Please Read The README file in order to understand how to use the code, it's a little complex.

How to make a bank account
Template for creating an account:
bankAccount X = new bankAccount(name,startDate,cardNumber,CNP, phoneNumber, depositedMoney, placeOfBirth);

Example: bankAccount b1 = new bankAccount("Ferid Basim", "21.05.2021","0521 6072 3222 5467","5060723248823","0722996059",785,"Maramures/Repedea");

NOTE: With a basic bank account you won’t be able to transfer money/purchase things that you can’t afford 
Example: you want to transfer 500$ to X but you have 300$;

How to make a Credit Bank Account

Template:
bankCreditAccount(name,startDate,cardNumber,CNP, phoneNumber, depositedMoney, placeOfBirth);
With this one you will be able to purchase/transfer things that you can’t afford.

HOW TO ADD THE BANK ACCOUNTS IN THE DATABASE

1.	Create a database:
  bankDatabase bank = new bankDatabase();
2.	Use the name of the object you used:
bank.addAccount(b1);

BankDatabase Class Functionality 

1.	Search people by using their names: 
NOTE: It will print all the people with that exact name

Template:
bank.searchByName(“Example Name”);
Example: 
bank.searchByName(“Ferid Basim”);
2.	Get people by the place of birth
[It will print all the people that were born in X]

Template: 
bank.getByPlaceOfBirth(String placeOfBirth);
Example:
bank.getByPlaceOfBirth(“Maramures/Repedea”);

3.	Search an account by using the cardNumber
Template:
bank. searchAccount(String cardNumber);
Example:
bank.searchAccount(“0521 6072 3222 5467”);

4.	Get a person by their CNP
Template:
bank. getByCNP(String CNP);
Example:
bank. getByCNP(“5060723248823”);
5.	Print all of the accounts your bank has
NOTE: PLEASE BE CAREFUL WHEN USING THIS, SINCE IF YOU HAVE A LOT OF PEOPLE IT MIGHT CRASH
Usage:
bank.printAllAccounts();
6.	Print the total of money your bank has[By this I mean the total of money from all the accounts your bank has]
Usage:
bank. printTotalMoney();

7.	Remove an Account
Template: 
bank. removeAccount(String cardNumber);
Example:
bank. removeAccount(“0521 6072 3222 5467”);
8.	Transfer Money From An Account to Another
Note: The bank will take a 2% from the money
Template:
bank. transferMoney(String cardNumber, String cardNumber2, double money);
Example:
bank. transferMoney(“0521 6072 3222 5467”, “Card Number#2”, 100);
9.	Print the money the bank got from taxes
Usage:
bank.printTaxes();
    10.Print all the transfers which occurred in your bank
bank.printAllTransfers();
