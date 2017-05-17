FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://interfaces-jsagfr"

do_install_append() {
	install -m 0644 ${WORKDIR}/interfaces-jsagfr ${D}${sysconfdir}/network/interfaces
}
