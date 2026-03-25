import org.junit.Assert.*
import org.junit.Test

class MoneyTransfersVkTest {
    @Test
    fun moneyTransfersVkFirst() {
        val system = 3
        val sumOfMonth = 39_000
        val sum = 11_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(10_000, result)
    }

    @Test
    fun moneyTransfersVkThird() {
        val system = 3
        val sumOfMonth = 20_000
        val sum = 1_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(0, result)
    }

    @Test
    fun moneyTransfersVkF() {
        val system = 3
        val sumOfMonth = 41_000
        val sum = 1_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVkFF() {
        val system = 3
        val sumOfMonth = 39_000
        val sum = 16_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVkS() {
        val system = 3
        val sumOfMonth = 41_000
        val sum = 16_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVk_1() {
        val system = 2
        val sumOfMonth = 601_000
        val sum = 151_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVk_2() {
        val system = 2
        val sumOfMonth = 601_000
        val sum = 130_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVk_3() {
        val system = 2
        val sumOfMonth = 550_000
        val sum = 100_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(375, result)
    }

    @Test
    fun moneyTransfersVk_4() {
        val system = 2
        val sumOfMonth = 550_000
        val sum = 150
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(35, result)
    }

    @Test
    fun moneyTransfersVk_11() {
        val system = 1
        val sumOfMonth = 601_000
        val sum = 150_001
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVk_12() {
        val system = 1
        val sumOfMonth = 601_000
        val sum = 150_001
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVk_13() {
        val system = 1
        val sumOfMonth = 601_000
        val sum = 13_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(-1, result)
    }

    @Test
    fun moneyTransfersVk_14() {
        val system = 1
        val sumOfMonth = 150_000
        val sum = 30_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum, month)
        assertEquals(0, result)
    }

    @Test
    fun moneyTransfersVk_15() {
        val system = 1
        val sumOfMonth = 550_000
        val sum = 70_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(0, result)
    }

    @Test
    fun moneyTransfersVk_16() {
        val system = 1
        val sumOfMonth = 300_000
        val sum = 140_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(860, result)
    }

    @Test
    fun moneyTransfersVk_17() {
        val system = 1
        val sumOfMonth = 550_000
        val sum = 100_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(320, result)
    }
    @Test
    fun moneyTransfersVk_18() {
        val system = 1
        val sumOfMonth = 550_000
        val sum = 100_000
        val month = 1
        val result = moneyTransfersVk(system, sumOfMonth, sum)
        assertEquals(320, result)
    }
    @Test
    fun moneyTransfersVk_19() {
        val system = 1
        val sumOfMonth = 590_000
        val sum = 11_000
        val month = 0
        val result = moneyTransfersVk(system, sumOfMonth, sum, month)
        assertEquals(80, result)
    }
    @Test
    fun moneyTransfersVk_120() {
        val system = 1
        val sumOfMonth = 100_000
        val sum = 30_000
        val month = 0
        val result = moneyTransfersVk(system, sumOfMonth, sum, month)
        assertEquals(200, result)
    }

    @Test
    fun moneyTransfersVk_20() {
        val system = 2
        val sumOfMonth = 100_000
        val sum = 100_000
        val month = 0
        val result = moneyTransfersVk(system, sumOfMonth, sum, month)
        assertEquals(750, result)
    }
    @Test
    fun moneyTransfersVk_21() {
        val system = 0
        val sumOfMonth = 100_000
        val sum = 100_000
        val month = 0
        val result = moneyTransfersVk(system, sumOfMonth, sum, month)
        assertEquals(0, result)
    }
}