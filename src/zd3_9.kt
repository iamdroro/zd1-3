fun main(){
    try{
        println("Введите число k")
        var k = readLine()!!.toInt()
        println("Введите число l")
        var l = readLine()!!.toInt()
        println("Введите число n")
        var n = readLine()!!.toInt()
        println("Введите число m")
        var m = readLine()!!.toInt()
        if(l%k==0&&n%k==0&& m%k==0)
        {
            print("Является")

        }
        else{
            println("Не является")}
    }catch (e:Exception){
        println("Неправильный ввод данных")}
}