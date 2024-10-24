fun main(){
    val weight: Double 100.0
    val height: Double 5.0
    val BMI:  = weight/ (height*height)
if (BMI<18.5){
    println("Underweight")
}
else if(BMI>=18.5 && <=24.9){
    println("Normal weight")
}
else if(BMI>=25.0 && <=29.9){
    println("overweight")
}
else if(BMI>30.0 ){
    println("Obesity")
}
else{
    println("Invalid BMI")
}

}