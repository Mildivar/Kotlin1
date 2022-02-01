package notes

import CrudServise

class NoteService : CrudServise<Note>() {

    override fun update(item: Note): Boolean {
        if (item.id < 0) return false
        for ((index, oldNote) in newList.withIndex()) {
            if (item.id == oldNote.id) {
                item.comments = oldNote.comments
                newList[index] = item
                item.id += newID
                return true
            }
        }
        return false
    }

    fun addComment(noteID: Int, comment: Comment):Comment {
        newList.find { it.id == noteID }?.comments?.add(comment)
        return comment
    }

    fun deleteComment(noteID: Int, commentID: Int): Comment? {
        val nnn = newList.find { it.id == noteID }?.comments?.find { it.id == commentID }
        nnn?.message = "Комментарий удалён"
        return nnn
    }

    fun editComment(noteID: Int,  comment: Comment): Comment {
//        newList.find { it.id == noteID }?.comments?.find { it.id == comment.id }.apply {  comment.message }
        for ((index,note) in newList.withIndex()){
            if (note.id == noteID) {
                for (comm in newList[index].comments) {
                    if (comm.id == comment.id) comm.message = comment.message
                }
            }

        }
        return comment
    }

    override fun toString(): String {
        return "$newList"
    }
}
