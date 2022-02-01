package notes

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.exp

class NoteServiceTest {

    @Test
    fun update() {
        val note = NoteService()
        note.add(Note(12,"Note num.twelve"))
        val actual = note.update(Note(12))
        assertTrue(actual)
    }

    @Test
    fun addComment() {
        val note = NoteService()
        note.add(Note(12,"Note num.twelve"))
        val exp = note.addComment(12,Comment(1,0,0,0,"Comment one"))
        val act = note.getByID(12)?.comments?.getOrNull(0)
        assertEquals(exp,act)
    }

    @Test
    fun deleteComment() {
        val note = NoteService()
        note.add(Note(12,"Note num.twelve"))
        note.addComment(12,Comment(1,0,0,0,"Comment one"))
        val expected = note.deleteComment(12,1)
        val actual = note.getByID(12)?.comments?.getOrNull(0)
        assertEquals(expected,actual)
    }

    @Test
    fun editComment() {
        val note = NoteService()
        note.add(Note(12,"Note num.twelve"))
        note.addComment(12,Comment(1,0,0,0,"Comment one"))
        val expected = note.editComment(12,Comment(1, 0,0,0,"Edited comment"))
        val actual = note.getByID(12)?.comments?.get(0)
        assertEquals(expected,actual)
    }


}