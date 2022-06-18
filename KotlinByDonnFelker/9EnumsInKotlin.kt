package KotlinByDonnFelker

fun main() {

    // Printing the enum
    println(AccountType.GOLD)

    // Getting the enum from string
    val inputType = "silver"
    println(AccountType.valueOf(inputType.toUpperCase()))

    // creating the object
    val accountType: AccountType = AccountType.PLATINUM
    println(accountType)

    // Kotlin Enum Constructor Parameters
    println(AccountTypeDiscount.GOLD)
    println(AccountTypeDiscount.SILVER.discount)
    println(AccountTypeDiscount.PLATINUM.subscription)

    // // Create Abstract Functions Inside of a Kotlin Enum
    println(SubscriptionType.BRONZE.calculateDiscount())

    // Iterate Over Kotlin Enum Values
    for(account in AccountType.values())
        println(account)

    AccountType.values().forEach { println("Enum value is: $it") }

    // Add Static Methods to Kotlin Enums
    println(Day.getDay("sun"))
}

// Simple enum
enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}

// Kotlin Enum Constructor Parameters
enum class AccountTypeDiscount(val discount: Int, val subscription: Int) {
    BRONZE(10, 2),
    SILVER(20, 4),
    GOLD(40, 6),
    PLATINUM(60, 8)
}

// Create Abstract Functions Inside of a Kotlin Enum
enum class SubscriptionType {
    BRONZE{
        override fun calculateDiscount(): Int {
            return 50
        }
          },
    SILVER{
        override fun calculateDiscount(): Int {
            return 100
        }
          },
    GOLD{
        override fun calculateDiscount(): Int {
            return 150
        }
        },
    PLATINUM{
        override fun calculateDiscount(): Int {
            return 200
        }
    };

    abstract fun calculateDiscount() : Int
}

// Add Static Methods to Kotlin Enums
enum class Day {
    SAT,
    SUN;

    companion object{
        fun getDay(name: String) = valueOf(name.toUpperCase())
    }
}