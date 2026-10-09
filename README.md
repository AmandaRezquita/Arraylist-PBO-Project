# Bank Account Management System (Java ArrayList - OOP)

A simple Java application demonstrating Object-Oriented Programming (OOP) concepts and dynamic data storage using `ArrayList`. This project simulates basic banking operations, including account creation, account lookup, depositing, withdrawing, and displaying account details.

---

## 📌 Features

* **Dynamic Account Storage:** Stores `BankAccount` objects in a dynamic `ArrayList<BankAccount>`.
* **Account Lookup:** Searches for specific accounts using their unique account number (`accountNumber`).
* **Deposit & Withdrawal:** Performs deposit and withdrawal operations with validation for insufficient funds.
* **Display All Accounts:** Lists all registered bank accounts along with their respective owners and balances.

---

## 🏗️ Program Architecture

The program consists of three main Java classes:

1. **`BankAccount.java`**: Represenation of an individual bank account containing properties (`accountNumber`, `ownerName`, `balance`) and static helper methods for performing `deposit` and `withdraw` operations.
2. **`Bank.java`**: Manages the collection of bank accounts (`ArrayList<BankAccount>`) and provides functionality to add accounts, find accounts, and display all active accounts.
3. **`BankDemo.java`**: The main driver class (`main` method) that runs the application, initializes accounts, and performs sample transactions.

---

## 💻 Tech Stack & Requirements

* **Language:** Java (JDK 8 or higher)
* **IDE / Editor:** Visual Studio Code, IntelliJ IDEA, Eclipse, or NetBeans

---

## 📂 Project Structure

```text
Arraylist-PBO-Project/
├── src/
│   ├── Bank.java
│   ├── BankAccount.java
│   └── BankDemo.java
└── README.md
```

---

## 🚀 How to Run

### Prerequisites
Make sure you have JDK installed. You can check by running:
```bash
java -version
```

### Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/AmandaRezquita/Arraylist-PBO-Project.git
   cd Arraylist-PBO-Project
   ```

2. **Compile the Java source files:**
   ```bash
   javac Bank.java BankAccount.java BankDemo.java
   ```
   *(Or `javac src/*.java` if files are inside a `src` directory)*

3. **Run the program:**
   ```bash
   java BankDemo
   ```

---

## 🖥️ Expected Output

```text
=== Welcome to Bank BNI ===
Akun atas nama Budi berhasil ditambahkan.
Akun atas nama Siti berhasil ditambahkan.

--- Daftar seluruh akun ---
No. Rek: 101 | Owner: Budi | Saldo: Rp 100000
No. Rek: 102 | Owner: Siti | Saldo: Rp 250000

Siti - Deposit: Rp 500000
Current balance: Rp 750000

Siti - Withdraw: Rp 150000
Current balance: Rp 600000
```