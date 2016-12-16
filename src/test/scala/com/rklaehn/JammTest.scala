package com.rklaehn

import org.github.jamm.MemoryMeter

object JammTest extends App {
	val o = new Array[Byte](1024*1024)
    val mm = new MemoryMeter()
    println("Size of new Array[Byte](1024*1024): " + mm.measureDeep(o))
}
