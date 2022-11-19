package com.dlq.designPattern.iterator.kotlin

class MessageHolder(
    val phoneMessageArray: Array<PhoneMessage>
) : Iterable<PhoneMessage> {

    override fun iterator(): Iterator<PhoneMessage> {
        return MessageIterator(this)
    }

}