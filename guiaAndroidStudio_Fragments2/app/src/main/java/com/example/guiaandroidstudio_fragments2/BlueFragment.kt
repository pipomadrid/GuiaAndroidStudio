package com.example.guiaandroidstudio_fragments2





import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.guiaandroidstudio_fragments2.R


class BlueFragment : Fragment() {


    private var listener: OnFragmentActionListener?=null


    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(context is OnFragmentActionListener){
            listener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnPlus).setOnClickListener {
            listener?.onClickFragmentButton()
        }

    }

}



