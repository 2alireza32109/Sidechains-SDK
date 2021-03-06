package com.horizen.serialization

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.{JsonSerializer, SerializerProvider}
import com.horizen.utils.BytesUtils
import scorex.util.ModifierId
import scorex.util.idToBytes

class ScorexModifierIdSerializer extends JsonSerializer[ModifierId] {
  override def serialize(t: ModifierId, jsonGenerator: JsonGenerator, serializerProvider: SerializerProvider): Unit = {
    jsonGenerator.writeString(BytesUtils.toHexString(idToBytes(t)))
  }
}
