package org.home.deck

/**
  * Created by ubuntu on 10/16/16.
  */
class Rehydrator[+S] {

  def combine[I >: S](state: I, event: Event): I = state

  def rehydrate[I >: S](events: Array[Event]): Option[I] = events reduceLeftOption combine

}
