package edu.bu.met.cs665.condiment;

/**
 * Easily convert units to a text string for metric or imperial locale
 */
public enum Unit {
  IMPERIAL_UNIT("1 tbsp"),
  METRIC_UNIT("15 ml");

  private final String unit;

  Unit(String unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return unit;
  }
}
