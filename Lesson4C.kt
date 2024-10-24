fun main(){
    // Functions with parameters
    // Functions with parameters are functions that takes argument when being called 
    fun goingToNarok(boaz: String){
        println("I am going to buy this $boaz")
    }
    // Call the function 
    goingToNarok("Cow")


    // Addition of two Numbers 
    fun addTwo(num1: Int, num2: Int){
        val sum = num1 + num2
        println("The sum is $sum")
    }
    addTwo(40,30)

    // Subtraction of two Numbers 
    fun subTwo(num1: Int, num2: Int){
        val sub = num1 - num2
        println("The subtraction is $sub")
    }
    subTwo(40,30)

    // Division of two Numbers 
    fun divTwo(num1: Int, num2: Int){
        val div = num1 / num2
        println("The Division is $div")
    }
    divTwo(80,30)

    // Product of two Numbers 
    fun productTwo(num1: Int, num2: Int){
        val product = num1 * num2
        println("The Product is $product")
    }
    productTwo(80,30)

}