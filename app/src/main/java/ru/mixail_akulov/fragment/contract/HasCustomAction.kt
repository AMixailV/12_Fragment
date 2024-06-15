package ru.mixail_akulov.fragment.contract

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Реализуйте этот интерфейс в своем фрагменте, если вы хотите отображать
дополнительные действия на панели инструментов, пока этот фрагмент отображается пользователю.
 */
interface HasCustomAction {

    /**
     * @вернуть спецификацию настраиваемого действия, подробности см. в классе [CustomAction]
     */
    fun getCustomAction(): CustomAction

}

class CustomAction(
    @DrawableRes val iconRes: Int,
    @StringRes val textRes: Int,
    val onCustomAction: Runnable
)