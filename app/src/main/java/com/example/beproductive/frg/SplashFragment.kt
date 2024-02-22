package com.example.beproductive.frg

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.beproductive.R
import com.example.beproductive.databinding.FrgSplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class SplashFragment: Fragment() {
    var binding: FrgSplashBinding? = null
    val handler = Handler(Looper.getMainLooper())
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FrgSplashBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
        listentAppEvent()
        listentLiveData()
    }

    private fun setUpUI() {
        val alphaAnimator = ObjectAnimator.ofFloat(binding?.ivLogo, "alpha", 0f, 1f)
        alphaAnimator.duration = 2000
        alphaAnimator.start()

        handler.postDelayed({
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.ln_main, Onboarding1Fragment()).commit()
        }, 3000)



    }

    private fun listentAppEvent() {

    }

    private fun listentLiveData() {

    }
}