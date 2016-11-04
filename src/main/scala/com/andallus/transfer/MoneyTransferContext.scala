package com.andallus.transfer

import simulacrum._

/**
  * Created by ot on 04/11/2016.
  */
class MoneyTransferContext {


  import CanCredit.DestinationAccount
  import CanDebit.SourceAccount

  import DestinationAccount.ops._
  import SourceAccount.ops._

  def apply[T : SourceAccount ,V : DestinationAccount](source: T, target: V, amount: Int) : (T, V) = {
    (source.debit(amount), target.credit(amount))
  }

}

object CanDebit {

  @typeclass trait SourceAccount[T] {

    def debit(t: T, amount: Int) : T

  }

}

object CanCredit {

  @typeclass trait DestinationAccount[T] {

    def credit(t: T, amount: Int) : T

  }

}
