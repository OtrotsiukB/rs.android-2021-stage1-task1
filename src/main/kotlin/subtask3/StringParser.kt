package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var stroka:MutableList<String> = mutableListOf()
        var temp:Int
        var count: Int
       // var openNewString:String=""
       // var record: Boolean=false

        for (i in 0..inputString.length-1) {
            when(inputString[i]) {
                '<' -> {
                    count = 0
                    temp = i + 1
                    for (j in i..inputString.length-1) {
                        if (inputString[j] == '<') {
                            count += 1
                        }
                        if (inputString[j] == '>') {
                            count -= 1
                            if (count == 0) {
                                stroka.add(inputString.substring(temp until j))
                                break
                            }
                        }
                    }
                }
                '(' -> {
                    count = 0
                    temp = i + 1
                    for (j in i..inputString.length-1) {
                        if (inputString[j] == '(') {
                            count += 1
                        }
                        if (inputString[j] == ')') {
                            count -= 1
                            if (count == 0) {
                                stroka.add(inputString.substring(temp until j))
                                break
                            }
                        }
                    }
                }
                '[' -> {
                    count = 0
                    temp = i + 1
                    for (j in i..inputString.length-1) {
                        if (inputString[j] == '[') {
                            count += 1
                        }
                        if (inputString[j] == ']') {
                            count -= 1
                            if (count == 0) {
                                stroka.add(inputString.substring(temp until j))
                                break
                            }
                        }
                    }
                }
            }
        }
        return stroka.toTypedArray()

        throw NotImplementedError("Not implemented")
    }
}
