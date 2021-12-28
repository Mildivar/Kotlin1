import Post.Comment
import Post.Post
import Post.PostNotFoundException
import java.lang.NullPointerException

object WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 1
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post
        post.id = when (true) {
            post.id < 0 -> throw NullPointerException("id should be more than 0")
            posts.isNotEmpty() -> posts.last().id + nextId
            else -> 0
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex())
            if (oldPost.id < 0) return false
            else if (post.id == oldPost.id) {
                val newPost = post.copy(ownerId = oldPost.ownerId, date = oldPost.date)
                posts[index] = newPost
                return true
            }
        return false
//        return throw RuntimeException("No such id - ${post.id}")
    }

    fun createComment(comment: Comment): Comment {
        for (post in posts) if (comment.from_id == post.id) {
            comments += comment
            return comment
        } else throw PostNotFoundException("PostNotFoundException")
        return comment

    }
}


