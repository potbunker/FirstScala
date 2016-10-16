package org.home.deck

/**
  * Created by ubuntu on 10/16/16.
  */
class Rehydrator[S] {

  def combine(state: Any, event: Event): Any = state

  def rehydrate(events: Array[Event]): Option[Any] = events reduceLeftOption combine

}
