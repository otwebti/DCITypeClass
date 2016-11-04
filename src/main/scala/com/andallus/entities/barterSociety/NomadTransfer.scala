package com.andallus.entities.barterSociety

import com.andallus.transferUseCase.CanCredit.DestinationAccount
import com.andallus.transferUseCase.CanDebit.SourceAccount

/**
  * Created by ot on 04/11/2016.
  */


object NomadTransfer {

  implicit object NomadDebit extends SourceAccount[Nomad] {
    override def debit(t: Nomad, amount: Int): Nomad = t.giveWater(amount)
  }

  implicit object NomadCredit extends DestinationAccount[Nomad] {
    override def credit(t: Nomad, amount: Int): Nomad = t.receiveWater(amount)
  }


}
