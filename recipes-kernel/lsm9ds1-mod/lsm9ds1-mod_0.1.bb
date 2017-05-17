SUMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRCREV = "b59d89c6e2ffd9866c749aa051c702827a230ae9"
PV = "0.1+git${SRCPV}"
PR = "r0"



SRC_URI = "git://github.com/jsagfr/lsm9ds1.git;protocol=git"
# SRC_URI = "file://Makefile \
#            file://lsm9ds1.c \
#            file://COPYING \
#           "
# SRC_URI[md5sum] = "ba23b92727ae8e5044e1f085a44dbc31"
# SRC_URI[sha256sum] = "fbbb93281e3dded0e732f82c900d3befc506c86a62f3e0bb731f6eafa6abd391"

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
