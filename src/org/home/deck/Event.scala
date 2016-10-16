package org.home.deck

/**
  * Created by ubuntu on 10/16/16.
  */
abstract class Event(val id: String, val event_type: String) {

}

class EntityCreatedEvent(id: String, event_type: String) extends Event(id, event_type) {
  override def toString = f"${id}-${event_type}"
}


