DESCRIPTION = "Library for interfacing with Linux IIO devices"
SECTION = "examples"
LICENSE = "GPLv2.1"
PR = "r0"

DEPENDS = "libxml2"

SRC_URI = "git://github.com/analogdevicesinc/libiio.git;protocol=git;tag=v0.9"
SRC_URI[md5sum] = "b6a26db6856573113e0036995f0859cb"
SRC_URI[sha256sum] = "9fc258b92349c56d909f02e513dbb27e284d51d865987d0a77cbd0f3acde1767"

LIC_FILES_CHKSUM = "file://COPYING.txt;md5=7c13b3376cea0ce68d2d2da0a1b3a72c"


S = "${WORKDIR}/git"

inherit pkgconfig cmake

