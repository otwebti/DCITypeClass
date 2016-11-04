package com.andallus.entities.moneySociety

import com.andallus.transferUseCase.CanCredit.DestinationAccount
import com.andallus.transferUseCase.CanDebit.SourceAccount

/**
  * Created by ot on 04/11/2016.
  */

object AccountTransfer {

  implicit object AccountDebit extends SourceAccount[Account] {
    override def debit(t: Account, amount: Int): Account = t.decreaseBalance(amount)
  }



  implicit object AccountCredit extends DestinationAccount[Account] {
    override def credit(t: Account, amount: Int): Account = t.increaseBalance(amount)
  }


}
