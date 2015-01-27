/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseResultType\",\"symbols\":[\"SUCCESS\",\"FAILURE\",\"PROFILE_RESYNC\",\"REDIRECT\"]}},{\"name\":\"profileSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"ProfileSyncResponse\",\"fields\":[{\"name\":\"responseStatus\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseStatus\",\"symbols\":[\"NO_DELTA\",\"DELTA\",\"RESYNC\"]}}],\"direction\":\"in\"},\"null\"]},{\"name\":\"configurationSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"ConfigurationSyncResponse\",\"fields\":[{\"name\":\"appStateSeqNumber\",\"type\":\"int\"},{\"name\":\"responseStatus\",\"type\":\"SyncResponseStatus\"},{\"name\":\"confSchemaBody\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"confDeltaBody\",\"type\":[\"bytes\",\"null\"]}],\"direction\":\"in\"},\"null\"]},{\"name\":\"notificationSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"NotificationSyncResponse\",\"fields\":[{\"name\":\"appStateSeqNumber\",\"type\":\"int\"},{\"name\":\"responseStatus\",\"type\":\"SyncResponseStatus\"},{\"name\":\"notifications\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Notification\",\"fields\":[{\"name\":\"topicId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"NotificationType\",\"symbols\":[\"SYSTEM\",\"CUSTOM\"]}},{\"name\":\"uid\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"seqNumber\",\"type\":[\"int\",\"null\"]},{\"name\":\"body\",\"type\":\"bytes\"}],\"direction\":\"in\"}},\"null\"]},{\"name\":\"availableTopics\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Topic\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"subscriptionType\",\"type\":{\"type\":\"enum\",\"name\":\"SubscriptionType\",\"symbols\":[\"MANDATORY\",\"OPTIONAL\"]}}],\"direction\":\"in\"}},\"null\"]}],\"direction\":\"in\"},\"null\"]},{\"name\":\"userSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"UserSyncResponse\",\"fields\":[{\"name\":\"userAttachResponse\",\"type\":[{\"type\":\"record\",\"name\":\"UserAttachResponse\",\"fields\":[{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}],\"direction\":\"in\"},\"null\"]},{\"name\":\"userAttachNotification\",\"type\":[{\"type\":\"record\",\"name\":\"UserAttachNotification\",\"fields\":[{\"name\":\"userExternalId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"endpointAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"in\"},\"null\"]},{\"name\":\"userDetachNotification\",\"type\":[{\"type\":\"record\",\"name\":\"UserDetachNotification\",\"fields\":[{\"name\":\"endpointAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"in\"},\"null\"]},{\"name\":\"endpointAttachResponses\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointAttachResponse\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"endpointKeyHash\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}],\"direction\":\"in\"}},\"null\"]},{\"name\":\"endpointDetachResponses\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointDetachResponse\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}],\"direction\":\"in\"}},\"null\"]}],\"direction\":\"in\"},\"null\"]},{\"name\":\"eventSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"EventSyncResponse\",\"fields\":[{\"name\":\"eventSequenceNumberResponse\",\"type\":[{\"type\":\"record\",\"name\":\"EventSequenceNumberResponse\",\"fields\":[{\"name\":\"seqNum\",\"type\":\"int\"}],\"direction\":\"in\"},\"null\"]},{\"name\":\"eventListenersResponses\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EventListenersResponse\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"listeners\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"null\"]},{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}],\"direction\":\"in\"}},\"null\"]},{\"name\":\"events\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"seqNum\",\"type\":\"int\"},{\"name\":\"eventClassFQN\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"eventData\",\"type\":\"bytes\"},{\"name\":\"source\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"target\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}},\"null\"]}],\"direction\":\"in\"},\"null\"]},{\"name\":\"redirectSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"RedirectSyncResponse\",\"fields\":[{\"name\":\"dnsName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"in\"},\"null\"]},{\"name\":\"logSyncResponse\",\"type\":[{\"type\":\"record\",\"name\":\"LogSyncResponse\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"result\",\"type\":\"SyncResponseResultType\"}],\"direction\":\"in\"},\"null\"]}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int requestId;
   private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType status;
   private org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse profileSyncResponse;
   private org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse configurationSyncResponse;
   private org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse notificationSyncResponse;
   private org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse userSyncResponse;
   private org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse eventSyncResponse;
   private org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse redirectSyncResponse;
   private org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse logSyncResponse;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public SyncResponse() {}

  /**
   * All-args constructor.
   */
  public SyncResponse(java.lang.Integer requestId, org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType status, org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse profileSyncResponse, org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse configurationSyncResponse, org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse notificationSyncResponse, org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse userSyncResponse, org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse eventSyncResponse, org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse redirectSyncResponse, org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse logSyncResponse) {
    this.requestId = requestId;
    this.status = status;
    this.profileSyncResponse = profileSyncResponse;
    this.configurationSyncResponse = configurationSyncResponse;
    this.notificationSyncResponse = notificationSyncResponse;
    this.userSyncResponse = userSyncResponse;
    this.eventSyncResponse = eventSyncResponse;
    this.redirectSyncResponse = redirectSyncResponse;
    this.logSyncResponse = logSyncResponse;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestId;
    case 1: return status;
    case 2: return profileSyncResponse;
    case 3: return configurationSyncResponse;
    case 4: return notificationSyncResponse;
    case 5: return userSyncResponse;
    case 6: return eventSyncResponse;
    case 7: return redirectSyncResponse;
    case 8: return logSyncResponse;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestId = (java.lang.Integer)value$; break;
    case 1: status = (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType)value$; break;
    case 2: profileSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse)value$; break;
    case 3: configurationSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse)value$; break;
    case 4: notificationSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse)value$; break;
    case 5: userSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse)value$; break;
    case 6: eventSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse)value$; break;
    case 7: redirectSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse)value$; break;
    case 8: logSyncResponse = (org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.Integer getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.Integer value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'status' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'profileSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse getProfileSyncResponse() {
    return profileSyncResponse;
  }

  /**
   * Sets the value of the 'profileSyncResponse' field.
   * @param value the value to set.
   */
  public void setProfileSyncResponse(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse value) {
    this.profileSyncResponse = value;
  }

  /**
   * Gets the value of the 'configurationSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse getConfigurationSyncResponse() {
    return configurationSyncResponse;
  }

  /**
   * Sets the value of the 'configurationSyncResponse' field.
   * @param value the value to set.
   */
  public void setConfigurationSyncResponse(org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse value) {
    this.configurationSyncResponse = value;
  }

  /**
   * Gets the value of the 'notificationSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse getNotificationSyncResponse() {
    return notificationSyncResponse;
  }

  /**
   * Sets the value of the 'notificationSyncResponse' field.
   * @param value the value to set.
   */
  public void setNotificationSyncResponse(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse value) {
    this.notificationSyncResponse = value;
  }

  /**
   * Gets the value of the 'userSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse getUserSyncResponse() {
    return userSyncResponse;
  }

  /**
   * Sets the value of the 'userSyncResponse' field.
   * @param value the value to set.
   */
  public void setUserSyncResponse(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse value) {
    this.userSyncResponse = value;
  }

  /**
   * Gets the value of the 'eventSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse getEventSyncResponse() {
    return eventSyncResponse;
  }

  /**
   * Sets the value of the 'eventSyncResponse' field.
   * @param value the value to set.
   */
  public void setEventSyncResponse(org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse value) {
    this.eventSyncResponse = value;
  }

  /**
   * Gets the value of the 'redirectSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse getRedirectSyncResponse() {
    return redirectSyncResponse;
  }

  /**
   * Sets the value of the 'redirectSyncResponse' field.
   * @param value the value to set.
   */
  public void setRedirectSyncResponse(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse value) {
    this.redirectSyncResponse = value;
  }

  /**
   * Gets the value of the 'logSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse getLogSyncResponse() {
    return logSyncResponse;
  }

  /**
   * Sets the value of the 'logSyncResponse' field.
   * @param value the value to set.
   */
  public void setLogSyncResponse(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse value) {
    this.logSyncResponse = value;
  }

  /** Creates a new SyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder();
  }
  
  /** Creates a new SyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder(other);
  }
  
  /** Creates a new SyncResponse RecordBuilder by copying an existing SyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.SyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SyncResponse>
    implements org.apache.avro.data.RecordBuilder<SyncResponse> {

    private int requestId;
    private org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType status;
    private org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse profileSyncResponse;
    private org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse configurationSyncResponse;
    private org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse notificationSyncResponse;
    private org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse userSyncResponse;
    private org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse eventSyncResponse;
    private org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse redirectSyncResponse;
    private org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse logSyncResponse;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.SyncResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.profileSyncResponse)) {
        this.profileSyncResponse = data().deepCopy(fields()[2].schema(), other.profileSyncResponse);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.configurationSyncResponse)) {
        this.configurationSyncResponse = data().deepCopy(fields()[3].schema(), other.configurationSyncResponse);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.notificationSyncResponse)) {
        this.notificationSyncResponse = data().deepCopy(fields()[4].schema(), other.notificationSyncResponse);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.userSyncResponse)) {
        this.userSyncResponse = data().deepCopy(fields()[5].schema(), other.userSyncResponse);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.eventSyncResponse)) {
        this.eventSyncResponse = data().deepCopy(fields()[6].schema(), other.eventSyncResponse);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.redirectSyncResponse)) {
        this.redirectSyncResponse = data().deepCopy(fields()[7].schema(), other.redirectSyncResponse);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.logSyncResponse)) {
        this.logSyncResponse = data().deepCopy(fields()[8].schema(), other.logSyncResponse);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.SyncResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.SyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.profileSyncResponse)) {
        this.profileSyncResponse = data().deepCopy(fields()[2].schema(), other.profileSyncResponse);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.configurationSyncResponse)) {
        this.configurationSyncResponse = data().deepCopy(fields()[3].schema(), other.configurationSyncResponse);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.notificationSyncResponse)) {
        this.notificationSyncResponse = data().deepCopy(fields()[4].schema(), other.notificationSyncResponse);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.userSyncResponse)) {
        this.userSyncResponse = data().deepCopy(fields()[5].schema(), other.userSyncResponse);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.eventSyncResponse)) {
        this.eventSyncResponse = data().deepCopy(fields()[6].schema(), other.eventSyncResponse);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.redirectSyncResponse)) {
        this.redirectSyncResponse = data().deepCopy(fields()[7].schema(), other.redirectSyncResponse);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.logSyncResponse)) {
        this.logSyncResponse = data().deepCopy(fields()[8].schema(), other.logSyncResponse);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'requestId' field */
    public java.lang.Integer getRequestId() {
      return requestId;
    }
    
    /** Sets the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setRequestId(int value) {
      validate(fields()[0], value);
      this.requestId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'requestId' field has been set */
    public boolean hasRequestId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'requestId' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearRequestId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'status' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType getStatus() {
      return status;
    }
    
    /** Sets the value of the 'status' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setStatus(org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'status' field has been set */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'status' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'profileSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse getProfileSyncResponse() {
      return profileSyncResponse;
    }
    
    /** Sets the value of the 'profileSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setProfileSyncResponse(org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse value) {
      validate(fields()[2], value);
      this.profileSyncResponse = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'profileSyncResponse' field has been set */
    public boolean hasProfileSyncResponse() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'profileSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearProfileSyncResponse() {
      profileSyncResponse = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'configurationSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse getConfigurationSyncResponse() {
      return configurationSyncResponse;
    }
    
    /** Sets the value of the 'configurationSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setConfigurationSyncResponse(org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse value) {
      validate(fields()[3], value);
      this.configurationSyncResponse = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'configurationSyncResponse' field has been set */
    public boolean hasConfigurationSyncResponse() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'configurationSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearConfigurationSyncResponse() {
      configurationSyncResponse = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'notificationSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse getNotificationSyncResponse() {
      return notificationSyncResponse;
    }
    
    /** Sets the value of the 'notificationSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setNotificationSyncResponse(org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse value) {
      validate(fields()[4], value);
      this.notificationSyncResponse = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'notificationSyncResponse' field has been set */
    public boolean hasNotificationSyncResponse() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'notificationSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearNotificationSyncResponse() {
      notificationSyncResponse = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'userSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse getUserSyncResponse() {
      return userSyncResponse;
    }
    
    /** Sets the value of the 'userSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setUserSyncResponse(org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse value) {
      validate(fields()[5], value);
      this.userSyncResponse = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'userSyncResponse' field has been set */
    public boolean hasUserSyncResponse() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'userSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearUserSyncResponse() {
      userSyncResponse = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'eventSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse getEventSyncResponse() {
      return eventSyncResponse;
    }
    
    /** Sets the value of the 'eventSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setEventSyncResponse(org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse value) {
      validate(fields()[6], value);
      this.eventSyncResponse = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'eventSyncResponse' field has been set */
    public boolean hasEventSyncResponse() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'eventSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearEventSyncResponse() {
      eventSyncResponse = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'redirectSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse getRedirectSyncResponse() {
      return redirectSyncResponse;
    }
    
    /** Sets the value of the 'redirectSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setRedirectSyncResponse(org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse value) {
      validate(fields()[7], value);
      this.redirectSyncResponse = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'redirectSyncResponse' field has been set */
    public boolean hasRedirectSyncResponse() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'redirectSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearRedirectSyncResponse() {
      redirectSyncResponse = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'logSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse getLogSyncResponse() {
      return logSyncResponse;
    }
    
    /** Sets the value of the 'logSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder setLogSyncResponse(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse value) {
      validate(fields()[8], value);
      this.logSyncResponse = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'logSyncResponse' field has been set */
    public boolean hasLogSyncResponse() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'logSyncResponse' field */
    public org.kaaproject.kaa.common.endpoint.gen.SyncResponse.Builder clearLogSyncResponse() {
      logSyncResponse = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public SyncResponse build() {
      try {
        SyncResponse record = new SyncResponse();
        record.requestId = fieldSetFlags()[0] ? this.requestId : (java.lang.Integer) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (org.kaaproject.kaa.common.endpoint.gen.SyncResponseResultType) defaultValue(fields()[1]);
        record.profileSyncResponse = fieldSetFlags()[2] ? this.profileSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.ProfileSyncResponse) defaultValue(fields()[2]);
        record.configurationSyncResponse = fieldSetFlags()[3] ? this.configurationSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.ConfigurationSyncResponse) defaultValue(fields()[3]);
        record.notificationSyncResponse = fieldSetFlags()[4] ? this.notificationSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.NotificationSyncResponse) defaultValue(fields()[4]);
        record.userSyncResponse = fieldSetFlags()[5] ? this.userSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.UserSyncResponse) defaultValue(fields()[5]);
        record.eventSyncResponse = fieldSetFlags()[6] ? this.eventSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.EventSyncResponse) defaultValue(fields()[6]);
        record.redirectSyncResponse = fieldSetFlags()[7] ? this.redirectSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse) defaultValue(fields()[7]);
        record.logSyncResponse = fieldSetFlags()[8] ? this.logSyncResponse : (org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}