fun main() {
    val spasi = "==========================="
    var ColorRed = Color.RED
    println(ColorRed)
    var colorgreen = Color.GREEN
    var colorblue = Color.BLUE
    println(spasi)
    val Colors: Array<Color> = Color.values()
    Colors.forEach { color -> println("Daftar warna : $color") }
    println(spasi)
    val color: Color = Color.valueOf("RED")
    println("color is $color")
    println("color value is ${color.value.toString(16)}")
    println(spasi)
    val _color: Array<Color> = enumValues()
    _color.forEach { color -> println(color) }
    println(spasi)
    val _colors: Color = enumValueOf("RED")
    println("colors is $_colors")
    println(spasi)
    val _colorgreen: Color = Color.GREEN
    println("Posisi Green ada di ${_colorgreen.ordinal}")
    println(spasi)
    when(color){
        Color.GREEN -> println("Color is Green")
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
    }


}



enum class Color(val value: Int){
    RED(0xFF48134),
    BLUE(0xFF4149),
    GREEN(0xFF49047)

}