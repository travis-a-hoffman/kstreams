/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.firkin.kstreams.normalizer.errors;
/** Environment where the error took place. */
@org.apache.avro.specific.AvroGenerated
public enum Environments implements org.apache.avro.generic.GenericEnumSymbol<Environments> {
  DEV, QA, STG, PRD  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Environments\",\"namespace\":\"io.firkin.kstreams.normalizer.errors\",\"doc\":\"Environment where the error took place.\",\"symbols\":[\"DEV\",\"QA\",\"STG\",\"PRD\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
