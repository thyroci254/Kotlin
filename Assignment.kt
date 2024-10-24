fun main() {

    // 3 variables for M-pesa toolkit
    val userPin = "0000" 
    var balance = 8000.0
    val phoneNumber = "0712345678"

    // Maximum PIN Attempts 

    var attempts = 0
    val maxAttempts = 3

    // Login loop
    while (attempts < maxAttempts) {
        println("Enter your PIN:")
        val inputPin = readLine()

        if (inputPin == userPin) {
            println("Login successful!")

            // Operation selection loop
            var operation: Int
            do {
                println("Choose an operation:")
                println("1. Send Money")
                println("2. Withdraw Cash")
                println("3. Buy Airtime")
                println("4. Loans and Savings")
                println("5. Lipa na M-Pesa")
                println("6. My Account")
                println("7. Exit")

                operation = readLine()?.toIntOrNull() ?: 0 // Safely convert input to Int

                when (operation) {
                    1 -> {
                        // Send Money 
                        println("Enter recipient's phone number:")
                        val recipientPhone = readLine()

                        println("Enter amount to send:")
                        val amount = readLine()?.toDoubleOrNull()

                        if (recipientPhone != null && amount != null && amount > 0) {
                            println("Confirm your PIN to proceed:")
                            val confirmationPin = readLine()

                            if (confirmationPin == userPin) {
                                if (amount <= balance) {
                                    balance -= amount
                                    println("Transaction successful! You have sent Ksh $amount to $recipientPhone.")
                                    println("Remaining Balance: Ksh $balance")
                                } else {
                                    println("Insufficient balance to complete the transaction.")
                                }
                            } else {
                                println("Incorrect PIN. Transaction cancelled.")
                            }
                        } else {
                            println("Invalid phone number or amount. Please try again.")
                        }
                    }
                    2 -> {
                        // Withdraw Cash 
                        println("Enter agent's number:")
                        val agentNumber = readLine()

                        println("Enter amount to withdraw:")
                        val amount = readLine()?.toDoubleOrNull()

                        if (agentNumber != null && amount != null && amount > 0) {
                            println("Confirm your PIN to proceed:")
                            val confirmationPin = readLine()

                            if (confirmationPin == userPin) {
                                if (amount <= balance) {
                                    balance -= amount
                                    println("Transaction successful! You have withdrawn Ksh $amount from agent $agentNumber.")
                                    println("Current Balance: Ksh $balance")
                                } else {
                                    println("Insufficient funds. Current balance is Ksh $balance.")
                                }
                            } else {
                                println("Incorrect PIN. Transaction cancelled.")
                            }
                        } else {
                            println("Invalid agent number or amount. Please try again.")
                        }
                    }
                    3 -> println("Buying Airtime...")
                    4 -> println("Managing Loans and Savings...")
                    5 -> println("Lipa na M-Pesa...")
                    6 -> {
                        println("My Account Details:")
                        println("Phone Number: $phoneNumber")
                        println("Balance: Ksh $balance")
                    }
                    7 -> println("Exiting...")
                    else -> println("Invalid option, please try again.")
                }

                // Ask if the user wants to perform another transaction
                if (operation in 1..6) {
                    println("Would you like to perform another transaction? (yes/no)")
                    val continueTransaction = readLine()
                    if (continueTransaction?.lowercase() != "yes") {
                        operation = 7 // Set operation to exit
                    }
                }

            } while (operation != 7)

            return // Exit the main function after operation
        } else {
            attempts++
            println("Incorrect PIN. You have ${maxAttempts - attempts} attempts left.")
        }
    }
    println("Maximum attempts reached. Access denied.")
}
