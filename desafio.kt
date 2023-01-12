// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

    
enum class Nivel { Básico, Intermediário, Avançado }

data class Usuario (val nome: String, val email: String) 

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val alunos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
         alunos.add(usuario)
    }
    
    fun imprimirConteudo (){
     for (tudo in conteudos){
         print("${tudo.nome} - ${tudo.duracao}")
         print(" horas")
         println()
        
         } 
    }
    
    fun imprimirAlunos (){
     for ( all in alunos){
        println(all.nome)
        }
    }
}

fun main() {
   
    
    //Conteúdos Educacionais
    val Android1 = ConteudoEducacional ( "Introdução ao Desenvolvimento Mobile Nativo para Android", 40,)
    val Android2 = ConteudoEducacional ( "Desenvolvimento Android - Ambiente de Desenvolvimento", 60) 
    val Android3 = ConteudoEducacional ( "Estrutura de Projetos Android", 80)
    val Web1 = ConteudoEducacional ("Aprendendo HTML", 40)
    val Web2 = ConteudoEducacional ("Aprendendo CSS",  60)
    val Web3 = ConteudoEducacional ("Aprendendo HTML",  80)
    val Java1 = ConteudoEducacional ("Fundamentos da Plataforma Java", 40)
    val Java2 = ConteudoEducacional ("Programação Orientada a Objetos em Java", 60)
    val Java3 = ConteudoEducacional ("Utilizando Spring Framework", 80)
    
    // Criando Listas de Conteúdos Educacionais
    val listAndroid = mutableListOf<ConteudoEducacional>()
        listAndroid.add(Android1)
        listAndroid.add(Android2)
        listAndroid.add(Android3)
        
    val listWeb = mutableListOf<ConteudoEducacional>()
        listWeb.add(Web1)
        listWeb.add(Web2)
        listWeb.add(Web3)
    
     val listJava = mutableListOf<ConteudoEducacional>()
        listJava.add(Java1)
        listJava.add(Java2)
        listJava.add(Java3)
     
    
    // Formações
    val androidDeveloper = Formacao ("Formação Android Developer", listAndroid, Nivel.Intermediário) 
    val webDeveloper = Formacao ("Formação Web Developer", listWeb, Nivel.Básico) 
    val javaDeveloper = Formacao ("Formação Java Developer", listJava, Nivel.Avançado) 
    
     
    // Usuários
    val Natalia = Usuario ("Natália", "naspaes@gmail.com")
    val Gustavo = Usuario ("Gustavo", "gustavo@gmail.com")
    val Viviane = Usuario ("Viviane", "vivi@gmail.com")
    
    // Matriculando os alunos
    androidDeveloper.matricular(Natalia)
    webDeveloper.matricular(Gustavo)
    javaDeveloper.matricular(Viviane)
    
    // Imprimindo as saídas
    
    
    println("${androidDeveloper.nome} - ${androidDeveloper.nivel}")
    println("Conteúdo Educacional: ")
    println(androidDeveloper.imprimirConteudo())
    println("Alunos matriculados: ")
    println(androidDeveloper.imprimirAlunos())
    
    println()
    
    println("${webDeveloper.nome} - ${webDeveloper.nivel}")
    println("Conteúdo Educacional: ")
    println(webDeveloper.imprimirConteudo())
    println("Alunos matriculados: ")
    println(webDeveloper.imprimirAlunos())
    
    println()
    
    println("${javaDeveloper.nome} - ${javaDeveloper.nivel}")
    println("Conteúdo Educacional: ") 
    println(javaDeveloper.imprimirConteudo())
    println("Alunos matriculados: ")
    println(javaDeveloper.imprimirAlunos())
}
