LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_PACKAGE_NAME := SMDMPoCSystemApp

LOCAL_PROGUARD_FLAG_FILES := proguard.flags

#LOCAL_STATIC_JAVA_LIBRARIES := guava

LOCAL_PRIVILEGED_MODULE := true

include $(BUILD_PACKAGE)
