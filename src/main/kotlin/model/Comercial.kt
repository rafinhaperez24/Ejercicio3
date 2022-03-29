package model

class Comercial(nombre: String, edad: Int, salario: Float, plus: Int) : Empleado(nombre, edad, salario, plus) {
    var comision: Int = 0
        get() = field
        set(comision) {
            field = comision
        }
    override fun PLUS() {
        if( comision > 200  && edad > 30){
            println("Plus Aplicado")
        }else{
            println("No se pudo aplicar el Plus")
        }
    }

    override fun toString(): String {
        return "Comercial(nombre='$nombre', edad=$edad, salario=$salario, plus=$plus, comision=$comision)"
    }


}