package com.example.beproductive.frg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.beproductive.R
import com.example.beproductive.databinding.FrgNoteBinding

class NoteFragment: Fragment() {
    var binding: FrgNoteBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FrgNoteBinding.inflate(inflater, container, false)
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
        binding?.let {binding ->
            binding.btnPlus.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.ln_main, NoteDetailFragment()).commit()
            }
        }
    }

    private fun listentLiveData() {

    }
}