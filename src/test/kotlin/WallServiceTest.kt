import Post.Comment
import Post.Post
import Post.PostNotFoundException
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

   /* @Test
    fun add_isNotNull() {
        val newPost = WallService
        val expected = newPost.add(Post(0))
        val actual = Post(1)
        assertEquals(expected, actual)
    }

    @Test
    fun update_idIsExists() {
        val newPost = WallService
        newPost.add(Post(12))
        val expected = newPost.update(Post(13, text = "wellwellwell"))
        assertTrue(expected)
    }

    @Test
    fun update_idIsNotExists() {
        val newPost = WallService
        newPost.add(Post(12))
        val expected = newPost.update(Post(11, text = "wellwellwell"))
        assertFalse(expected)
    }

    @Test(expected = PostNotFoundException::class)
    fun createComment_shouldThrowException() {
        val newPost = WallService
        newPost.add(Post(12))
        val expected = newPost.createComment(Comment(1,11))
        val actual = PostNotFoundException("")
        assertEquals(expected, actual)
    }*/

//    @Test
//    fun createComment_shouldNotThrowException() {
//        val newPost = WallService
//        newPost.add(Post(12))
//        val expected = newPost.createComment(Comment(1,13))
//        val actual = Comment(1,13)
//        assertEquals(expected, actual)
//    }
}