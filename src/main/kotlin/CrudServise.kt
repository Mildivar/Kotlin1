abstract class CrudServise<E : CrudID> {
    val newList = mutableListOf<E>()
    val newID = 1

    fun add(item: E): E {
//        item.id += newID
        newList += item
        return newList.last()
    }

    open fun update(item: E): Boolean {
        for ((index, list) in newList.withIndex()) {
            if (list.id == item.id) {
                newList[index] = item
                return true
            }
        }
        return false
    }

    fun edit(item: E) {
        for (list in newList) {
            if (list.id == item.id) list.id = item.id
        }
    }

    fun delete(item: E): E {
        for (list in newList) {
            if (list.id == item.id) newList.remove(list)
        }
        return newList.last()
    }


    fun get() {
        println(newList)
    }

    fun getByID(id: Int):E? {
         return newList.find { it.id == id }
    }
}