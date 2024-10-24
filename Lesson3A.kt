fun main(){
    // For Loops
    // A for loop is a control flow statement that allows you to execute a block of code repeatedly for a specified number of iterations or over a collection of items.
    // It can be used as follows:
    // 1. Loop through a range
    for(i in 1..10){
        println(i)
    }
    for(i in 30..50){
        println(i)
    }


    // 2. Loop through a range in steps
    // Loop from 1 to 10 in a step of 2
    for(i in 1..10 step 2){
        println(i)
    }

    // 3. Loop through a range in down steps
    // Loop from 100 to 0 in down steps of 5
    for(i in 100 downTo 0 step 5){
        println(i)
    }
    // 4. Loop through a list(Collection of items)
    val students = listOf("James","Henry","Betty","Rose","Celly","kim","Tony")
    for(i in students){
        println(i)
    }

    // List of counties
    val counties = listOf("Nairobi","Machakos","Kitui","Nyeri","Kiambu","Mombasa","Kilifi","Taita Taveta","Lamu","Tanariver","Nakuru")
    for (county in counties){
        println(county)
    }

    // List of Animals in a zoo 
    val animals = listOf("Lion","Elephant","Hyena","giraffe","Antelope")
    for (animal in animals){
        println(animal)
    }

    // List of cart items 
    val products = listOf("Onions","Tomatoes","Milk","Bread","Yams")
    for (product in products){
        println(product)
    }

    // List of Months in a year
     val months = listOf("January","February","March","April","May","June","July","August","September","October","November","December")
    for (month in months){
        println(month)
    }

    // List of Books
    val books = listOf("The River Between","The Constitution","Army dead","Killer Principles","Hunting Skills","How to Manage Stress")
    for (book in books){
        println(book)
    }

    // List of Movies 

    val movies = listOf("Madam Webb","London has Fallen","The Man","Predator","The Sucide Squad","Land of the Bad")
    for (movie in movies){
        println(movie)
    }
}