package com.example.beproductive.frg

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.beproductive.R
import com.example.beproductive.databinding.FrgNoteBinding
import com.example.beproductive.databinding.FrgNoteDetailBinding
import com.example.beproductive.viewmodel.NoteDetailVM
import org.koin.android.ext.android.inject

class NoteDetailFragment: Fragment() {
    var binding: FrgNoteDetailBinding? = null
    val viewModel: NoteDetailVM by inject<NoteDetailVM>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FrgNoteDetailBinding.inflate(inflater, container, false)
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
            binding.btnChooseColor.setOnClickListener {
                val builder = AlertDialog.Builder(context)
                val inflater = LayoutInflater.from(context)
                val dialogView = inflater.inflate(R.layout.dialog_choose_color, null)
                builder.setView(dialogView)
                val alertDialog = builder.create()

                val btnClose = dialogView.findViewById<ImageButton>(R.id.btnClose)
                val btnChoose = dialogView.findViewById<Button>(R.id.btnSelect)

                btnClose.setOnClickListener {
                    alertDialog.dismiss()
                }
                alertDialog.show()

            }
        }
    }

    private fun listentLiveData() {

    }
}