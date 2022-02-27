fun main(){
    var name = "Akirachix"
    var char = (name[0])
    var char1 = (name[2])
    var char2 = (name[3])
    var result = "$char$char1$char2"
    println(result)
    var x = nameAge("Saido",20)
    println(x)
    var hobby = "Dancing"
    println(hobby.length)

    val names = "Saido"
    if (names == "Saido"){
        print("Thats Me")
    } else{
        print("Thats not me ")
    }
}

fun nameAge(name:String, age:Int){
    println("Hi my name is $name I am $age years old")
}


