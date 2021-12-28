package Post

data class Comments(
    val count: Int = 0, // количество комментариев;
    val canPost: Boolean = true, // информация о том, может ли текущий пользователь комментировать запись
    val groupsCanPost: Boolean = true, //информация о том, могут ли сообщества комментировать запись;
    val canClose: Boolean = false, //может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean = false //может ли текущий пользователь открыть комментарии к записи.*/
)
