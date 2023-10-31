package com.example.listviewsample2

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class OrderConfirmDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(R.string.dialog_title)
            builder.setMessage(R.string.dialog_msg)
            builder.setPositiveButton(R.string.dialog_btn_ok, DialogButtonClicker())
            builder.setNegativeButton(R.string.dialog_btn_ng, DialogButtonClicker())
            builder.setNeutralButton(R.string.dialog_btn_nu, DialogButtonClicker())
            builder.create()
        }
        return dialog ?: throw IllegalStateException("アクティビティがnullです")
    }

    private inner class DialogButtonClicker : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface?, which: Int) {
            TODO("Not yet implemented")
        }

    }
}