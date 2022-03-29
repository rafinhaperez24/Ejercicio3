package model

open class Empleado {
    var nombre: String= ""
        get() = field
        set(nombre) {
            field = nombre
        }
    var edad: Int= 0
        get() = field
        set(edad) {
            field = edad
        }
    var salario : Float = 0F
        get() = field
        set(salario) {
            field = salario
        }
    var plus : Int = 300

    constructor(nombre: String, edad: Int, salario: Float, plus: Int) {
        this.nombre = nombre
        this.edad = edad
        this.salario = salario
        this.plus = plus
    }

    open fun PLUS(){

    }

    override fun toString(): String {
        return "Empleado(nombre='$nombre', edad=$edad, salario=$salario, plus=$plus)"
    }

}