fun main(){
    val temperature:  Int = 28
if (temperature<0){
    println("Freezing")
}
else if (temperature>=0 && <=15){
    println("Cold")
}
else if (temperature>=16 && <=25){
    println("Moderate")
}
else if (temperature>=26 && <=35){
    println("Warm")
}
else if (temperature>35){
    println("Hot")
}
else{
    println("Invalid Temperature")
}
}