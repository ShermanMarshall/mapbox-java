package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mapbox.geojson.BoundingBox;

import java.lang.reflect.Type;

public class BoundingBoxSerializer implements JsonSerializer<BoundingBox> {
  @Override
  public JsonElement serialize(BoundingBox src, Type typeOfSrc, JsonSerializationContext context) {

    JsonArray bbox = new JsonArray();
    bbox.add(new JsonPrimitive(src.southwest().longitude()));
    bbox.add(new JsonPrimitive(src.southwest().latitude()));
    bbox.add(new JsonPrimitive(src.northeast().longitude()));
    bbox.add(new JsonPrimitive(src.northeast().latitude()));

//    JsonArray bbox = new JsonArray();
//    bbox.add(src.southwest().longitude());
//    bbox.add(src.southwest().latitude());
//    if (src.southwest().hasAltitude()) {
//      bbox.add(src.southwest().altitude());
//    }
//    bbox.add(src.northeast().longitude());
//    bbox.add(src.northeast().latitude());
//    if (src.northeast().hasAltitude()) {
//      bbox.add(src.northeast().altitude());
//    }
//
//    System.out.println(bbox.toString());

    return bbox;
  }
}


//    double[] bbox = new double[] {
//      src.southwest().longitude(),
//      src.southwest().latitude(),
//      src.northeast().longitude(),
//      src.northeast().latitude()
//    };