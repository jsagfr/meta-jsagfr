DESCRIPTION = "A console-only image with more full-featured Linux system \
functionality installed."

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    iw wpa-supplicant \
    linux-firmware-wl18xx \
    init-ifupdown \
    kernel-modules \
    lsm9ds1-mod \
    i2c-tools \
    iio-tools \
    libiio \
    rt-tests \
    kexec-tools \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image
