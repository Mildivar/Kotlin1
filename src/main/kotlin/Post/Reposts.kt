package Post

data class Reposts(
    val count:Int = 0, //число пользователей, скопировавших запись
    val userReposted:Boolean = false // наличие репоста от текущего пользователя
)
