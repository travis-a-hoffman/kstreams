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
package com.bhg.common.errors;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Model for errors that arise from Confluent Connectors. Errors and message from specific connectors should be mapped to this schema. */
@org.apache.avro.specific.AvroGenerated
public class ConnectorCommonError extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5072197184513533674L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConnectorCommonError\",\"namespace\":\"com.bhg.common.errors\",\"doc\":\"Model for errors that arise from Confluent Connectors. Errors and message from specific connectors should be mapped to this schema.\",\"fields\":[{\"name\":\"correlation_id\",\"type\":\"string\",\"doc\":\"Unique id for event tracing\"},{\"name\":\"environment\",\"type\":{\"type\":\"enum\",\"name\":\"EnvironmentTypes\",\"doc\":\"Environment where the error took place.\",\"symbols\":[\"DEV\",\"QA\",\"STG\",\"PRD\",\"OTHER\"]}},{\"name\":\"environment_override\",\"type\":[\"null\",\"string\"],\"doc\":\"Custom environment identifier if OTHER\"},{\"name\":\"exception\",\"type\":\"string\",\"doc\":\"Error information from the connector\"},{\"name\":\"metadata\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"doc\":\"Keys value pairs for any domain specific metadata\"},{\"name\":\"source_message\",\"type\":\"string\",\"doc\":\"Message that caused the error\"},{\"name\":\"source_message_schema_name\",\"type\":\"string\",\"doc\":\"Schema name of the source message\"},{\"name\":\"source_message_offset\",\"type\":\"int\",\"doc\":\"Offset of the source message\"},{\"name\":\"source_message_partition\",\"type\":\"int\",\"doc\":\"Partition of the source message\"},{\"name\":\"source_topic\",\"type\":\"string\",\"doc\":\"Name of the topic the message was consumed from\"},{\"name\":\"timestamp\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<ConnectorCommonError> ENCODER =
      new BinaryMessageEncoder<ConnectorCommonError>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ConnectorCommonError> DECODER =
      new BinaryMessageDecoder<ConnectorCommonError>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ConnectorCommonError> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ConnectorCommonError> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ConnectorCommonError> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ConnectorCommonError>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ConnectorCommonError to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ConnectorCommonError from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ConnectorCommonError instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ConnectorCommonError fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Unique id for event tracing */
   private java.lang.CharSequence correlation_id;
   private com.bhg.common.errors.EnvironmentTypes environment;
  /** Custom environment identifier if OTHER */
   private java.lang.CharSequence environment_override;
  /** Error information from the connector */
   private java.lang.CharSequence exception;
  /** Keys value pairs for any domain specific metadata */
   private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> metadata;
  /** Message that caused the error */
   private java.lang.CharSequence source_message;
  /** Schema name of the source message */
   private java.lang.CharSequence source_message_schema_name;
  /** Offset of the source message */
   private int source_message_offset;
  /** Partition of the source message */
   private int source_message_partition;
  /** Name of the topic the message was consumed from */
   private java.lang.CharSequence source_topic;
   private java.time.LocalDate timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ConnectorCommonError() {}

  /**
   * All-args constructor.
   * @param correlation_id Unique id for event tracing
   * @param environment The new value for environment
   * @param environment_override Custom environment identifier if OTHER
   * @param exception Error information from the connector
   * @param metadata Keys value pairs for any domain specific metadata
   * @param source_message Message that caused the error
   * @param source_message_schema_name Schema name of the source message
   * @param source_message_offset Offset of the source message
   * @param source_message_partition Partition of the source message
   * @param source_topic Name of the topic the message was consumed from
   * @param timestamp The new value for timestamp
   */
  public ConnectorCommonError(java.lang.CharSequence correlation_id, com.bhg.common.errors.EnvironmentTypes environment, java.lang.CharSequence environment_override, java.lang.CharSequence exception, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> metadata, java.lang.CharSequence source_message, java.lang.CharSequence source_message_schema_name, java.lang.Integer source_message_offset, java.lang.Integer source_message_partition, java.lang.CharSequence source_topic, java.time.LocalDate timestamp) {
    this.correlation_id = correlation_id;
    this.environment = environment;
    this.environment_override = environment_override;
    this.exception = exception;
    this.metadata = metadata;
    this.source_message = source_message;
    this.source_message_schema_name = source_message_schema_name;
    this.source_message_offset = source_message_offset;
    this.source_message_partition = source_message_partition;
    this.source_topic = source_topic;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return correlation_id;
    case 1: return environment;
    case 2: return environment_override;
    case 3: return exception;
    case 4: return metadata;
    case 5: return source_message;
    case 6: return source_message_schema_name;
    case 7: return source_message_offset;
    case 8: return source_message_partition;
    case 9: return source_topic;
    case 10: return timestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: correlation_id = (java.lang.CharSequence)value$; break;
    case 1: environment = (com.bhg.common.errors.EnvironmentTypes)value$; break;
    case 2: environment_override = (java.lang.CharSequence)value$; break;
    case 3: exception = (java.lang.CharSequence)value$; break;
    case 4: metadata = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 5: source_message = (java.lang.CharSequence)value$; break;
    case 6: source_message_schema_name = (java.lang.CharSequence)value$; break;
    case 7: source_message_offset = (java.lang.Integer)value$; break;
    case 8: source_message_partition = (java.lang.Integer)value$; break;
    case 9: source_topic = (java.lang.CharSequence)value$; break;
    case 10: timestamp = (java.time.LocalDate)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'correlation_id' field.
   * @return Unique id for event tracing
   */
  public java.lang.CharSequence getCorrelationId() {
    return correlation_id;
  }


  /**
   * Sets the value of the 'correlation_id' field.
   * Unique id for event tracing
   * @param value the value to set.
   */
  public void setCorrelationId(java.lang.CharSequence value) {
    this.correlation_id = value;
  }

  /**
   * Gets the value of the 'environment' field.
   * @return The value of the 'environment' field.
   */
  public com.bhg.common.errors.EnvironmentTypes getEnvironment() {
    return environment;
  }


  /**
   * Sets the value of the 'environment' field.
   * @param value the value to set.
   */
  public void setEnvironment(com.bhg.common.errors.EnvironmentTypes value) {
    this.environment = value;
  }

  /**
   * Gets the value of the 'environment_override' field.
   * @return Custom environment identifier if OTHER
   */
  public java.lang.CharSequence getEnvironmentOverride() {
    return environment_override;
  }


  /**
   * Sets the value of the 'environment_override' field.
   * Custom environment identifier if OTHER
   * @param value the value to set.
   */
  public void setEnvironmentOverride(java.lang.CharSequence value) {
    this.environment_override = value;
  }

  /**
   * Gets the value of the 'exception' field.
   * @return Error information from the connector
   */
  public java.lang.CharSequence getException() {
    return exception;
  }


  /**
   * Sets the value of the 'exception' field.
   * Error information from the connector
   * @param value the value to set.
   */
  public void setException(java.lang.CharSequence value) {
    this.exception = value;
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return Keys value pairs for any domain specific metadata
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getMetadata() {
    return metadata;
  }


  /**
   * Sets the value of the 'metadata' field.
   * Keys value pairs for any domain specific metadata
   * @param value the value to set.
   */
  public void setMetadata(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.metadata = value;
  }

  /**
   * Gets the value of the 'source_message' field.
   * @return Message that caused the error
   */
  public java.lang.CharSequence getSourceMessage() {
    return source_message;
  }


  /**
   * Sets the value of the 'source_message' field.
   * Message that caused the error
   * @param value the value to set.
   */
  public void setSourceMessage(java.lang.CharSequence value) {
    this.source_message = value;
  }

  /**
   * Gets the value of the 'source_message_schema_name' field.
   * @return Schema name of the source message
   */
  public java.lang.CharSequence getSourceMessageSchemaName() {
    return source_message_schema_name;
  }


  /**
   * Sets the value of the 'source_message_schema_name' field.
   * Schema name of the source message
   * @param value the value to set.
   */
  public void setSourceMessageSchemaName(java.lang.CharSequence value) {
    this.source_message_schema_name = value;
  }

  /**
   * Gets the value of the 'source_message_offset' field.
   * @return Offset of the source message
   */
  public int getSourceMessageOffset() {
    return source_message_offset;
  }


  /**
   * Sets the value of the 'source_message_offset' field.
   * Offset of the source message
   * @param value the value to set.
   */
  public void setSourceMessageOffset(int value) {
    this.source_message_offset = value;
  }

  /**
   * Gets the value of the 'source_message_partition' field.
   * @return Partition of the source message
   */
  public int getSourceMessagePartition() {
    return source_message_partition;
  }


  /**
   * Sets the value of the 'source_message_partition' field.
   * Partition of the source message
   * @param value the value to set.
   */
  public void setSourceMessagePartition(int value) {
    this.source_message_partition = value;
  }

  /**
   * Gets the value of the 'source_topic' field.
   * @return Name of the topic the message was consumed from
   */
  public java.lang.CharSequence getSourceTopic() {
    return source_topic;
  }


  /**
   * Sets the value of the 'source_topic' field.
   * Name of the topic the message was consumed from
   * @param value the value to set.
   */
  public void setSourceTopic(java.lang.CharSequence value) {
    this.source_topic = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.time.LocalDate getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.time.LocalDate value) {
    this.timestamp = value;
  }

  /**
   * Creates a new ConnectorCommonError RecordBuilder.
   * @return A new ConnectorCommonError RecordBuilder
   */
  public static com.bhg.common.errors.ConnectorCommonError.Builder newBuilder() {
    return new com.bhg.common.errors.ConnectorCommonError.Builder();
  }

  /**
   * Creates a new ConnectorCommonError RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ConnectorCommonError RecordBuilder
   */
  public static com.bhg.common.errors.ConnectorCommonError.Builder newBuilder(com.bhg.common.errors.ConnectorCommonError.Builder other) {
    if (other == null) {
      return new com.bhg.common.errors.ConnectorCommonError.Builder();
    } else {
      return new com.bhg.common.errors.ConnectorCommonError.Builder(other);
    }
  }

  /**
   * Creates a new ConnectorCommonError RecordBuilder by copying an existing ConnectorCommonError instance.
   * @param other The existing instance to copy.
   * @return A new ConnectorCommonError RecordBuilder
   */
  public static com.bhg.common.errors.ConnectorCommonError.Builder newBuilder(com.bhg.common.errors.ConnectorCommonError other) {
    if (other == null) {
      return new com.bhg.common.errors.ConnectorCommonError.Builder();
    } else {
      return new com.bhg.common.errors.ConnectorCommonError.Builder(other);
    }
  }

  /**
   * RecordBuilder for ConnectorCommonError instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConnectorCommonError>
    implements org.apache.avro.data.RecordBuilder<ConnectorCommonError> {

    /** Unique id for event tracing */
    private java.lang.CharSequence correlation_id;
    private com.bhg.common.errors.EnvironmentTypes environment;
    /** Custom environment identifier if OTHER */
    private java.lang.CharSequence environment_override;
    /** Error information from the connector */
    private java.lang.CharSequence exception;
    /** Keys value pairs for any domain specific metadata */
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> metadata;
    /** Message that caused the error */
    private java.lang.CharSequence source_message;
    /** Schema name of the source message */
    private java.lang.CharSequence source_message_schema_name;
    /** Offset of the source message */
    private int source_message_offset;
    /** Partition of the source message */
    private int source_message_partition;
    /** Name of the topic the message was consumed from */
    private java.lang.CharSequence source_topic;
    private java.time.LocalDate timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.bhg.common.errors.ConnectorCommonError.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.correlation_id)) {
        this.correlation_id = data().deepCopy(fields()[0].schema(), other.correlation_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.environment)) {
        this.environment = data().deepCopy(fields()[1].schema(), other.environment);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.environment_override)) {
        this.environment_override = data().deepCopy(fields()[2].schema(), other.environment_override);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.exception)) {
        this.exception = data().deepCopy(fields()[3].schema(), other.exception);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.metadata)) {
        this.metadata = data().deepCopy(fields()[4].schema(), other.metadata);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.source_message)) {
        this.source_message = data().deepCopy(fields()[5].schema(), other.source_message);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.source_message_schema_name)) {
        this.source_message_schema_name = data().deepCopy(fields()[6].schema(), other.source_message_schema_name);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.source_message_offset)) {
        this.source_message_offset = data().deepCopy(fields()[7].schema(), other.source_message_offset);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.source_message_partition)) {
        this.source_message_partition = data().deepCopy(fields()[8].schema(), other.source_message_partition);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.source_topic)) {
        this.source_topic = data().deepCopy(fields()[9].schema(), other.source_topic);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[10].schema(), other.timestamp);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
    }

    /**
     * Creates a Builder by copying an existing ConnectorCommonError instance
     * @param other The existing instance to copy.
     */
    private Builder(com.bhg.common.errors.ConnectorCommonError other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.correlation_id)) {
        this.correlation_id = data().deepCopy(fields()[0].schema(), other.correlation_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.environment)) {
        this.environment = data().deepCopy(fields()[1].schema(), other.environment);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.environment_override)) {
        this.environment_override = data().deepCopy(fields()[2].schema(), other.environment_override);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.exception)) {
        this.exception = data().deepCopy(fields()[3].schema(), other.exception);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.metadata)) {
        this.metadata = data().deepCopy(fields()[4].schema(), other.metadata);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.source_message)) {
        this.source_message = data().deepCopy(fields()[5].schema(), other.source_message);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.source_message_schema_name)) {
        this.source_message_schema_name = data().deepCopy(fields()[6].schema(), other.source_message_schema_name);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.source_message_offset)) {
        this.source_message_offset = data().deepCopy(fields()[7].schema(), other.source_message_offset);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.source_message_partition)) {
        this.source_message_partition = data().deepCopy(fields()[8].schema(), other.source_message_partition);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.source_topic)) {
        this.source_topic = data().deepCopy(fields()[9].schema(), other.source_topic);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[10].schema(), other.timestamp);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'correlation_id' field.
      * Unique id for event tracing
      * @return The value.
      */
    public java.lang.CharSequence getCorrelationId() {
      return correlation_id;
    }


    /**
      * Sets the value of the 'correlation_id' field.
      * Unique id for event tracing
      * @param value The value of 'correlation_id'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setCorrelationId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.correlation_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'correlation_id' field has been set.
      * Unique id for event tracing
      * @return True if the 'correlation_id' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'correlation_id' field.
      * Unique id for event tracing
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearCorrelationId() {
      correlation_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'environment' field.
      * @return The value.
      */
    public com.bhg.common.errors.EnvironmentTypes getEnvironment() {
      return environment;
    }


    /**
      * Sets the value of the 'environment' field.
      * @param value The value of 'environment'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setEnvironment(com.bhg.common.errors.EnvironmentTypes value) {
      validate(fields()[1], value);
      this.environment = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'environment' field has been set.
      * @return True if the 'environment' field has been set, false otherwise.
      */
    public boolean hasEnvironment() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'environment' field.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearEnvironment() {
      environment = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'environment_override' field.
      * Custom environment identifier if OTHER
      * @return The value.
      */
    public java.lang.CharSequence getEnvironmentOverride() {
      return environment_override;
    }


    /**
      * Sets the value of the 'environment_override' field.
      * Custom environment identifier if OTHER
      * @param value The value of 'environment_override'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setEnvironmentOverride(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.environment_override = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'environment_override' field has been set.
      * Custom environment identifier if OTHER
      * @return True if the 'environment_override' field has been set, false otherwise.
      */
    public boolean hasEnvironmentOverride() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'environment_override' field.
      * Custom environment identifier if OTHER
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearEnvironmentOverride() {
      environment_override = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'exception' field.
      * Error information from the connector
      * @return The value.
      */
    public java.lang.CharSequence getException() {
      return exception;
    }


    /**
      * Sets the value of the 'exception' field.
      * Error information from the connector
      * @param value The value of 'exception'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setException(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.exception = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'exception' field has been set.
      * Error information from the connector
      * @return True if the 'exception' field has been set, false otherwise.
      */
    public boolean hasException() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'exception' field.
      * Error information from the connector
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearException() {
      exception = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'metadata' field.
      * Keys value pairs for any domain specific metadata
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getMetadata() {
      return metadata;
    }


    /**
      * Sets the value of the 'metadata' field.
      * Keys value pairs for any domain specific metadata
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setMetadata(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.metadata = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * Keys value pairs for any domain specific metadata
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'metadata' field.
      * Keys value pairs for any domain specific metadata
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearMetadata() {
      metadata = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_message' field.
      * Message that caused the error
      * @return The value.
      */
    public java.lang.CharSequence getSourceMessage() {
      return source_message;
    }


    /**
      * Sets the value of the 'source_message' field.
      * Message that caused the error
      * @param value The value of 'source_message'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setSourceMessage(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.source_message = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'source_message' field has been set.
      * Message that caused the error
      * @return True if the 'source_message' field has been set, false otherwise.
      */
    public boolean hasSourceMessage() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'source_message' field.
      * Message that caused the error
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearSourceMessage() {
      source_message = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_message_schema_name' field.
      * Schema name of the source message
      * @return The value.
      */
    public java.lang.CharSequence getSourceMessageSchemaName() {
      return source_message_schema_name;
    }


    /**
      * Sets the value of the 'source_message_schema_name' field.
      * Schema name of the source message
      * @param value The value of 'source_message_schema_name'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setSourceMessageSchemaName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.source_message_schema_name = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'source_message_schema_name' field has been set.
      * Schema name of the source message
      * @return True if the 'source_message_schema_name' field has been set, false otherwise.
      */
    public boolean hasSourceMessageSchemaName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'source_message_schema_name' field.
      * Schema name of the source message
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearSourceMessageSchemaName() {
      source_message_schema_name = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_message_offset' field.
      * Offset of the source message
      * @return The value.
      */
    public int getSourceMessageOffset() {
      return source_message_offset;
    }


    /**
      * Sets the value of the 'source_message_offset' field.
      * Offset of the source message
      * @param value The value of 'source_message_offset'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setSourceMessageOffset(int value) {
      validate(fields()[7], value);
      this.source_message_offset = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'source_message_offset' field has been set.
      * Offset of the source message
      * @return True if the 'source_message_offset' field has been set, false otherwise.
      */
    public boolean hasSourceMessageOffset() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'source_message_offset' field.
      * Offset of the source message
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearSourceMessageOffset() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_message_partition' field.
      * Partition of the source message
      * @return The value.
      */
    public int getSourceMessagePartition() {
      return source_message_partition;
    }


    /**
      * Sets the value of the 'source_message_partition' field.
      * Partition of the source message
      * @param value The value of 'source_message_partition'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setSourceMessagePartition(int value) {
      validate(fields()[8], value);
      this.source_message_partition = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'source_message_partition' field has been set.
      * Partition of the source message
      * @return True if the 'source_message_partition' field has been set, false otherwise.
      */
    public boolean hasSourceMessagePartition() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'source_message_partition' field.
      * Partition of the source message
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearSourceMessagePartition() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'source_topic' field.
      * Name of the topic the message was consumed from
      * @return The value.
      */
    public java.lang.CharSequence getSourceTopic() {
      return source_topic;
    }


    /**
      * Sets the value of the 'source_topic' field.
      * Name of the topic the message was consumed from
      * @param value The value of 'source_topic'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setSourceTopic(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.source_topic = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'source_topic' field has been set.
      * Name of the topic the message was consumed from
      * @return True if the 'source_topic' field has been set, false otherwise.
      */
    public boolean hasSourceTopic() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'source_topic' field.
      * Name of the topic the message was consumed from
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearSourceTopic() {
      source_topic = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.time.LocalDate getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder setTimestamp(java.time.LocalDate value) {
      validate(fields()[10], value);
      this.timestamp = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.bhg.common.errors.ConnectorCommonError.Builder clearTimestamp() {
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ConnectorCommonError build() {
      try {
        ConnectorCommonError record = new ConnectorCommonError();
        record.correlation_id = fieldSetFlags()[0] ? this.correlation_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.environment = fieldSetFlags()[1] ? this.environment : (com.bhg.common.errors.EnvironmentTypes) defaultValue(fields()[1]);
        record.environment_override = fieldSetFlags()[2] ? this.environment_override : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.exception = fieldSetFlags()[3] ? this.exception : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.metadata = fieldSetFlags()[4] ? this.metadata : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        record.source_message = fieldSetFlags()[5] ? this.source_message : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.source_message_schema_name = fieldSetFlags()[6] ? this.source_message_schema_name : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.source_message_offset = fieldSetFlags()[7] ? this.source_message_offset : (java.lang.Integer) defaultValue(fields()[7]);
        record.source_message_partition = fieldSetFlags()[8] ? this.source_message_partition : (java.lang.Integer) defaultValue(fields()[8]);
        record.source_topic = fieldSetFlags()[9] ? this.source_topic : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.timestamp = fieldSetFlags()[10] ? this.timestamp : (java.time.LocalDate) defaultValue(fields()[10]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ConnectorCommonError>
    WRITER$ = (org.apache.avro.io.DatumWriter<ConnectorCommonError>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ConnectorCommonError>
    READER$ = (org.apache.avro.io.DatumReader<ConnectorCommonError>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










