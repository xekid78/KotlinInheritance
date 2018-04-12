open class Box() {
    val myItem = "新しいアイテム"

    fun open() {
        println("宝箱を開いた。${myItem}を手に入れた。")
    }
}

class JewelryBox(): Box() {
    fun look() {
        println("宝箱はキラキラと輝いている")
    }
}

fun main(args: Array<String>) {
    val box = Box()
    box.open()

    val jewelrybox = JewelryBox()
    jewelrybox.look()
    jewelrybox.open()
}
