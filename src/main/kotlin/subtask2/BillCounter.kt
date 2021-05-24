package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var annaPay = bill
        annaPay[k]=0
        var summa = annaPay.sum()/2
        if (summa==b){
            return "bon appetit"
        }else{
            return (b-summa).toString()
        }


        throw NotImplementedError("Not implemented")
    }
}
