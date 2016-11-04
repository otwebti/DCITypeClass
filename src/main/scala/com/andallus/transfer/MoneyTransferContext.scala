package com.andallus.transfer

import com.andallus.entities.moneysociety.Account

/**
  * Created by ot on 04/11/2016.
  */
class MoneyTransferContext {


  import CanCredit._
  import CanDebit._

  def apply[T,V](source: T, target: V, amount: Int)(implicit evS : SourceAccount[T], evV : DestinationAccount[V]) : (T, V) = {

    ( evS.debit(source,amount) , evV.credit(target, amount) )

  }

}

object CanDebit {

  trait SourceAccount[T] {

    def debit(t: T, amount: Int) : T

  }

}

object CanCredit {

  trait DestinationAccount[T] {

    def credit(t: T, amount: Int) : T

  }

}
