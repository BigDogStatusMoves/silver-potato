fun main() {

    val rhymesWithBanana = Fruit("Orange", 10.0, 3.4)
    val flaminHot = Pepper(5000.0, "Jalapeno", 5.0, 5.1)
    val bookworm = Fruit("Apple",10.55,5.5)
    val items: MutableList<Product> = mutableListOf(rhymesWithBanana, flaminHot, bookworm)
    val itemNumbers = mutableListOf<Int>(1, 2, 3)
    var userResponse: Int


    do {
        println("Welcome! Are you an employee or a customer?")
        println("1) Employee")
        println("2) Customer")
        println("3) Exit")
        userResponse = readln().toInt()
    } while (userResponse < 1 || userResponse > 3)
    when (userResponse) {
        1 -> {
            println("Enter Password: ") //hint: admin
            val userResponse2 = readln()
            val result = userResponse2.compareTo("admin", false)
            if (result == 0) {
                do {
                    println("Welcome!")
                    println("1) Add Item")
                    println("2) Remove Item")
                    println("3) View Items")
                    println("4) Exit")
                    userResponse = readln().toInt()
                } while (userResponse < 1 || userResponse > 4)
                when (userResponse) {
                    1 -> {
                        do {
                            println("What would you like to add?")
                            println("1) Fruit")
                            println("2) Pepper")
                            println("3) Exit")
                            userResponse = readln().toInt()
                        } while (userResponse < 1 || userResponse > 3)
                        when (userResponse) {
                            1 -> {
                                println("What is the name of this fruit?")
                                val newFruit = readln()
                                println("What is the price of this fruit?")
                                val newFruitPrice = readln().toDouble()
                                println("What is the age of this fruit in days?")
                                val newFruitAge = readln().toDouble()
                                println(
                                    "You are adding this item: \nType: Fruit" +
                                            "\nName: $newFruit" +
                                            "\nPrice: $newFruitPrice" +
                                            "\nAge: $newFruitAge" +
                                            "\nIs this correct?")
                                do {
                                    println("1) Yes")
                                    println("2) No")
                                    userResponse = readln().toInt()
                                } while (userResponse<1 || userResponse>2)
                                when (userResponse){
                                    1 -> {
                                        val addedFruit = Fruit(newFruit, newFruitPrice, newFruitAge)
                                        items.add(itemNumbers.last(), addedFruit)
                                        itemNumbers.add(itemNumbers.last(), itemNumbers.last() + 1)
                                        println("The item was added. The list is now as follows: ")
                                        for (i in itemNumbers) {
                                            println("${itemNumbers[i - 1]}) ${items[i - 1].name}")
                                        }
                                    }
                                    2 -> {println("Cancelling process.")
                                        main()
                                    }
                                }
                            }

                            2 -> {
                                println("What is the name of this pepper?")
                                val newPepper = readln()
                                println("What is the price of this pepper?")
                                val newPepperPrice = readln().toDouble()
                                println("What is the age of this pepper in days?")
                                val newPepperAge = readln().toDouble()
                                println("What is the scoville value of this pepper?")
                                val newPepperScoville = readln().toDouble()
                                println("You are adding this item:" +
                                        "\nType: Fruit" +
                                        "\nName: $newPepper" +
                                        "\nPrice: $newPepperPrice" +
                                        "\nAge: $newPepperAge" +
                                        "\nScoville Value: $newPepperScoville" +
                                        "\nIs this correct?")
                                do {
                                    println("1) Yes")
                                    println("2) No")
                                    userResponse = readln().toInt()
                                } while (userResponse < 1 || userResponse > 2)
                                when (userResponse){
                                    1 -> {
                                        val addedPepper = Pepper(newPepperScoville,newPepper,newPepperPrice,newPepperAge)
                                        items.add(itemNumbers.last(),addedPepper)
                                        itemNumbers.add(itemNumbers.last(),itemNumbers.last()+1)
                                        println("The item was added. The list is now as follows: ")
                                        for (i in itemNumbers) {
                                            println("${itemNumbers[i - 1]}) ${items[i - 1].name}")
                                        }
                                    }
                                    2 -> {
                                        println("Cancelling process.")
                                        main()
                                    }
                                }

                            }


                            3 -> {
                                println("Exiting.")
                                main()
                            }
                        }

                    }

                    2 -> {
                        println("Which item would you like to remove?")
                        do {
                            for (i in itemNumbers) {
                                println("${itemNumbers[i - 1]}) ${items[i - 1].name}")
                            }
                            userResponse = readln().toInt()
                            items.removeAt(userResponse - 1)
                            itemNumbers.removeAt(userResponse - 1)

                        } while (userResponse > itemNumbers.indexOf(itemNumbers.last()) + 2 || userResponse < itemNumbers.indexOf(itemNumbers.first()))
                        println("The item has been removed. The list is now as follows: ")
                        for (i in itemNumbers) {
                            println("${itemNumbers[i - 1]}) ${items[i - 1].name}")
                        }
                    }

                    3 -> {
                        println("The list of current items is as follows: ")
                        for (i in itemNumbers) {
                            println("${itemNumbers[i - 1]}) ${items[i - 1].name}: ${items[i - 1].age} days old, $${items[i - 1].price}")
                        }
                        main()
                    }

                    4 ->{
                        println("Closing program.")
                    }

                }
            } else {
                println("Incorrect password.")
            }
        }

        2 -> {
            println("Welcome, valued customer!")
            do {
                println("1) View Current Stock")
                println("2) Contact Us")
                println("3) Exit")
                userResponse = readln().toInt()
            } while (userResponse < 1 || userResponse > 3)
            when (userResponse) {
                1 -> {
                    println("Our list of items is as follows: ")

                    for (i in itemNumbers) {
                        println("${itemNumbers[i - 1]}) ${items[i - 1].name}: ${items[i - 1].age} days old, $${items[i - 1].price}")
                    }
                }


                2 -> {
                    println("Find our store at: ")
                    println("308 Negra Arroyo Lane")
                    println("Albuquerque, New Mexico, 87104")
                    println("Contact our phone number: ")
                    println("420-694-2069")
                    main()
                }
                3 -> {
                    println("Exiting.")
                    main()
                }
            }

        }

        3 -> {
            println("Exiting program.")
        }

    }
}

