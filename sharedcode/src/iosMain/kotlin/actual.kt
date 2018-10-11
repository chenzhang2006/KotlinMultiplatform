package org.kotlin.mpp.mobile

import platform.UIKit.UIDevice

actual fun platformName(): String {

  return UIDevice.currentDevice.systemName()

}



//https://stackoverflow.com/a/24505884