package com.dlq.designPattern.iterator.kotlin

data class PhoneMessage(
    val length: Int,
    val charset: String
) {
    override fun toString(): String {
        return "length: " + length +
                ", charset: " + charset
    }
}