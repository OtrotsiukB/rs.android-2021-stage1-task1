package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        try {
            var first: MutableList<Int> = mutableListOf()
            var second: MutableList<Int> = mutableListOf()
            var notDone: Boolean = true
            var chengeList: Int = 0//0 старт 1 в работе 2 не изменил
            first.addAll(sadArray.toMutableList())
            while (notDone) {
                chengeList = 0
                second.clear()
                second.add(first[0])
                for (i in 1..first.size - 2) {
                    var sum = first[i - 1] + first[i + 1]
                    if (first[i] < sum) {
                        second.add(first[i])
                    }
                    if (first[i] > sum) {
                        chengeList = 1

                    }

                }
                second.add(first[first.size - 1])

                if (chengeList == 0) {
                    notDone = false
                }
                if (chengeList == 1) {
                    first.clear()
                    first.addAll(second)
                }
            }
            var temp: IntArray = second.toIntArray()
            return temp
        }catch (e:Exception){
            var temp: IntArray = intArrayOf()
            return temp
        }
        throw NotImplementedError("Not implemented")
    }
}
