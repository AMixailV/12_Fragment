package ru.mixail_akulov.fragment.fragments

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.mixail_akulov.fragment.BuildConfig
import ru.mixail_akulov.fragment.R
import ru.mixail_akulov.fragment.contract.HasCustomTitle
import ru.mixail_akulov.fragment.contract.navigator
import ru.mixail_akulov.fragment.databinding.FragmentAboutBinding


class AboutFragment : Fragment(), HasCustomTitle {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = FragmentAboutBinding.inflate(inflater, container, false).apply {

//        try {
//            val pInfo = requireContext().packageManager.getPackageInfo(
//                requireContext().packageName, 0)
//            val versionName = pInfo.versionName
//            val versionCode = pInfo.versionCode
//
//            versionNameTextView.text = versionName
//            versionCodeTextView.text = versionCode.toString()
//    } catch (e: PackageManager.NameNotFoundException) {
//        e.printStackTrace()
//    }
        versionNameTextView.text = BuildConfig.VERSION_NAME
        versionCodeTextView.text = BuildConfig.VERSION_CODE.toString()

        okButton.setOnClickListener { onOkPressed() }
    }.root

    override fun getTitleRes(): Int = R.string.about

    private fun onOkPressed() {
        navigator().goBack()
    }

}