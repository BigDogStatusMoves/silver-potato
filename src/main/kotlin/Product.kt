open class Product(name: String, price: Double, age: Double) {
    var name: String = ""
        get() = field
        set(value){
            field = value

        }
    var price: Double = 0.0
        get() = field
        set(value){
            field = value

        }
    var age: Double = 0.0
        get() = field
        set(value) {
            field = value
        }


    init{
        this.name = name
        this.price = price
        this.age = age
    }



}