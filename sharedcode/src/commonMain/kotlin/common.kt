package org.kotlin.mpp.mobile

expect fun platformName(): String

fun createApplicationScreenMessage() : JetMessage {
  return JetMessage("Hello from JET ${platformName()} team")
}