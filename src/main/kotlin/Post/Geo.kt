package Post

data class Geo(
    val type: String = "", // тип места;
    val coordinates: String = "", // координаты места;
    val place: Place = Place() // описание места (если оно добавлено). Объект места.
)
