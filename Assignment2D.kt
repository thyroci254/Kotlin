fun main(){
    val age: Int = 21
    if (age>0 && age<13){
        println("Child")
    }
    else if (age>=13 && <=19){
        println("Teenager")
    }
    else if (age>=20 && <=35){
        println("Young Adult")
    }
    else if (age>=36 && <=55){
        println("Adult")
    }
    else if (age>55){
        println("Senior")
    }
    else{
        println("Invalid Age")
    }
}

