package notes

import CrudID

class Note(id: Int, val text: String = "", var comments: MutableList<Comment> = mutableListOf()) : CrudID(id) {

    override fun toString(): String {
        return "ID: $id / TEXT:  $text / COMMENT: $comments)"
    }


}