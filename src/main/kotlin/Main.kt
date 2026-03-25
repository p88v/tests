fun main() {
    print("Введите платежную систему: \n1 - Mastercard or Maestro\n2 - Visa or Мир\n3 - Vk Pay\nВаш выбор -- ")
    val system = readln().toInt()

    print("Введите сумму переводов за месяц: ")
    val sumOfMonth = readln().toInt()

    print("Введите сумму перевода: ")
    val sum = readln().toInt()

    print("Месяц акции?\nДа - 0\nНет - 1")
    val month = readln().toInt()

    moneyTransfersVk(system, sumOfMonth, sum, month)
}

fun moneyTransfersVk(system: Int, sumOfMonth: Int, sum: Int, monthOfDiscont: Int = 1): Int {
    if (system == 1 && sumOfMonth > 600_000 && sum > 150_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 1 && sumOfMonth >= 600_000 && sum < 150_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 1 && sumOfMonth < 600_000 && sum >= 300 && sum <= 75_000 && monthOfDiscont == 1) {
        val result = 600_000 - sumOfMonth
        if (result >= sum) {
            print("Перевод доступен без комиссии - ")
            return 0
        } else if (result < sum) {
            val nextResult = sum - result
            print("Не сможем перевести $nextResult т.к. превышен лимит на переводы, но перевод доступен без комиссии - ")
            return 0
        }
    } else if(system == 1 && sumOfMonth < 600_000 && sum >= 300 && sum <= 75_000 && monthOfDiscont == 0){
        val result = 600_000 - sumOfMonth
        if (result >= sum) {
            val cur = (sum * 0.006) + 20
            return cur.toInt()
        } else if (result < sum) {
            val nextResult = sum - result

            val newResult = (sum - nextResult) * 0.006
            print("Не сможем перевести $nextResult т.к. превышен лимит на переводы, но перевод доступен без комиссии - ")
            return newResult.toInt() + 20
        }
    } else if (system == 1 && sumOfMonth < 600_000 && sum < 150_000) {
        val result = 600_000 - sumOfMonth
        if (result >= sum) {
            val currentCommis = (sum * 0.006) + 20
            println("Ваша комиссия составит $currentCommis")
            return  currentCommis.toInt()

        } else if (result < sum) {
            val nextResult = sum - result
            val curSum = sum - nextResult
            val ito = (curSum * 0.006) + 20
            println(
                "Не сможем перевести $nextResult т.к. превышен лимит на переводы. Переведем $curSum, " +
                        "комиссия составит $ito"
            )
            return ito.toInt()
        }
    }
    if (system == 2 && sumOfMonth > 600_000 && sum > 150_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 2 && sumOfMonth > 600_000 && sum < 150_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 2 && sumOfMonth < 600_000 && sum < 150_000) {
        val result = 600_000 - sumOfMonth

        if (result >= sum) {
            val currentComm = sum * 0.0075
            if (currentComm < 35) {
                return 35
            } else return currentComm.toInt()
        } else if (result < sum) {
            val nextResult = sum - result
            println("Не сможем перевести $nextResult т.к. превышен лимит на переводы")
            val nres = sum - nextResult
            val ito = nres * 0.0075
            return ito.toInt()
        }

    }

    if (system == 3 && sumOfMonth >= 40_000 && sum >= 15_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 3 && sumOfMonth < 40_000 && sum >= 15_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 3 && sumOfMonth > 40_000 && sum < 15_000) {
        println("Операция остановлена Вы вышли за лимит")
        return -1
    } else if (system == 3 && sumOfMonth < 40_000 && sum < 15_000) {
        val result = 40_000 - sumOfMonth
        if (result >= sum) {
            print("Вам доступны переводы без комиссии: ")
            return 0
        } else if (result < sum) {
            val nextResult = sum - result
            println("Не сможем перевести $nextResult т.к. превышен лимит на переводы")
            return nextResult
        }
    }
    return 0
}