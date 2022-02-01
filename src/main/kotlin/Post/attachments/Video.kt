package Post.attachments

data class Video (
    val vid: Int = 0, // Идентификатор видеозаписи.
    val ownerId:Int = 0, // Идентификатор владельца видеозаписи.
    val title:String = "", // Название видеозаписи.
    val description:String = "", // Текст описания видеозаписи.
    val duration:Int = 0, //	Длительность ролика в секундах.
    val link:String = "", // Строка, состоящая из ключа video+vid.
    val image:String=  "", // URL изображения-обложки ролика с размером 160x120 px.
    val imageMedium:String = "", // URL изображения-обложки ролика с размером 320x240 px.
    val date:Int = 0, //	Дата добавления видеозаписи в формате Unix time.
    val player:String = "", /*	Адрес страницы с плеером, который можно использовать для
                          воспроизведения ролика в браузере.
                          Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.*/
)