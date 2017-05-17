SUMMARY = "Industrial I/O analysis tools for Linux"

LICENSE = "GPLv2"

inherit kernelsrc

B = "${WORKDIR}/${BPN}-${PV}"
S_IIO = "${S}/tools/iio"

EXTRA_OEMAKE = "\
    'CC=${CC}' \
    'AR=${AR}' \
    'LD=${LD}' \
    'CFLAGS=${CFLAGS}' \
    'LDFLAGS=${LDFLAGS}' \
"

do_compile() {
   oe_runmake -C "${S_IIO}" "O=${B}" all
}

do_install() {
     oe_runmake -C "${S_IIO}" install INSTALL_ROOT=${D} BINDIR=${sbindir}
}


inherit package

FILES_${PN} += "${sbindir}/iio_event_monitor"
FILES_${PN} += "${sbindir}/lsiio"
FILES_${PN} += "${sbindir}/iio_generic_buffer"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} = "ldflags"

FILES_{PN}-dbg += "${sbindir}/.debug/iio_event_monitor"
FILES_{PN}-dbg += "${sbindir}/.debug/lsiio"
FILES_{PN}-dbg += "${sbindir}/.debug/iio_generic_buffer"

PACKAGES = "${PN} ${PN}-dbg"
# PACKAGES = "${PN}"
