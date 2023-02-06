fun printname(){
    println("Enter name")
    var name:String = readLine()!!.toString()
    println("Welcome ${name}")
}
fun main() {
    printname()
}