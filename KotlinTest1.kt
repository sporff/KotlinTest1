class KotlinTest1(name:String) {
    init {
        println("Init")
    }
    var _name:String = name

    fun foo(name:String) {

    }
}


fun main(args: Array<String>) {
    println("Test")

    var kt:KotlinTest1 = KotlinTest1(name="Jebediah")

}