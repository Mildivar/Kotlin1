package notes

data class Comment(
    val id: Int = 0,
//    var deleted: Boolean = false,
    val noteId: Int = 0,    // идентификатор заметки положительное число, обязательный параметр
    val ownerId: Int = 0, /* идентификатор владельца заметки положительное число,
               по умолчанию идентификатор текущего пользователя*/
    val replyTo: Int = 0,    /*//идентификатор пользователя, ответом на комментарий которого является
добавляемый комментарий (не передаётся, если комментарий не является ответом) положительное число*/
    var message: String = "",    // текст комментария строка, обязательный параметр
)




