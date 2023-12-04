import java.util.*
fun TO_catch(){println("pleas inter a number") }
fun posi (){ println("pleas inter a positv number") }
fun depositD ():Int{
    println("inter the amount you want to deposit")
    var mm=0
    var am =0
    while (mm==0){
        try {am= readLine()!!.toInt()
            if(am <0)
            {posi()
                depositD()}
            mm=1
        }catch (i:Throwable){
            TO_catch()}}
    return am
}
fun depositC (W:Int):Int{
    if (W>=0)
    {println("""
        You don't need to deposit anything in order to pay off
        the account since it has already been paid off
    """.trimIndent())
        return 0}
    else{
        println("inter the amount you want to deposit")
        var mm=0
        var am =0
        while (mm==0){
            try {am= readLine()!!.toInt()
                if(am <0)
                {posi()
                    depositC(W)}
                mm=1
            }catch (i:Throwable){
                TO_catch()}}
        while (W+am >0)
        {
            println("""Deposit failed . you tried to pay off an amount greater then the credit balance 
                |the checking balance is $W dollars 
            """.trimMargin())
            println("pleas try again ")
            mm=0
            am =0
            while (mm==0){
                try {am= readLine()!!.toInt()
                    if(am <0)
                    {posi()
                        depositC(W)}
                    mm=1
                }catch (i:Throwable){
                    TO_catch()}}
        }
        println("you paid off $am Successfully")
        return am}
}
fun withdrawD (W :Int):Int{
    if(W==0)
    {println("you can't withdraw money! your current balance is $W")
        return 0}
    println("Inter the amount you want to withdraw ")
    var mm=0
    var am =0
    while (mm==0){
        try {am= readLine()!!.toInt()
            if(am <0)
            {posi()
                withdrawD(W)}
            mm=1
        }catch (i:Throwable){
            TO_catch()}}
    while (am>W)
    {
        println("Not enough money on this account!")
        println("pleas try again")
        mm=0
        am =0
        while (mm==0){
            try {am= readLine()!!.toInt()
                if(am <0)
                {posi()
                    withdrawD(W)}
                mm=1
            }catch (i:Throwable){
                TO_catch()}}
    }
    println("the amount you withdrew is $am")
    return am
}
fun withdrawC (W :Int):Int{
    println("Inter the amount you want to withdraw ")
    var mm=0
    var am =0
    while (mm==0){
        try {am= readLine()!!.toInt()
            if(am <0)
            {posi()
                withdrawC(W)}
            mm=1
        }catch (i:Throwable){
            TO_catch()}}
    println("the amount you withdrew is $am")
    return am
}