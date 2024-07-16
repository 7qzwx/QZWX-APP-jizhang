package dev.muffar.moneyfikasi.data.utils

import dev.muffar.moneyfikasi.data.db.entity.CategoryEntity
import dev.muffar.moneyfikasi.data.db.entity.WalletEntity
import dev.muffar.moneyfikasi.domain.model.CategoryType
import dev.muffar.moneyfikasi.utils.CategoryIcon
import dev.muffar.moneyfikasi.utils.WalletIcon
import java.util.UUID

object InitDataSource {
    fun getCategories(): List<CategoryEntity> {
        val expenseCategories = arrayListOf(
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "电费",
                icon = CategoryIcon.BOLT.iconName,
                color = 0xFFFFC107,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "娱乐",
                icon = CategoryIcon.CONFIRMATION_NUMBER.iconName,
                color = 0xFF7B1FA2,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "健身",
                icon = CategoryIcon.FITNESS_CENTER.iconName,
                color = 0xFF6D4C41,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "Food & drink",
                icon = CategoryIcon.RAMEN_DINING.iconName,
                color = 0xFFFFEB3B,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "爱好",
                icon = CategoryIcon.GAMES.iconName,
                color = 0xFF00897B,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "健康",
                icon = CategoryIcon.MEDICAL_SERVICES.iconName,
                color = 0xFFC2185B,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "Other",
                icon = CategoryIcon.WIDGETS.iconName,
                color = 0xFF9E9E9E,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "购物",
                icon = CategoryIcon.SHOPPING_CART.iconName,
                color = 0xFFFF9800,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "借出",
                icon = CategoryIcon.TRANSFER.iconName,
                color = 0xFFF44336,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "出行",
                icon = CategoryIcon.DIRECTIONS_CAR.iconName,
                color = 0xFFED32F2F,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "旅行",
                icon = CategoryIcon.MAP.iconName,
                color = 0xFF388E3C,
                type = CategoryType.EXPENSE,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "水",
                icon = CategoryIcon.WATER_DROP.iconName,
                color = 0xFF1976D2,
                type = CategoryType.EXPENSE,
            )
        )

        val incomeCategories = arrayListOf(
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "兼职",
                icon = CategoryIcon.BUSINESS_CENTER.iconName,
                color = 0xFF6D4C41,
                type = CategoryType.INCOME,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "礼物",
                icon = CategoryIcon.CARD_GIFT_CARD.iconName,
                color = 0xFFE91E63,
                type = CategoryType.INCOME,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "投资",
                icon = CategoryIcon.TIMELINE.iconName,
                color = 0xFF8BC34A,
                type = CategoryType.INCOME,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "工资",
                icon = CategoryIcon.PAID.iconName,
                color = 0xFFED32F2F,
                type = CategoryType.INCOME,
            ),
            CategoryEntity(
                id = UUID.randomUUID(),
                name = "借入",
                icon = CategoryIcon.TRANSFER.iconName,
                color = 0xFF4CAF50,
                type = CategoryType.INCOME,
            )
        )

        val categories = arrayListOf<CategoryEntity>().apply {
            addAll(expenseCategories)
            addAll(incomeCategories)
        }

        return categories
    }

    fun getWallets(): List<WalletEntity> {
        return arrayListOf(
            WalletEntity(
                id = UUID.randomUUID(),
                name = "钱包",
                icon = WalletIcon.ACCOUNT_BALANCE_WALLET.iconName,
                color = 0xFF00897B,
                balance = 0.0,
                isActive = true
            )
        )
    }
}