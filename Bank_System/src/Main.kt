import java.lang.ref.Cleaner
import java.util.concurrent.ConcurrentSkipListSet
fun main() {
    println("welcome to your banking system")
    while (true){
        println("""
    |what type of account would you like to create?
    |1. Debit account 
    |2. Credit account 
    |3. Checking account
    |4. Exit
    |Choose an option (1, 2 , 3 , 4)
""".trimMargin())
        var ACT =""
        var UC =0
        var q1=0
        while (q1==0){
            try{UC = readLine()!!.toInt()
                q1=1
            }catch (i:Throwable)
            {TO_catch()}}
        while(UC != 1 && UC !=2 && UC != 3 && UC !=4)
        {println("pleas inter one of the 4 options")
            q1=0
            while (q1==0){
                try{UC = readLine()!!.toInt()
                    q1=1
                }catch (i:Throwable)
                {TO_catch()}}}
        println("The selected option is $UC")
        if(UC ==4)
        {println("Thank you for your time ")
            break}
        when (UC) {
            1 -> {
                println("You have created a Debit account.")
                ACT ="Debit"
            }
            2 -> {
                println("You have created a Credit account.")
                ACT = "Credit"
            }
            3 -> {
                println("You have created a checking account.")
                ACT = "Checking"
            }}
        if (UC ==1){
            var AB = (0..1000).random()
            while(true){
                println("""what do you want to do
        |1. Check bank account balance
        |2. deposit
        |3. withdraw
        |4. Exit
    """.trimMargin())
                var SL=0
                q1=0
                while (q1==0){
                    try{SL= readLine()!!.toInt()
                        q1=1
                    }catch (i:Throwable){
                        TO_catch()}}
                while(SL != 1 && SL !=2 && SL !=3 && SL !=4)
                {println("pleas inter one of the 4 options")
                    q1=0
                    while (q1==0){
                        try{SL= readLine()!!.toInt()
                            q1=1
                        }catch (i:Throwable){
                            TO_catch()}}}
                if(SL ==4)
                {println("we will return to creating an account")
                    break}
                when (SL){
                    1 -> println("the current balance is $AB dollars.")
                    2-> AB+=depositD()
                    3 -> AB -= withdrawD(AB)
                }
            }
        }
        if(UC ==2 || UC ==3)
        {
            var AB= (0..1000).random()
            while (true){
                println("""what do you want to do
        |1. Check bank account balance
        |2. deposit
        |3. withdraw
        |4. Exit
    """.trimMargin())
                var SL=0
                q1=0
                while (q1==0){
                    try{SL= readLine()!!.toInt()
                        q1=1
                    }catch (i:Throwable){
                        TO_catch()
                    }}
                while(SL != 1 && SL !=2 && SL !=3 && SL !=4)
                {println("pleas inter one of the 4 options")
                    q1=0
                    while (q1==0){
                        try{SL= readLine()!!.toInt()
                            q1=1 }
                        catch (i:Throwable){
                            TO_catch()
                        }}}
                if(SL ==4)
                {println("we will return to creating an account")
                    break}
                when (SL){
                    1-> println("the current balance is $AB dollars.")
                    2 -> {
                        if(UC==2)
                            AB+=depositC(AB)
                        else
                            AB+=depositD()
                    }
                    3 -> AB -= withdrawC(AB)
                }
            }
        }
    }
}
