package model

class Repartidor(nombre: String, edad: Int, salario: Float, plus: Int) : Empleado(nombre, edad, salario,
    plus) {
    var zona: String= ""
        get() = field
        set(zona) {
            field = zona
        }
    override fun PLUS() {
        if( zona == "zona 3" && edad < 25){
            println("Plus Aplicado")
        }else{
            println("No se pudo aplicar el Plus")
        }
    }

    override fun toString(): String {
        return "Repartidor(nombre='$nombre', edad=$edad, salario=$salario, plus=$plus, zona='$zona')"
    }

}
