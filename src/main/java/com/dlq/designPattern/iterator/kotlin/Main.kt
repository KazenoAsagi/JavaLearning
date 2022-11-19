package com.dlq.designPattern.iterator.kotlin


fun main() {
    val message1 = PhoneMessage(20, "UTF_8")
    val message2 = PhoneMessage(28, "UTF_16")

    val messageHolder = MessageHolder(arrayOf(message1, message2))

    val iterator = messageHolder.iterator()
    while (iterator.hasNext()) {
        val phoneMessage = iterator.next()
        println(phoneMessage)
    }

}
