import java.util.*

fun main(args: Array<String>) {


}


fun palString() {
    print("Enter your string : ")
    val userInput = readLine()
    var reverse: String = ""
    var s1: String = userInput.toString()
    var l: Int = s1.length - 1

    while (l != -1) {
        reverse += s1[l--];
    }
    if (s1 == reverse) println("Palindrome String");
    else println("Not a Palindrome String");
}

fun minSplit(amount: Int): Int {
    var temp = 0
    val a = amount / 50
    temp = amount % 50
    val b = temp / 20
    temp = temp % 20
    val c = temp / 10
    temp = temp % 10
    val d = temp / 5
    return a + b + c + d
}

fun notContains(array: IntArray): Int {
    val arrLength = array.size
    var minPositive = 0
    Arrays.sort(array)




    for (i in 0 until arrLength) {
        if (array[i] > 0) {
            minPositive = i
            break
        } else {
            continue
        }
    }
    val positiveMassive = Arrays.copyOfRange(array, minPositive, arrLength)


    val newMassive = IntArray(arrLength - minPositive)
    val newMassiveLength = newMassive.size
    for (i in 1 until newMassiveLength + 1) {
        newMassive[i - 1] = i
    }



    if (positiveMassive[0] > 1) {
        return 1
    }


    for (i in 0 until newMassiveLength) {
        return if (positiveMassive[i] == newMassive[i]) {
            continue
        } else {
            newMassive[i]
        }
    }
    return 0
}


fun countVariants(stairsCount: Int): Int {
    return if (stairsCount == 1 || stairsCount == 0) {
        1
    } else {
        countVariants(stairsCount - 1) + countVariants(stairsCount - 2)
    }
}




fun isProperly(sequence: String): Boolean? {
    var firstCount = 0
    var lastCount = 0



    if (sequence.substring(0, 1) == ")") {
        return false
    }

    for (i in 1 until sequence.length + 1) {
        if (sequence.substring(i - 1, i) == "(") {
            firstCount++
        }
        if (sequence.substring(i - 1, i) == ")") {
            lastCount++
        }
        if (lastCount > firstCount) {
            return false
        }
    }
    return if (firstCount == lastCount) {
        true
    } else false
}
