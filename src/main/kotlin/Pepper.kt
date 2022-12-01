class Pepper (scoville: Double, name: String, price: Double, age: Double): Product(name,price,age) {
    //originally "spice" but made it more fitting and also accurate
    var scoville: Double = 0.0
        get() = field
        set(value){
            field = value
        }

    init {
        this.scoville = scoville
    }
}