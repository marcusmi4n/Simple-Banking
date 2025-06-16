class Account(var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) balance -= amount else println("Insufficient funds.")
    }
}

fun main() {
    val acc = Account(1000.0)
    acc.deposit(500.0)
    acc.withdraw(300.0)
    println("Final Balance: ${acc.balance}")
}
