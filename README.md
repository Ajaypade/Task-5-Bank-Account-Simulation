# Task-5-Bank-Account-Simulation

Transaction class stores transaction details (type, amount, date).
Each transaction is timestamped using Date.
Account class holds account number, holder name, balance, and transaction history.
deposit() adds money to balance and records a transaction.
withdraw() deducts money if balance is sufficient, and records a transaction.
showBalance() displays the current account balance.
showHistory() prints all past transactions.
Bank class manages multiple accounts using a HashMap.
createAccount() creates a new account with an initial deposit.
Prevents duplicate account creation by checking account number.
getAccount() retrieves account by account number.
listAccounts() displays all existing accounts and their holders.
Main class provides a menu-driven interface.
Options include create account, deposit, withdraw, show balance, history, list accounts, and exit.
User input handled with Scanner.
Validates account existence before transactions.
Invalid inputs (like insufficient funds or negative deposit) are rejected.
Transaction history shows deposits and withdrawals with timestamps.
Loop continues until user chooses to exit.
Simulates real-world bank operations with OOP structure in Java
