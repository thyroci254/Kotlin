fun main() {
    val userPin = "1234" 
    var balance = 5000.0
    val phoneNumber = "0712345678"

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

                // Nested if-else conditions for operations
                when (operation) {
                    1 -> {
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
                    2 -> println("Withdrawing Cash...")
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
            } while (operation != 7)

            return // Exit the main function after operation
        } else {
            attempts++
            println("Incorrect PIN. You have ${maxAttempts - attempts} attempts left.")
        }
    }
    println("Maximum attempts reached. Access denied.")
}
