FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-add-beaglebone-green-wireless-device-tree-support.patch"
SRC_URI += "file://wl18xx.cfg"
SRC_URI += "file://test-wifi.cfg"
SRC_URI += "file://usb-gadget-eth.cfg"
SRC_URI += "file://iio.cfg"
SRC_URI += "file://i2c-debug.cfg"
SRC_URI += "file://iio-debug.cfg"
SRC_URI += "file://iio-triggers.cfg"

KERNEL_DEVICETREE_beaglebone += "am335x-bonegreen-wireless.dtb"
KERNEL_MODULE_AUTOLOAD += "g_ether"
