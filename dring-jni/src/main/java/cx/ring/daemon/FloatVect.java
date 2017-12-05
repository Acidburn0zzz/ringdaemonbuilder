/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cx.ring.daemon;

public class FloatVect {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FloatVect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloatVect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RingserviceJNI.delete_FloatVect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FloatVect() {
    this(RingserviceJNI.new_FloatVect__SWIG_0(), true);
  }

  public FloatVect(long n) {
    this(RingserviceJNI.new_FloatVect__SWIG_1(n), true);
  }

  public long size() {
    return RingserviceJNI.FloatVect_size(swigCPtr, this);
  }

  public long capacity() {
    return RingserviceJNI.FloatVect_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    RingserviceJNI.FloatVect_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return RingserviceJNI.FloatVect_isEmpty(swigCPtr, this);
  }

  public void clear() {
    RingserviceJNI.FloatVect_clear(swigCPtr, this);
  }

  public void add(float x) {
    RingserviceJNI.FloatVect_add(swigCPtr, this, x);
  }

  public float get(int i) {
    return RingserviceJNI.FloatVect_get(swigCPtr, this, i);
  }

  public void set(int i, float val) {
    RingserviceJNI.FloatVect_set(swigCPtr, this, i, val);
  }

}
