/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.ultimateCreditCard.Sdk;

public class UltCreditCardSdkEngine {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UltCreditCardSdkEngine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UltCreditCardSdkEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ultimateCreditCardSdkJNI.delete_UltCreditCardSdkEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static UltCreditCardSdkResult init(Object assetManager, String jsonConfig) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_init__SWIG_0(assetManager, jsonConfig), true);
  }

  public static UltCreditCardSdkResult init(Object assetManager) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_init__SWIG_1(assetManager), true);
  }

  public static UltCreditCardSdkResult deInit() {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_deInit(), true);
  }

  public static UltCreditCardSdkResult process(ULTCCARD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples, long imageStrideInSamples, int imageExifOrientation) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_process__SWIG_0(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples, imageStrideInSamples, imageExifOrientation), true);
  }

  public static UltCreditCardSdkResult process(ULTCCARD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples, long imageStrideInSamples) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_process__SWIG_1(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples, imageStrideInSamples), true);
  }

  public static UltCreditCardSdkResult process(ULTCCARD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_process__SWIG_2(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples), true);
  }

  public static UltCreditCardSdkResult process(ULTCCARD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes, long uvPixelStrideInBytes, int exifOrientation) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_process__SWIG_3(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes, uvPixelStrideInBytes, exifOrientation), true);
  }

  public static UltCreditCardSdkResult process(ULTCCARD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes, long uvPixelStrideInBytes) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_process__SWIG_4(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes, uvPixelStrideInBytes), true);
  }

  public static UltCreditCardSdkResult process(ULTCCARD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_process__SWIG_5(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes), true);
  }

  public static int exifOrientation(java.nio.ByteBuffer jpegMetaDataPtr, long jpegMetaDataSize) {
    return ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_exifOrientation(jpegMetaDataPtr, jpegMetaDataSize);
  }

  public static UltCreditCardSdkResult requestRuntimeLicenseKey(boolean rawInsteadOfJSON) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_requestRuntimeLicenseKey__SWIG_0(rawInsteadOfJSON), true);
  }

  public static UltCreditCardSdkResult requestRuntimeLicenseKey() {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_requestRuntimeLicenseKey__SWIG_1(), true);
  }

  public static UltCreditCardSdkResult warmUp(ULTCCARD_SDK_IMAGE_TYPE imageType) {
    return new UltCreditCardSdkResult(ultimateCreditCardSdkJNI.UltCreditCardSdkEngine_warmUp(imageType.swigValue()), true);
  }

}
