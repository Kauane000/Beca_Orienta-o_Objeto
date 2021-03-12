package digital.inovation

class Pessoa {
    var nome:String = "Kauane"
    var cpf:String = "06223392141"
}

fun main(){
    val nome = Pessoa()
    println(nome.nome)
    println(nome.cpf)
}
