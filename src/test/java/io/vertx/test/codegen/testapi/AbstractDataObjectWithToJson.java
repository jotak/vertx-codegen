package io.vertx.test.codegen.testapi;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * @author Julien Viet
 */
@DataObject
public abstract class AbstractDataObjectWithToJson {

  public JsonObject toJson() {
    throw new UnsupportedOperationException();
  }
}
