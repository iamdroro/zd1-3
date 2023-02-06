fun main(){
    try{
        println("Введите координаты плоскосит м1")
        println("x1=")
        var x1 = readLine()!!.toInt()
        println("y1=")
        var y1 = readLine()!!.toInt()
        println("Введите координаты плоскосит м2")
        println("x2=")
        var x2 = readLine()!!.toInt()
        println("y2=")
        var y2 = readLine()!!.toInt()
        println("Введите координаты плоскосит n1")
        println("x3=")
        var x3 = readLine()!!.toInt()
        println("y3=")
        var y3 = readLine()!!.toInt()
        println("Введите координаты плоскосит n2")
        println("x3=")
        var x4 = readLine()!!.toInt()
        println("y3=")
        var y4 = readLine()!!.toInt()

        if(x4>x2&&x3>x1&&y4>y2&&y3>y1)
        { var a:Int
           a= (x4-x2)*(y4-y2)
            var b:Int
            b= (x3-x1)*(y3-y1)
            println("Ответ=")
            print(a+b)
        }else{println("x4>x2&&x3>x1&&y4>y2&&y3>y1")}
    }catch (e:Exception){
        println("Неправильный ввод данных")}
}