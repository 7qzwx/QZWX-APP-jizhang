package dev.muffar.moneyfikasi.domain.model

enum class TransactionType(val value: String) {
    EXPENSE("支出"),
    INCOME("收入"),
    TRANSFER("Transfer");

    companion object {
        fun fromString(type: String): TransactionType {
            return valueOf(type.uppercase())
        }
    }
}