package org.fusesource.rocksdbjni.internal;


/**
 * @author: aigupta
 */
public class WriteOptions
{
  private boolean sync;
  private boolean disableWAL;


  public boolean sync()
  {
    return sync;
  }

  public WriteOptions sync(boolean sync)
  {
    this.sync = sync;
    return this;
  }

  public boolean disableWAL() {
    return disableWAL;
  }

  public WriteOptions disableWAL(boolean disableWAL) {
    this.disableWAL = disableWAL;
    return this;
  }

}
