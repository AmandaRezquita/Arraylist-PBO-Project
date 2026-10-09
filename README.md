# 💳 Enterprise Digital ATM Terminal

> **Sleek, Modern, and Scalable Java Console Architecture.**

A refactored, enterprise-styled Java application implementing clean naming conventions, formatted numerical outputs, and decoupled model components for corporate banking workflows.

---

## 🌟 Key Features

* **Modern Naming Conventions**: Clean abstractions using `BankAccount`, `Client`, and `BankManager`.
* **Formatted Currency Display**: Uses Java string formatting (`System.out.printf`) for dual-decimal currency precision.
* **Dynamic Client-Account Linkage**: Multi-account support per client using generic `List` collections.
* **Streamlined UI**: Minimalist border UI using clean box-drawing separators.

---

## 📁 File Structure

```text
src/
├── BankAccount.java    # Represents monetary account balances and operations
├── Client.java         # Customer entity holding personal profile and accounts
├── BankManager.java    # Central controller for customer registration and configurations
└── App.java            # Terminal entry point handling interactive workflows
```

---

## 📊 Class Summary

### `BankAccount.java`
* `double balanceAmount` — Encapsulated account balance.
* `boolean deposit(double amount)` — Credits the account balance.
* `boolean withdraw(double amount)` — Debits the account balance with overdraft checks.

### `Client.java`
* `String firstName, lastName` — Client identification.
* `List<BankAccount> accounts` — Dynamic list of linked bank accounts.
* `String getFullName()` — Concatenates client full name.

### `BankManager.java`
* `List<Client> clientList` — Central store of registered clients.
* `static final String DEFAULT_CURRENCY` — System-wide currency standard (`USD`).

### `App.java`
* `main(String[] args)` — Launches the terminal loop.

---

## 🚀 How to Run

1. **Compile**:
   ```bash
   javac BankAccount.java Client.java BankManager.java App.java
   ```

2. **Execute**:
   ```bash
   java App
   ```

---

## 🖥️ UI Preview

```text
┌──────────────────────────────────────────┐
│          DIGITAL ATM TERMINAL            │
│  Client : Amanda Rezquita                │
├──────────────────────────────────────────┤
│  [1] Balance Enquiry                     │
│  [2] Credit Account (Deposit)            │
│  [3] Debit Account (Withdraw)            │
│  [4] Terminate Session                   │
└──────────────────────────────────────────┘
Select action > 

Current Balance: 1200.00 USD
```