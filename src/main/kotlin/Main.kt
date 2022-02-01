import notes.Comment
import notes.Note
import notes.NoteService

fun main() {
   /* val newPost = WallService
//    newPost.add(Post(2))
    newPost.add(Post(3))
//    newPost.update(Post(999, text = "nenene"))
    newPost.createComment(Comment(2,4))
    println(newPost)
    val att: Attachments = VideoAttachment(Video())
//    val att2: Attachments = VideoAttachment(Video(13))
    println(att.type)
//    println(att2)*/
    val comment = NoteService()
    comment.add(Note(2, "no no no"))
//    comment.add(Note(5, "well well well"))

    comment.addComment(2, Comment(id = 1,message = "hello"))
//
    comment.addComment(2, Comment(id = 2,message = "goodbye"))
//    comment.addComment(5, Comment(id = 2,message = "yessss"))
    println(comment.newList)
    println("--------------------")
//
    comment.update(Note(2,"oh no"))
    println(comment.newList)
//    comment.deleteComment(2,1)
//    println(comment)
//    println("--------------------")
//    comment.delete(Note(2))
//    println(comment)
//    comment.get()
//    comment.add(Note(2, "no no no"))
//
//    comment.getByID(3)
//    comment.getByID(5)
comment.editComment(3,Comment(2,message = "jiojiok"))
    println(comment.newList)
    println("________________________________")
    comment.get()
}