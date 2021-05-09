/*
 * Copyright © 2021 Travis Hoffman (travis@firkin.io)
 * Copyright © 2021 Firkin IO (https://firkin.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.firkin.kstreams.normalizer.errors;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

/** Model for a HelloWorld errors topic. This acts as a source Error Topic Schema for Normalizer test Cases. */
@org.apache.avro.specific.AvroGenerated
public class HelloError extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6435293923866109655L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HelloError\",\"namespace\":\"io.firkin.kstreams.normalizer.errors\",\"doc\":\"Model for a HelloWorld errors topic. This acts as a source Error Topic Schema for Normalizer test Cases.\",\"fields\":[{\"name\":\"eventId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\",\"default\":\"\"},\"doc\":\"The business UUID \"},{\"name\":\"correlationId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\",\"default\":\"\"},\"doc\":\"The system-wide correlation UUID, which can be used for event tracing across systems.\"},{\"name\":\"timestamp\",\"type\":{\"type\":\"long\",\"logicalType\":\"date\"}},{\"name\":\"personName\",\"type\":{\"type\":\"string\",\"default\":\"World\"},\"doc\":\"The name of the person to say hello to.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HelloError> ENCODER =
      new BinaryMessageEncoder<HelloError>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HelloError> DECODER =
      new BinaryMessageDecoder<HelloError>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<HelloError> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<HelloError> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<HelloError> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HelloError>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this HelloError to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a HelloError from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a HelloError instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static HelloError fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The business UUID  */
   private CharSequence eventId;
  /** The system-wide correlation UUID, which can be used for event tracing across systems. */
   private CharSequence correlationId;
   private long timestamp;
  /** The name of the person to say hello to. */
   private CharSequence personName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HelloError() {}

  /**
   * All-args constructor.
   * @param eventId The business UUID 
   * @param correlationId The system-wide correlation UUID, which can be used for event tracing across systems.
   * @param timestamp The new value for timestamp
   * @param personName The name of the person to say hello to.
   */
  public HelloError(CharSequence eventId, CharSequence correlationId, Long timestamp, CharSequence personName) {
    this.eventId = eventId;
    this.correlationId = correlationId;
    this.timestamp = timestamp;
    this.personName = personName;
  }

  public SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return eventId;
    case 1: return correlationId;
    case 2: return timestamp;
    case 3: return personName;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: eventId = (CharSequence)value$; break;
    case 1: correlationId = (CharSequence)value$; break;
    case 2: timestamp = (Long)value$; break;
    case 3: personName = (CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'eventId' field.
   * @return The business UUID 
   */
  public CharSequence getEventId() {
    return eventId;
  }


  /**
   * Sets the value of the 'eventId' field.
   * The business UUID 
   * @param value the value to set.
   */
  public void setEventId(CharSequence value) {
    this.eventId = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The system-wide correlation UUID, which can be used for event tracing across systems.
   */
  public CharSequence getCorrelationId() {
    return correlationId;
  }


  /**
   * Sets the value of the 'correlationId' field.
   * The system-wide correlation UUID, which can be used for event tracing across systems.
   * @param value the value to set.
   */
  public void setCorrelationId(CharSequence value) {
    this.correlationId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'personName' field.
   * @return The name of the person to say hello to.
   */
  public CharSequence getPersonName() {
    return personName;
  }


  /**
   * Sets the value of the 'personName' field.
   * The name of the person to say hello to.
   * @param value the value to set.
   */
  public void setPersonName(CharSequence value) {
    this.personName = value;
  }

  /**
   * Creates a new HelloError RecordBuilder.
   * @return A new HelloError RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new HelloError RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HelloError RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * Creates a new HelloError RecordBuilder by copying an existing HelloError instance.
   * @param other The existing instance to copy.
   * @return A new HelloError RecordBuilder
   */
  public static Builder newBuilder(HelloError other) {
    if (other == null) {
      return new Builder();
    } else {
      return new Builder(other);
    }
  }

  /**
   * RecordBuilder for HelloError instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HelloError>
    implements org.apache.avro.data.RecordBuilder<HelloError> {

    /** The business UUID  */
    private CharSequence eventId;
    /** The system-wide correlation UUID, which can be used for event tracing across systems. */
    private CharSequence correlationId;
    private long timestamp;
    /** The name of the person to say hello to. */
    private CharSequence personName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[1].schema(), other.correlationId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.personName)) {
        this.personName = data().deepCopy(fields()[3].schema(), other.personName);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing HelloError instance
     * @param other The existing instance to copy.
     */
    private Builder(HelloError other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[1].schema(), other.correlationId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.personName)) {
        this.personName = data().deepCopy(fields()[3].schema(), other.personName);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'eventId' field.
      * The business UUID 
      * @return The value.
      */
    public CharSequence getEventId() {
      return eventId;
    }


    /**
      * Sets the value of the 'eventId' field.
      * The business UUID 
      * @param value The value of 'eventId'.
      * @return This builder.
      */
    public Builder setEventId(CharSequence value) {
      validate(fields()[0], value);
      this.eventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventId' field has been set.
      * The business UUID 
      * @return True if the 'eventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventId' field.
      * The business UUID 
      * @return This builder.
      */
    public Builder clearEventId() {
      eventId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * The system-wide correlation UUID, which can be used for event tracing across systems.
      * @return The value.
      */
    public CharSequence getCorrelationId() {
      return correlationId;
    }


    /**
      * Sets the value of the 'correlationId' field.
      * The system-wide correlation UUID, which can be used for event tracing across systems.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public Builder setCorrelationId(CharSequence value) {
      validate(fields()[1], value);
      this.correlationId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * The system-wide correlation UUID, which can be used for event tracing across systems.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * The system-wide correlation UUID, which can be used for event tracing across systems.
      * @return This builder.
      */
    public Builder clearCorrelationId() {
      correlationId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'personName' field.
      * The name of the person to say hello to.
      * @return The value.
      */
    public CharSequence getPersonName() {
      return personName;
    }


    /**
      * Sets the value of the 'personName' field.
      * The name of the person to say hello to.
      * @param value The value of 'personName'.
      * @return This builder.
      */
    public Builder setPersonName(CharSequence value) {
      validate(fields()[3], value);
      this.personName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'personName' field has been set.
      * The name of the person to say hello to.
      * @return True if the 'personName' field has been set, false otherwise.
      */
    public boolean hasPersonName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'personName' field.
      * The name of the person to say hello to.
      * @return This builder.
      */
    public Builder clearPersonName() {
      personName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HelloError build() {
      try {
        HelloError record = new HelloError();
        record.eventId = fieldSetFlags()[0] ? this.eventId : (CharSequence) defaultValue(fields()[0]);
        record.correlationId = fieldSetFlags()[1] ? this.correlationId : (CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (Long) defaultValue(fields()[2]);
        record.personName = fieldSetFlags()[3] ? this.personName : (CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HelloError>
    WRITER$ = (org.apache.avro.io.DatumWriter<HelloError>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HelloError>
    READER$ = (org.apache.avro.io.DatumReader<HelloError>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










