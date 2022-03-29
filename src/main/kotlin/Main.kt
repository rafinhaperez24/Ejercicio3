import model.Comercial
import model.Repartidor

fun main(args: Array<String>) {


    var repartidor1 = Repartidor("Juan", 29, 2000.0F,200)
    repartidor1.zona = "zona 3"
    var repartidor2 = Repartidor("Pepe", 35, 3000.0F,600 )
    repartidor2.zona = "zona 2"
    var repartidor3 = Repartidor("Luis", 21, 44300.0F,301)
    repartidor3.zona = "zona 3"

    var comercial1 = Comercial("Ronny", 40, 39870.0F, 300)
    comercial1.comision = 300
    var comercial2 = Comercial("Jesus", 20, 2000.0F, 100)
    comercial2.comision = 200
    var comercial3 = Comercial("Diego", 28, 40001.0F, 250)
    comercial3.comision = 500
    repartidor1.PLUS()
    repartidor2.PLUS()
    repartidor3.PLUS()
println("---------------------------------------------------------------------------------------------------------------------")
    comercial1.PLUS()
    comercial2.PLUS()
    comercial3.PLUS()

    println(repartidor1)
    println(repartidor2)
    println(repartidor3)
println("---------------------------------------------------------------------------------------------------------------------")
    println(comercial1)
    println(comercial2)
    println(comercial3)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}