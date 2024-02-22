package com.example.beproductive.frg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.beproductive.R
import com.example.beproductive.databinding.FrgOnboarding1Binding
import com.example.beproductive.databinding.FrgOnboarding2Binding
import com.example.beproductive.databinding.FrgSplashBinding

class Onboarding2Fragment: Fragment() {
    var binding: FrgOnboarding2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FrgOnboarding2Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
        listentAppEvent()
        listentLiveData()
    }

    private fun setUpUI() {

    }

    private fun listentAppEvent() {
        binding?.let { binding ->
            binding.btnNext.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.ln_main, Onboarding3Fragment()).commit()
            }
        }
    }

    private fun listentLiveData() {

    }
}