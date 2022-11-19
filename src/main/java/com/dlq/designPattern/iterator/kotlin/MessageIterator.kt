package com.dlq.designPattern.iterator.kotlin

class MessageIterator(
    val messageHolder: MessageHolder
) : Iterator<PhoneMessage> {

    var index: Int = 0

    override fun hasNext(): Boolean {
        return index < messageHolder.phoneMessageArray.size
    }

    override fun next(): PhoneMessage {
        val phoneMessage = messageHolder.phoneMessageArray.get(index)
        index++
        return phoneMessage
    }
}